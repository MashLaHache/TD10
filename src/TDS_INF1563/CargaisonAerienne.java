package TDS_INF1563;

public class CargaisonAerienne extends Cargaison {

    public static final double LIMITE_POIDS = 1530;
    public static final double LIMITE_VOL = 4.3;
    public static final double COUT_VIDE = 800;
    public static final double COUT_PAR_TONNE = 0.9;

    public  double  getLimitePoids(){
        return LIMITE_POIDS;
    }

    public double  getLimiteVolume() {
        return LIMITE_VOL;
    }

    public int getCompteMarchandises() {
        return this.nombreMarchandises;
    }

    public CargaisonAerienne(int distance) {
        super(distance);
    }

    public double coutTransport() {
        return COUT_VIDE + distance * (COUT_PAR_TONNE * (poidsTotal/1000));
    }
}
