package tp.gestionlivraison.main;


import java.util.Scanner;

import tp.gestionlivraison.modele.CalculLivraison;
import tp.gestionlivraison.modele.Colis;
import tp.gestionlivraison.modele.ColisEncombrant;
import tp.gestionlivraison.modele.ColisFragile;
import tp.gestionlivraison.modele.ColisStandard;
import tp.gestionlivraison.modele.LivraisonEco;
import tp.gestionlivraison.modele.LivraisonExpress;
import tp.gestionlivraison.modele.LivraisonStandard;
import tp.gestionlivraison.modele.TarifLivraison;
import tp.gestionlivraison.tools.Constantes;

public class Main {

	public static void main(String[] args) {
		Menu1();
		Scanner scanner = new Scanner(System.in);
	  	String choix =scanner.nextLine();
	  	 try {
	      switch (choix.toUpperCase()) {
	      
	        case "S":{	    
	        	System.out.print("Poids : ");
		        double poids = scanner.nextInt();
		        
		        if (poids>Constantes.POIDS_MAX) {
		        	System.out.println("Poids max ="+Constantes.POIDS_MAX);
		        	System.out.print("Poids : ");
		        	poids = scanner.nextInt();     
		        }
		        System.out.print("Dimensions : ");
		        System.out.print("Longueur  : ");  
		        double longueur = scanner.nextInt();
		        System.out.print("Largeur : ");
		        double largeur = scanner.nextInt();
		        System.out.print("Hauteur : ");
		        double hauteur = scanner.nextInt();
		        double dimensions=longueur+largeur+hauteur;
		        if (dimensions>Constantes.DIMENSION_MAX) {
		        	System.out.println("Dimensions (longueur + largeur + hauteur) ne doit pas excéder 150 cm");
		        	System.out.print("Dimensions : ");
				    System.out.print("Longueur  : ");  
				    longueur = scanner.nextInt();
				    System.out.print("Largeur : ");
				    largeur = scanner.nextInt();
				    System.out.print("Hauteur : ");
				    hauteur = scanner.nextInt();
				    dimensions=longueur+largeur+hauteur;
		        } 
		        Colis colis = new ColisStandard();
			 		double p = colis.tarifColis(poids);
		        	Prixlivraisons(p);
	        	break;	}
	       
	        case "E":{
	        	System.out.print("Poids : ");
		        int poids = scanner.nextInt();
		        
		        if (poids > Constantes.POIDS_MAX*Constantes.RATIO_ENCOMBRANT) {
		        	System.out.println("Poids max ="+Constantes.POIDS_MAX*Constantes.RATIO_ENCOMBRANT);
		        	System.out.print("Poids : ");
		        	poids = scanner.nextInt();     
		        }
		        System.out.print("Dimensions : ");
		        System.out.print("Longueur  : ");  
		        double longueur = scanner.nextInt();
		        System.out.print("Largeur : ");
		        double largeur = scanner.nextInt();
		        System.out.print("Hauteur : ");
		        double hauteur = scanner.nextInt();
		        double dimensions=longueur+largeur+hauteur;
		        if (dimensions > Constantes.DIMENSION_MAXENCOMBRANT  || dimensions<Constantes.DIMENSION_MINENCOMBRANT) {
		        	System.out.println("Dimensions (longueur + largeur + hauteur)  doit être compris entre 150 et 200 cm");
		        	System.out.print("Dimensions : ");
				    System.out.print("Longueur  : ");  
				    longueur = scanner.nextInt();
				    System.out.print("Largeur : ");
				    largeur = scanner.nextInt();
				    System.out.print("Hauteur : ");
				    hauteur = scanner.nextInt();
				    dimensions=longueur+largeur+hauteur;
		        } 
		        Colis colis = new ColisEncombrant();
		 		double p = colis.tarifColis(poids);
	        	Prixlivraisons(p);
	          break;}
	        case "F":{
	        	System.out.print("Poids : ");
		        int poids = scanner.nextInt();
		        if (poids>Constantes.POIDS_MAX) {
		        	System.out.println("Poids max ="+Constantes.POIDS_MAX);
		        	System.out.print("Poids : ");
		        	poids = scanner.nextInt();     
		        }
		        System.out.print("Dimensions : ");
		        System.out.print("Longueur  : ");  
		        double longueur = scanner.nextInt();
		        System.out.print("Largeur : ");
		        double largeur = scanner.nextInt();
		        System.out.print("Hauteur : ");
		        double hauteur = scanner.nextInt();
		        double dimensions=longueur+largeur+hauteur;
		        if (dimensions>Constantes.DIMENSION_MAX) {
		        	System.out.println("Dimensions (longueur + largeur + hauteur) ne doit pas excéder 150 cm");
		        	System.out.print("Dimensions : ");
				    System.out.print("Longueur  : ");  
				    longueur = scanner.nextInt();
				    System.out.print("Largeur : ");
				    largeur = scanner.nextInt();
				    System.out.print("Hauteur : ");
				    hauteur = scanner.nextInt();
				    dimensions=longueur+largeur+hauteur;
		        } 
		        Colis colis = new ColisFragile();
		 		double p = colis.tarifColis(poids);
	        	Prixlivraisons(p);
		          break;}
	        default:
	          System.out.println("Choix invalide.");
	      }	      
	  	 }catch (Exception e) {
	            System.out.println("Exception thrown: Erreur saisie " + e);
	        }
	  }
    public static void Menu1() {
		System.out.println("\033[43m\033[30;1m+==================================================================================+");
		System.out.println("|                            Gestion de livraison de colis                         |");
		//System.out.println("+===================================================================================+");
		System.out.println("\033[43m\033[30;1m+==================================================================================+");
			System.out.println("|     Colis Standard(S)       |   Colis Encombrant(E)  |     Colis Fragile,(F)     |");
		System.out.println("+==================================================================================+\033[0m\033[0m");
		//System.out.println("+===============================================================================================================+");		
	}
	public static void Menu2() {
		System.out.println("\033[43m\033[30;1m+==================================================================================+");
		System.out.println("|                                 type de livraison                                |");
		//System.out.println("+===================================================================================+");
		System.out.println("\033[43m\033[30;1m+==================================================================================+");
			System.out.println("|   Livraison Standard(S)    |   Livraison Express(Ex)  |     Livraison Eno(E)     |");
		System.out.println("+==================================================================================+\033[0m\033[0m");
		//System.out.println("+===============================================================================================================+");		
	}
	public static void Menu3() {
		System.out.println("\033[43m\033[30;1m+==================================================================================+");
			System.out.println("|            France (F)      |      Europe (E)     |        Monde  (M)             |");
		System.out.println("+==================================================================================+\033[0m\033[0m");
		//System.out.println("+===============================================================================================================+");		
	}
	private static void Prixlivraisons(double t) 
	{
		    Menu2();
		   try {
			Scanner scanner = new Scanner(System.in);
			String choix =scanner.nextLine();
		      switch (choix.toUpperCase()) 
		      {
		        case "S":{
		        	//**********  Livraisons standard ********
		        Menu3();
		        TarifLivraison tariflivraison =  new LivraisonStandard();
		        CalculLivraison instance =CalculLivraison.getInstance(tariflivraison);
		 //TarifLivraison tarifS=new LivraisonStandard();
		 		instance.setTarifLivraison(tariflivraison);
		 		//double c = instance.CalculPrixLivraison(t, "France");
		 		//System.out.println(c);
		 		//System.out.println("Prix :" +t+" Euro");
		 		//Scanner scanner = new Scanner(System.in);
				String choix2 =scanner.nextLine();
		 		switch (choix2.toUpperCase()) 
		 	      {
		 	        case "F":{ 
		 	    	double prixlivraison = instance.CalculPrixLivraison(t, "France");
		 	 		System.out.println("Prix de Livraison : "+prixlivraison);
		 	 		//System.out.println("Prix :" +t+" Euro");
		 	 		break;}
		 	        case "E":{
		 	        double prixlivraison = instance.CalculPrixLivraison(t, "Europe");
			 	 	System.out.println("Prix de Livraison : "+prixlivraison);
			 	 	 break;}
		 	        case "M":{
		 	        double prixlivraison = instance.CalculPrixLivraison(t, "Europe");
				 	System.out.println("Prix de Livraison : "+prixlivraison);
				 	 break;}
		 	        default:
		 	          System.out.println("Choix invalide.");
		 	      }
		          break;}
		        case "EX":{
		        	//**********  Livraisons Express ********
		            Menu3();
			        TarifLivraison tariflivraison =  new LivraisonExpress();
			        CalculLivraison instance =CalculLivraison.getInstance(tariflivraison);
			 //TarifLivraison tarifS=new LivraisonStandard();
			 		instance.setTarifLivraison(tariflivraison);
			 		//double c = instance.CalculPrixLivraison(t, "France");
			 		//System.out.println(c);
			 		//System.out.println("Prix :" +t+" Euro");
			 		String choix3 =scanner.nextLine();
			 		switch (choix3.toUpperCase()) 
			 	      {
			 	        case "F":{ 
			 	    	double prixlivraison = instance.CalculPrixLivraison(t, "France");
			 	 		System.out.println("Prix de Livraison : "+prixlivraison);
			 	 		//System.out.println("Prix :" +t+" Euro");
			 	 		break;}
			 	        case "E":{
			 	        double prixlivraison = instance.CalculPrixLivraison(t, "Europe");
				 	 	System.out.println("Prix de Livraison : "+prixlivraison);
				 	 	 break;}
			 	        case "M":{
			 	        double prixlivraison = instance.CalculPrixLivraison(t, "Monde");
					 	System.out.println("Prix de Livraison : "+prixlivraison);
					 	 break;}
			 	        default:
			 	          System.out.println("Choix invalide.");
			 	      }
		          break;}
		        case "E":{
		        	//**********  Livraisons Economique ********
		            Menu3();
			        TarifLivraison tariflivraison =  new LivraisonEco();
			        CalculLivraison instance =CalculLivraison.getInstance(tariflivraison);
			 		instance.setTarifLivraison(tariflivraison);
			 			switch (choix.toUpperCase()) 
			 	      {
			 	        case "F":{ 
			 	    	double prixlivraison = instance.CalculPrixLivraison(t, "France");
			 	 		System.out.println("Prix de Livraison : "+prixlivraison);
			 	 		//System.out.println("Prix :" +t+" Euro");
			 	 		break;}
			 	        case "E":{
			 	        double prixlivraison = instance.CalculPrixLivraison(t, "Europe");
				 	 	System.out.println("Prix de Livraison : "+prixlivraison);
				 	 	 break;}
			 	        case "M":{
			 	        double prixlivraison = instance.CalculPrixLivraison(t, "Monde");
					 	System.out.println("Prix de Livraison : "+prixlivraison);
					 	 break;}
			 	        default:
			 	          System.out.println("Choix invalide.");
			 	      }
		        	break;}
		        default:
		          System.out.println("Choix invalide.");
		      }
	 }catch (Exception e) {
         System.out.println("Exception thrown: Erreur saisie " + e);
     }
	}
}
