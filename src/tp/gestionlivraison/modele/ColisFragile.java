package tp.gestionlivraison.modele;

import tp.gestionlivraison.tools.Constantes;

public class ColisFragile extends Colis{

public ColisFragile() {
	super();
	// TODO Auto-generated constructor stub
}
public ColisFragile(int num, String destinataire, String type, double poids, int dimensions, String adresse_départ,
		String adresse_arrivée) {
	super(num, destinataire, type, poids, dimensions, adresse_départ, adresse_arrivée);
}

public double tarifColis(double poids) {
		if (poids<=Constantes.POIDS_MAX1)
	{
		return Constantes.PRIX_MAX1KG + Constantes.SUPPLEMENT_FRAGILITE1KG;
	}
	if (poids<=Constantes.POIDS_MAX5)
	{
		return Constantes.PRIX_MAX5KG+Constantes.SUPPLEMENT_FRAGILITE5KG;
	}
	if (poids<=Constantes.POIDS_MAX10)
	{
		return Constantes.PRIX_MAX10KG+Constantes.SUPPLEMENT_FRAGILITE10KG;
	}
	if (poids<=Constantes.POIDS_MAX)
	{
		return Constantes.PRIX_MAXPOIDS+Constantes.SUPPLEMENT_FRAGILITEMAX;
	}
	else {
		System.out.println("le poids maximum accepté par colis est de  "+Constantes.POIDS_MAX+"kg");
		return 0;
	}
	
}
}

