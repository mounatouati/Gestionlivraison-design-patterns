package tp.gestionlivraison.modele;

public abstract class Colis {
	int num;
	String destinataire;
	String type;
	double poids;
	int dimensions;
	String adresse_départ;
	String adresse_arrivée;
	public Colis() {
		super();
	}
	public Colis(int num, String destinataire, String type,double poids,int dimensions,String adresse_départ,String adresse_arrivée ) {
		super();
		this.num = num;
		this.destinataire = destinataire;
		this.type = type;
		this.poids=poids;
		this.dimensions=dimensions;
		this.adresse_départ=adresse_départ;
		this.adresse_arrivée=adresse_arrivée;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getDestinataire() {
		return destinataire;
	}
	public void setDestinataire(String destinataire) {
		this.destinataire = destinataire;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getPoids() {
		return poids;
	}
	public void setPoids(double poids) {
		this.poids = poids;
	}
	public int getDimensions() {
		return dimensions;
	}
	public void setDimensions(int dimensions) {
		this.dimensions = dimensions;
	}
	public String getAdresse_départ() {
		return adresse_départ;
	}
	public void setAdresse_départ(String adresse_départ) {
		this.adresse_départ = adresse_départ;
	}
	public String getAdresse_arrivée() {
		return adresse_arrivée;
	}
	public void setAdresse_arrivée(String adresse_arrivée) {
		this.adresse_arrivée = adresse_arrivée;
	}
	public abstract double tarifColis(double poids);
}
