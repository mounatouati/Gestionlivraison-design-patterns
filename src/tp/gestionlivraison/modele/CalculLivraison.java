package tp.gestionlivraison.modele;



public class CalculLivraison {
private TarifLivraison tarifLivraison;
private static CalculLivraison instance ;


private CalculLivraison(TarifLivraison tarifLivraison) {};

public static void setInstance(CalculLivraison instance) {
	CalculLivraison.instance = instance;
}

public static CalculLivraison getInstance(TarifLivraison tarifLivraison) {
	if (instance == null) {
        instance = new CalculLivraison(tarifLivraison);
     }
     return instance;
}

public double CalculPrixLivraison(double tarifcolis,String destinations) {
	return tarifLivraison.calculTarifLivraison(tarifcolis,destinations);
}

public TarifLivraison getTarifLivraison() {
	return tarifLivraison;
}


public void setTarifLivraison(TarifLivraison tarifLivraison) {
	this.tarifLivraison = tarifLivraison;
}

}
