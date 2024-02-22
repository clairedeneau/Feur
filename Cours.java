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
            if (nom = user.getName()){
                return user;
            }
        }
        return null;
    }

    public void setLiUser(List<User> liUser) {
        this.liUser = liUser;
    }

    public Matiere getMatiere() {
        return matiere;
    }

    public void setMatiere(Matiere matiere) {
        this.matiere = matiere;
    }

    public List<Groupe> getLiGroupe() {
        return liGroupe;
    }

    public void setLiGroupe(List<Groupe> liGroupe) {
        this.liGroupe = liGroupe;
    }

    public Horaire getHoraire() {
        return horaire;
    }

    public void setHoraire(Horaire horaire) {
        this.horaire = horaire;
    }
}