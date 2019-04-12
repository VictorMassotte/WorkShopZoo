package fr_monocop_zoo;

public class Animal {
	public String nom;
	public static String Description;
	public String son;
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getSon() {
		return son;
	}

	public void setSon(String son) {
		this.son = son;
	}
	
	public String toString() {
		return ("Je suis " + this.nom + " et je fais " + this.son + this.Description);
	}

	public static String getDescription() {
		return Description;
	}

	public static void setDescription(String description) {
		Description = description;
	}
}