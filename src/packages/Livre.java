package packages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


class Livre implements Comparable<Livre>, Cloneable {
    private String titre;
    private String auteur;
    private double prix;
    private int nbPages;

    private static int nbLivresCrees = 0;
    private static List<Double> listePrix = new ArrayList<>();
    private static double prixMax ;
    private static double prixMin;

    public Livre(String titre, String auteur, double prix, int nbPages) {
        this.titre = titre;
        this.auteur = auteur;
        this.prix = prix;
        this.nbPages = nbPages;

        nbLivresCrees++;
        listePrix.add(prix);
    }

    @Override
    public int compareTo(Livre autreLivre) {
        return Double.compare(this.prix, autreLivre.prix);
    }

    
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    
    @Override
    public String toString() {
        return " [titre=" + titre + ", auteur=" + auteur + ", prix=" + prix + ", nombreDePages=" + nbPages + "]";
    }

    public void afficher() {
        System.out.println("Type: Livre, " + toString());
    }


   

    public static int getNbLivresCrees() {
        return nbLivresCrees;
    }

    public static double getPrixMax() {
    	if (listePrix.isEmpty()) {
            return 0.0; 
        }
    	prixMax=Collections.max(listePrix);
        return prixMax;
    }

    public static double getPrixMin() {
    	
    	if (listePrix.isEmpty()) {
            return 0.0; 
        }
    	prixMin=Collections.max(listePrix);
        return prixMin;    }
}



