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

    
}
