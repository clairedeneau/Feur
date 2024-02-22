public class Matiere {
    COMÉDIE,
    TRAGÉDIE,
    DRAME;
    
    public String toString() {
        if (this == COMÉDIE)
            return "COMEDIE";
        else if (this == TRAGÉDIE)
            return "TRAGEDIE";
        else {
            assert this == DRAME;
            return "DRAME";
            }
    }
}

