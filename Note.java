import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Note {
    private Map<Matiere, List<Integer>> resultats;
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
        Integer laNote = notation;
        this.resultats.get(newMatiere).add(laNote);
    }

    public double 

}

