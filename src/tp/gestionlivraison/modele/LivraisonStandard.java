package tp.gestionlivraison.modele;

import tp.gestionlivraison.tools.Constantes;

public class LivraisonStandard implements TarifLivraison {
	
	
	public double calculTarifLivraison(double tarifcolis ,String destination) {
		if (destination.equalsIgnoreCase("France"))
		{
			return tarifcolis + Constantes.STAND_FRANCE;
		}
		if (destination.equalsIgnoreCase("Europe")) 
		{
			return tarifcolis + Constantes.STAND_EUROPE;
		}else {
		return tarifcolis + Constantes.STAND_MONDE;
		
		}
	}

}
