package banque;

public abstract class Compte {
	public final int numCompte;
	double solde = 0;
	int decouvertMax = -800;
	int debitMax = 1000;

	public Compte(int numero, double solde) {
		this.numCompte = numero;
		this.solde = solde;
	}

	public Compte(int numero, double solde, int decouvertMax, int debitMax) {
		this.numCompte = numero;
		this.solde = solde;
		this.decouvertMax = decouvertMax;
		this.debitMax = debitMax;
	}

	public void affiche() {
		System.out.println("Compte numero : " + this.numCompte + ", Solde : "
				+ this.solde);

	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public int getDecouvertMax() {
		return decouvertMax;
	}

	public void setDecouvertMax(int decouvertMax) {
		this.decouvertMax = decouvertMax;
	}

	public int getDebitMax() {
		return debitMax;
	}

	public void setDebitMax(int debitMax) {
		this.debitMax = debitMax;
	}

	public boolean debiter(double montant) {
		if (validerDebit(montant)) {
			solde -= montant;
			return true;
		} else {
			System.out.println("Montant à debiter trop grand.");
			return false;
		}
	}

	public void crediter(double montant) {
		if (montant > 0)
			solde += montant;
		else
			System.out.println("Montant negatif.");
	}

	public void virement(Compte c, double montant) {
		if (this.debiter(montant)) {
			c.crediter(montant);
		}

	}
	
	public int getNumCompte() {
		return numCompte;
	}

	public String toString(){
	return 	"Compte numero : " + this.numCompte + ", Solde : "+ this.solde;	
	}
	
	public abstract boolean validerDebit(double montant);

}