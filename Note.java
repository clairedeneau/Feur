import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Note {
    private Map<Matiere, List<Double>> resultats;
    private Etudiant etudiant;


    public Note(String nomControle, Etudiant etudiant){
        this.etudiant = etudiant;
        this.resultats = new HashMap<>();
        this.resultats.put(Matiere.MATHS, new ArrayList<>());
        this.resultats.put(Matiere.ANGLAIS, new ArrayList<>());
        this.resultats.put(Matiere.BDD, new ArrayList<>());
        this.resultats.put(Matiere.JAVA, new ArrayList<>());
        this.resultats.put(Matiere.WEB, new ArrayList<>());
    }

    public Etudiant getEtudiant(){
        return this.etudiant;
    }

    public void setEtudiant(Etudiant nouvEtudiant){
        this.etudiant = nouvEtudiant;
    }

    public void AjouteNote(Matiere newMatiere, int notation){
        double laNote = notation;
        this.resultats.get(newMatiere).add(laNote);
    }

    public Double moyenneMatiere(Matiere newMatiere){
        if(this.resultats.get(newMatiere).size() == 0){
            return null;
        }
        double somme = 0;
        for(double note : this.resultats.get(newMatiere)){
            somme += note;
        }
        return somme/this.resultats.get(newMatiere).size();
    }

    public Double moyenneGenerale(){
        double somme = 0;
        int nbMatiere = 0;
        for(Matiere matiere : this.resultats.keySet()){
            if(!(moyenneMatiere(matiere) == null)){
                somme += moyenneMatiere(matiere);
                nbMatiere ++;
            }   
        }
        return somme/nbMatiere;
    }

    public Double noteLaPlusBasse(Matiere newMatiere){
        if(this.resultats.get(newMatiere).size() == 0){
            return null;
        }
        double noteMin = 20;
        for(double note : this.resultats.get(newMatiere)){
            if(note < noteMin){
                noteMin = note;
            } 
        }
        return noteMin;
    }

    public Double noteLaPlusHaute(Matiere newMatiere){
        if(this.resultats.get(newMatiere).size() == 0){
            return null;
        }
        double noteMax = 0;
        for(double note : this.resultats.get(newMatiere)){
            if(note > noteMax){
                noteMax = note;
            } 
        }
        return noteMax;
    }

    @Override
    public String toString() {
        return "Nom : " + this.etudiant.getNom()
        + "       Prenom : " + this.etudiant.getPrenom() + "\n"
        + "BDD : " + this.moyenneMatiere(Matiere.BDD) + "Détail : " + this.resultats.get(Matiere.BDD) + "\n"
        + "Java : " + this.moyenneMatiere(Matiere.JAVA) + "Détail : " + this.resultats.get(Matiere.JAVA) + "\n"
        + "Web : " + this.moyenneMatiere(Matiere.WEB) + "Détail : " + this.resultats.get(Matiere.WEB) + "\n"
        + "Anglais : " + this.moyenneMatiere(Matiere.ANGLAIS) + "Détail : " + this.resultats.get(Matiere.ANGLAIS) + "\n"
        + "Maths : " + this.moyenneMatiere(Matiere.MATHS) + "Détail : " + this.resultats.get(Matiere.MATHS) + "\n"
        + "Moyenne générale :" + this.moyenneGenerale();
    }
}

