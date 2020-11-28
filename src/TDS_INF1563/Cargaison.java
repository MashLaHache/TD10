package TDS_INF1563;

public abstract class Cargaison {

    public abstract   double  getLimitePoids();
    public abstract double  getLimiteVolume();
    public abstract int getCompteMarchandises();

    protected double poidsTotal;
    protected double volumeTotal;
    protected int distance;
    protected int nombreMarchandises;

    public Cargaison(int distance) {
        this.distance = distance;
        this.poidsTotal=0;
        this.volumeTotal=0;
        this.nombreMarchandises = 0;
    }

    public boolean ajouter(Marchandise m) {
        poidsTotal += m.getPoids();
        volumeTotal += m.getVolume();
        nombreMarchandises +=1;

        return  poidsTotal <= getLimitePoids() && volumeTotal <= getLimiteVolume();
    }
}
