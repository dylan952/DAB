package banque;

public class PEL extends CompteRemunere{
	
	public PEL(int numero, double solde) {
		super(numero, solde, 2.5, 50, 61200);
		// TODO Auto-generated constructor stub
	}
	
	public boolean validerDebit(double montant) {
		// TODO Auto-generated method stub
		if (montant < debitMax && solde - montant > this.depotMin )
		return true;
		else return false;
	}
	
	public String toString(){
		return 	"Compte numero : " + this.numCompte + ", Solde : "+ this.solde+", TypeCompte : PEL";	
	}
		
	
	
}
