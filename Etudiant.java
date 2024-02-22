import java.util.ArrayList;
import java.util.List;


public class Etudiant{
    private String nom;
    private String prenom;
    private List<Note> lesNotes;

    public Etudiant(String nom, String prenom){
        this.nom = nom;
        this.prenom = prenom;
        this.lesNotes = new ArrayList<>();
    }

    public String getNom(){
        return this.nom;
    }

    public String getPrenom(){
        return this.prenom;
    }

    public List<Note> getNotes(){
        return this.lesNotes;
    }

    // public void ajouteNote(){ je ferai quand note sera fait
    //     this.lesNotes.add();
    // }

}