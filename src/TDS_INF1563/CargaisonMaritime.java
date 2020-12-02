package TDS_INF1563;

public class CargaisonMaritime extends Cargaison {

    public static final double LIMITE_POIDS = 30000;
    public static final double LIMITE_VOL = 30;
    public static final double COUT_PAR_TONNE = 0.12;

    public double getLimitePoids() {
        return LIMITE_POIDS;
    }

    public double getLimiteVolume() {
        return LIMITE_VOL;
    }

    public int getCompteMarchandises() {
        return this.nombreMarchandises;
    }

    public CargaisonMaritime(int distance) {
        super(distance);
    }

    public double coutTransport() {
        return distance * (COUT_PAR_TONNE * (poidsTotal/1000));
    }
}
