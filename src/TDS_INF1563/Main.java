package TDS_INF1563;

public class Main {

    public static void main(String[] args) {

        //Creation de marchandise
        Marchandise farine = new Marchandise("farine", 4000, 8);
        Marchandise ceramique = new Marchandise("carrelage en ceramique", 5000, 2.5);
        Marchandise pneus = new Marchandise("pneus hiver Michelin", 800, 8);
        Marchandise lego = new Marchandise("Lego", 1000, 2.8);
        Marchandise bacon = new Marchandise("Bacon", 500, 0.9);
        Marchandise banane = new Marchandise("caisse de bananes", 12000, 14);
        //Creation de Cargo commande
        CargaisonRoutiere commande1 = new CargaisonRoutiere(1200);
        CargaisonAerienne commandeAerienne1 = new CargaisonAerienne(3000);
        CargaisonMaritime commandeMaritime1 = new CargaisonMaritime(4000);

        //Tests
        if (commande1.ajouter(farine) && commande1.ajouter(ceramique) && commande1.ajouter(pneus))
            System.out.println("commande1: ajout reussi");
        else System.out.println("commande1: ajout non reussi");

        if (commandeAerienne1.ajouter(lego) && commandeAerienne1.ajouter(bacon))
            System.out.println("commandeAerienne1: ajout reussi");
        else System.out.println("commandeAerienne1: ajout non reussi");

        if (commandeMaritime1.ajouter(banane) && commandeMaritime1.ajouter(banane))
            System.out.println("commandeMaritime1: ajout reussi");
        else System.out.println("commandeMaritime1: ajout non reussi");

        //Afficher couts
        System.out.println(commande1.coutTransport());
        System.out.println(commandeAerienne1.coutTransport());
        System.out.println(commandeMaritime1.coutTransport());
    }
}
