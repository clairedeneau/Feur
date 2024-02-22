public enum Matiere {
    ANGLAIS,
    MATHS,
    BDD,
    JAVA,
    WEB;
    
    public String toString() {
        if (this == ANGLAIS)
            return "ANGLAIS";
        else if (this == MATHS)
            return "MATHS";
        else if (this == BDD)
            return "BDD";
        else if (this == JAVA)
            return "JAVA";
        else {
            assert this == WEB;
            return "WEB";
            }
    }
}

