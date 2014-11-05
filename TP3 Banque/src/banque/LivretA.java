package banque;

public class LivretA extends CompteRemunere{

	public LivretA(int numero, double solde) {
		super(numero, solde, 3.5, 15, 15300);
		// TODO Auto-generated constructor stub
	}
	
	public boolean validerDebit(double montant) {
		// TODO Auto-generated method stub
		if (montant < debitMax && solde - montant > this.depotMin )
		return true;
		else return false;
	}
	
}
