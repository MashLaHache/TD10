package TDS_INF1563;

public class CargaisonRoutiere extends Cargaison {

    public static final double LIMITE_POIDS = 11000;
    public static final double LIMITE_VOL = 19;
    public static final double COUT_VIDE = 2.1;
    public static final double COUT_PAR_TONNE = 0.3;

    public  double  getLimitePoids(){
        return LIMITE_POIDS;
    }

    public double  getLimiteVolume() {
        return LIMITE_VOL;
    }

    public int getCompteMarchandises() {
        return this.nombreMarchandises;
    }

    public CargaisonRoutiere(int distance) {
        super(distance);
    }

    public boolean ajouter(Marchandise m) {
        poidsTotal += m.getPoids();
        volumeTotal += m.getVolume();
        nombreMarchandises +=1;

        return  poidsTotal <= getLimitePoids() && volumeTotal <= getLimiteVolume();
    }

    public double coutTransport() {
        return distance * (COUT_VIDE + COUT_PAR_TONNE * (poidsTotal/1000));
    }
}
