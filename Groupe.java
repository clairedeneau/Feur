import java.util.ArrayList;
import java.util.List;

public class Groupe {
    private List<Cours> liCours;
    private List<Etudiant> liEtudiant; 
    private String nomGroupe;

    public Groupe(String nomGroupe){
        this.nomGroupe = nomGroupe;
        this.liCours = new ArrayList<>();
        this.liEtudiant = new ArrayList<>();
    }

    public String getNomGroupe(){
        return this.nomGroupe;
    }

    public List<Cours> getLiCours(){
        return this.liCours;
    }

    public void setLiCours(List<Cours> liCours){
        this.liCours = liCours;
    }

    public List<Etudiant> getLiEtudiant(){
        return liEtudiant;
    }

    public void setLiEtudiant(List<Etudiant> liEtudiant){
        this.liEtudiant = liEtudiant;
    }

    public void setNomGroupe(String nomGroupe){
        this.nomGroupe = nomGroupe;
    }

    public void ajouteEtudiant(String nomGroupe, String nomEtu, String prenomEtu){
        this.liEtudiant.add(new Etudiant(nomEtu, prenomEtu));
    }

    public void ajouteCours(Matiere matiere, Horaire horaire){
        this.liCours.add(new Cours(matiere, horaire));
    }

}
