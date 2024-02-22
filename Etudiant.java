import java.util.ArrayList;
import java.util.List;


public class Etudiant{
    private String nom;
    private String prenom;
    private List<Note> lesNotes;

    public Etudiant(String nom, String prenom){
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getNom(){
        return this.nom;
    }

    public String getPrenom(){
        return this.prenom;
    }

}