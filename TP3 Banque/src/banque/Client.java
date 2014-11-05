package banque;

public class Client extends Banque {
	String nom, prenom, adresse;
	Compte[] comptes = new Compte[10];
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
		comptes[indexComptes] = c;
		indexComptes++;
	}
	
	public void afficher(){
		System.out.println("Bilan des comptes de M. ou Mme "+this.prenom);
		for (int i = 0; i < indexComptes; i++) {
			System.out.println( comptes[i].toString());
		}
	}
	
	public void afficherCompte(int num){
		
			System.out.println("Bilan du compte n°"+comptes[num].getNumCompte()+" - Solde : "+ comptes[num].getSolde());
		
	}
	
	public void afficherComptes(){
		for (int i = 0; i < indexComptes; i++) {
			System.out.println(comptes[i].toString());
		}
	}
	
	public Compte getCompte(int index){
		return comptes[index];
	}
	
	public String toString(){
		String chaine;
		chaine ="Bilan des comptes de M. ou Mme "+this.prenom+"\n";
		for (int i = 0; i < indexComptes; i++) {
			chaine += comptes[i].toString()+"\n";
		}
		return chaine;
	}
}
