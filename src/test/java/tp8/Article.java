package tp8;

public class Article {

	private String reference;
	private String type;
	private double prix;
	private boolean enRupture;

	/**
	 * @param prix
	 * @param enRupture
	 */
	public Article(String reference, String type, double prix, boolean enRupture) {
		super();
		this.reference = reference;
		this.type = type;
		this.prix = prix;
		this.enRupture = enRupture;
	}

	// GETTERS ET SETTERS à générer
	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public boolean isEnRupture() {
		return enRupture;
	}

	public void setEnRupture(boolean enRupture) {
		this.enRupture = enRupture;
	}

}