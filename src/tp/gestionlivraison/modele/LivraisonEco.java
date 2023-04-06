package tp.gestionlivraison.modele;

import tp.gestionlivraison.tools.Constantes;

public class LivraisonEco implements TarifLivraison{
	
@Override	
	public double calculTarifLivraison(double tarifcolis ,String destination) {
		if (destination.equalsIgnoreCase("France"))
		{
			return tarifcolis + Constantes.ECO_FRANCE;
		}
		if (destination.equalsIgnoreCase("Europe")) 
		{
			return tarifcolis + Constantes.ECO_EUROPE;
		}else {
		return tarifcolis + Constantes.ECO_MONDE;
		
		}
	}
}
