package TDS_INF1563;

public class Marchandise {

    private String description;
    private double poids ;
    private double volume ;

    public Marchandise (String description, double poids, double volume) {
        this.description = description;
        this.poids = poids ;
        this.volume = volume ;
    }

    public String getDescription() {// retourne la description
        return description ;
    }

    public double getPoids () {// retourne le poids en kg
        return poids ;
    }

    public double getVolume () {// retourne le volume en m3
        return volume ;
    }

    @Override
    public String toString(){
        return description +"("+ poids + "kg, "+volume+"m3)";
    }
}
