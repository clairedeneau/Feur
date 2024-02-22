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
}