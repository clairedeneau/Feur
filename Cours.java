public class Cours{
    private User user;
    private Matiere matiere;
    private Groupe groupe;
    private Horaire horaire;
    
    public Cours(User user, Matiere matiere, Horaire horaire, Groupe groupe) {
        this.matiere = matiere;
        this.horaire = horaire;
        this.user = user;
        this.groupe = groupe;
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User newUser) {
        this.user = newUser;
    }

    public Matiere getMatiere() {
        return this.matiere;
    }

    public void setMatiere(Matiere matiere) {
        this.matiere = matiere;
    }

    public Groupe getGroupe(String nom) {
        return this.groupe;
    }

    public void setGroupe(Groupe groupe) {
        this.groupe = groupe;
    }

    public Horaire getHoraire() {
        return horaire;
    }

    public void setHoraire(Horaire horaire) {
        this.horaire = horaire;
    }
}