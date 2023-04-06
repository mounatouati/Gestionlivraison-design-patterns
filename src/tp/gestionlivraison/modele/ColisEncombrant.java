package tp.gestionlivraison.modele;

import tp.gestionlivraison.tools.Constantes;

public class ColisEncombrant extends Colis{
	
	public ColisEncombrant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ColisEncombrant(int num, String destinataire, String type, double poids, int dimensions,
			String adresse_départ, String adresse_arrivée) {
		super(num, destinataire, type, poids, dimensions, adresse_départ, adresse_arrivée);
		// TODO Auto-generated constructor stub
	}

	public double tarifColis(double poids) {
		
		double poixMax = Constantes.POIDS_MAX * Constantes.RATIO_ENCOMBRANT;
		
			if (poids<=Constantes.POIDS_1KG)
		{
			return Constantes.PRIX_MAX1KG + Constantes.SUPPLEMENT_1KG;
		}
		if (poids<=Constantes.POIDS_5KG)
		{
			return Constantes.PRIX_MAX5KG+Constantes.SUPPLEMENT_5KG;
		}
		if (poids<=Constantes.POIDS_10KG)
		{
			return Constantes.PRIX_MAX10KG+Constantes.SUPPLEMENT_10KG;
		}
		if (poids<=poixMax)
		{
			return Constantes.PRIX_MAX10KG+Constantes.SUPPLEMENT_MAX;
		}
		else {
			System.out.println("Poids Max autoriser est "+poixMax);
			
			return 0;
				}
}
}