package banque;

public abstract class CompteRemunere extends Compte {
	double taux;
	double depotMin;
	double depotMax;
	
	public CompteRemunere(int numero, double solde, double taux, double depotMin, double depotMax) {
		super(numero, solde);
		// TODO Auto-generated constructor stub
		this.taux = taux;
		this.depotMax = depotMax;
		this.depotMin = depotMin;		
	}

	private double calculerInterets()
	{
	return this.solde * (taux/100);
	}
	
	public void ajouterInterets(){
		this.solde += calculerInterets();
		
	}
}