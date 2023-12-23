package packages;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class Main {
	 public static void main(String[] args) {
	        // 1. Déclarer un tableau contenant deux Livres et deux Romans 
	        Livre livre1 = new Livre("Titre1", "Auteur1", 25.99, 300);
	        Livre livre2 = new Livre("Titre2", "Auteur2", 19.99, 250);
	        Roman roman1 = new Roman("Roman1", "Auteur3", 35.99, 400, "Maison1", 500);
	        Roman roman2 = new Roman("Roman2", "Auteur4", 29.99, 350, "Maison2", 400);

	        Livre[] tableauLivres = {livre1, livre2, roman1, roman2};

	        // 2. À l'aide de la boucle for, afficher les informations des livres et des romans
	        for (Livre livre : tableauLivres) {
	            livre.afficher();
	        }

	        // 3. Trier le tableau par prix, afficher à nouveau le tableau
	        Arrays.sort(tableauLivres);
	        System.out.println(" Après tri par prix :");
	        for (Livre livre : tableauLivres) {
	            livre.afficher();
	        }

	        // 4. Ajouter un nouveau livre (de votre choix)
	        System.out.println("Ajout d'un élément");
	          //Livre nouveauLivre = new Livre("NouveauLivre", "NouvelAuteur", 39.99, 450);
	        List<Livre> list = new ArrayList<>(Arrays.asList(tableauLivres));
			list.add(new Livre("NouveauLivre", "NouvelAuteur", 39.99, 450));
			tableauLivres = list.toArray(new Livre[list.size()]);
			 for (Livre livre : tableauLivres) {
		            livre.afficher();
		        }


	        // 5. Supprimer le premier livre dans le tableau
		        System.out.println("premier élement supprimé");
		    List<Livre> liste = new ArrayList<>(Arrays.asList(tableauLivres));
			liste.remove(0);
			tableauLivres = liste.toArray(new Livre[liste.size()]);
			 for (Livre livre : tableauLivres) {
		            livre.afficher();
		        }

	        // 6. Copiez le tableau des Livres (déjà créé) dans un nouveau tableau
	        Livre[] copieTableauLivres = Arrays.copyOf(tableauLivres, tableauLivres.length);

	        // 7. Inverser les éléments du tableau des livres
	        System.out.println("Tableau inversé");
	        List<Livre> listinverse = new ArrayList<>(Arrays.asList(tableauLivres));
	        Collections.reverse(listinverse);
			tableauLivres = listinverse.toArray(new Livre[liste.size()]);
			 for (Livre livre : tableauLivres) {
		            livre.afficher();
		        }
	        System.out.println("\nNombre total de livres : " + Livre.getNbLivresCrees());
	        System.out.println("Prix max des livres : " + Livre.getPrixMax());
	        System.out.println("Prix min des livres : " + Livre.getPrixMin());
	    }

}
	 