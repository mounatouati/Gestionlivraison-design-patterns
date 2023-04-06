package tp.gestionlivraison.modele;

import tp.gestionlivraison.tools.Constantes;

public class ColisStandard extends Colis{

	public ColisStandard() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ColisStandard(int num, String destinataire, String type, double poids, int dimensions,
			String adresse_départ, String adresse_arrivée) {
		super(num, destinataire, type, poids, dimensions, adresse_départ, adresse_arrivée);
		// TODO Auto-generated constructor stub
	}
	@Override
	public double tarifColis(double poids) {
		
			if (poids<=Constantes.POIDS_MAX1)
			{
				return Constantes.PRIX_MAX1KG;
			}
			if (poids<=Constantes.POIDS_MAX5)
			{
				
				return Constantes.PRIX_MAX5KG ;
			}
			if (poids<=Constantes.POIDS_MAX10)
			{
				return Constantes.PRIX_MAX10KG;
			}
			if (poids<=Constantes.POIDS_MAX)
			{
				return Constantes.PRIX_MAXPOIDS;
			}
			else 
			{
				System.out.println("Poids Max autoriser est "+Constantes.POIDS_MAX);
				return 0;
			}
	}
	}

