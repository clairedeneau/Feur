public class User {
    private String name;
    private Cours cours;

    public User(String name, Cours cours){
        this.cours = cours;
        this.name = name;
    }

    public Cours getCours(){
        return this.cours;
    }

    public String getnName(){
        return this.name;
    }

    public void setName(String nom){
        this.name = nom;
    }


    @Override

    public String toString(){
        return "Nom utilisateur: " + this.name + ", cours utilisateur: " + this.cours;
    }
    
}
