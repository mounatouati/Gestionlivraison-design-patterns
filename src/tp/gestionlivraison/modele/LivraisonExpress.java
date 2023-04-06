package tp.gestionlivraison.modele;

import tp.gestionlivraison.tools.Constantes;

public class LivraisonExpress implements TarifLivraison{
	
	
	public double calculTarifLivraison(double tarifcolis ,String destination) {
		if (destination.equalsIgnoreCase("France"))
		{
			return tarifcolis + Constantes.EXPRESS_FRANCE;
		}
		if (destination.equalsIgnoreCase("Europe")) 
		{
			return tarifcolis + Constantes.EXPRESS_EUROPE;
		}else {
		return tarifcolis + Constantes.EXPRESS_MONDE;
		
		}
	}

}
