import java.util.List;
import java.util.ArrayList;

public class Cours{
    private List<User> liUser;
    private Matiere matiere;
    private List<Groupe> liGroupe;
    private Horaire horaire;
    
    public Cours(Matiere matiere, Horaire horaire) {
        this.matiere = matiere;
        this.horaire = horaire;
        this.liUser = new ArrayList<>();
        this.liGroupe = new ArrayList<>();
    }

    public User getUser(String nom) {
        for (User user : this.liUser){
            if (nom == user.getName()){
                return user;
            }
        }
        return null;
    }

    public void ajouteUser(User user) {
        this.liUser.add(user);
    }

    public Matiere getMatiere() {
        return this.matiere;
    }

    public void setMatiere(Matiere matiere) {
        this.matiere = matiere;
    }

    public Groupe getGroupe(String nom) {
        for (Groupe groupe : this.liGroupe){
            if (nom = groupe.getNom()){
                return groupe;
            }
        }
        return null;
    }

    public void ajouteGroupe(Groupe groupe) {
        this.liGroupe.add(groupe);
    }

    public Horaire getHoraire() {
        return horaire;
    }

    public void setHoraire(Horaire horaire) {
        this.horaire = horaire;
    }
}