public class Salle{
    private String name;
    private Horaire horaire;

    public Salle(String name, Horaire horaire){
        this.name = name;
        this.horaire = horaire;
    }

    public getName(){
        return this.name;
    }

    public getHoraire(){
        return this.horaire;
    }

    
}