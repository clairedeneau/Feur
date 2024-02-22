import java.util.List;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Horaire {
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private List<Salle> liSalle;
    private List<Cours> liCours;

    public Horaire(LocalDateTime startDate, LocalDateTime endDate){
        this.startDate = startDate;
        this.endDate = endDate;
        this.liSalle = new ArrayList<>();
        this.liCours = new ArrayList<>();
    }

    public LocalDateTime getStartDate(){
        return this.startDate;
    }

    public LocalDateTime getEndDate(){
        return this.endDate;
    }

    public void ajoutCours(Cours cours){
        this.liCours.add(cours);
    }

    public void ajoutSalle(Salle salle){
        this.liSalle.add(salle);
    }

    
    
}
