package banque;

import java.util.ArrayList;

public class Client extends Banque {
	String nom, prenom, adresse;
	ArrayList<Compte> comptes = new ArrayList<Compte>();
	int indexComptes = 0;

	public Client(String nom, String prenom, String adresse) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	public void addCompte(Compte c){
		comptes.add(c);
	}
	
	public void afficher(){
		System.out.println("Bilan des comptes de M. ou Mme "+this.prenom);
		for (Compte c: comptes) {
			System.out.println(c.toString());
		}
	}
	
	public void afficherCompte(int num){
		
			System.out.println("Bilan du compte n°"+comptes.get(num).getNumCompte()+" - Solde : "+ comptes.get(num).getSolde());
		
	}
	
	public void afficherComptes(){
		for (Compte c: comptes) {
			System.out.println(c.toString());
		}
	}
	
	public Compte getCompte(int index){
		return comptes.get(index);
	}
	
	public String toString(){
		String chaine;
		chaine ="Bilan des comptes de M. ou Mme "+this.prenom+"\n";
		for (Compte c: comptes) {
			chaine += c.toString()+"\n";
		}
		return chaine;
	}
}
