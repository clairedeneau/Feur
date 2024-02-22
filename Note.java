import java.util.List;

import javax.naming.LimitExceededException;

import java.util.ArrayList;

public class Note {
    private String nomControle;
    private Etudiant etudiant;
    private List<Matiere> liMatiere;

    Note(String nomControle, Etudiant etudiant){
        this.nomControle = nomControle;
        this.etudiant = etudiant;
        this.liMatiere = new ArrayList<>();
    }

    public String getNomControle(){
        return this.nomControle;
    }

    public Etudiant getEtudiant(){
        return this.etudiant;
    }

    public List<Matiere> getMatiere(){
        return this.liMatiere;
    }

    public void setNomControle(String nouvNomControle){
        this.nomControle = nouvNomControle;
    }

    public void setEtudiant(Etudiant nouvEtudiant){
        this.etudiant = nouvEtudiant;
    }

    public void setLiMatiere(List<Matiere> nouvLiMatiere){
        this.liMatiere = nouvLiMatiere;
    }

    public void AjouteLiMatiere(Matiere newMatiere){
        if(liMatiere.contains(newMatiere)){
            liMatiere.add(newMatiere);
        }
    }



}

