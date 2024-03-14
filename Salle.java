import java.util.List;
import java.util.ArrayList;

public class Salle{
    private String name;
    private List<Cours> cours;
    private int capacite;

    public Salle(String name){
        this.name = name;
        this.cours = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    /*public Cours getCours(){
        return this.cours;
    }**/

    public void setName(String name) {
        this.name = name;
    }

    public void ajoutCours(Cours cours) {
        this.cours.add(cours);
    }

    public int getCapacite() {
        return this.capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

}