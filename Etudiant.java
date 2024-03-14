public class Etudiant{
    private String nom;
    private String prenom;
    private Note lesNotes;

    public Etudiant(String nom, String prenom, Note bulletin){
        this.nom = nom;
        this.prenom = prenom;
        this.lesNotes = bulletin;
    }

    public String getNom(){
        return this.nom;
    }

    public String getPrenom(){
        return this.prenom;
    }

    public Note getNotes(){
        return this.lesNotes;
    }

}
