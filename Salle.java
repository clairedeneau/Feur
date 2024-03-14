public class Salle{
    private String name;
    private Horaire horaire;
    private int capacite;

    public Salle(String name, Horaire horaire){
        this.name = name;
        this.horaire = horaire;
    }

    public String getName(){
        return this.name;
    }

    public Horaire getHoraire(){
        return this.horaire;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHoraire(Horaire horaire) {
        this.horaire = horaire;
    }

    public int getCapacite() {
        return this.capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

}
