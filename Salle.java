public class Salle{
    private String name;
    private Horaire horaire;

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

    
}