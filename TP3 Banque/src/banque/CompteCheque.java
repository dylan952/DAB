package banque;

public class CompteCheque extends Compte{

	public CompteCheque(int numero, double solde) {
		super(numero, solde);
		// TODO Auto-generated constructor stub
	}


	public boolean validerDebit(double montant) {
		// TODO Auto-generated method stub
		if (montant < debitMax && solde - montant > decouvertMax && montant > 0 )
		return true;
		else return false;
	}
	
	public String toString(){
		return 	"Compte numero : " + this.numCompte + ", Solde : "+ this.solde+", TypeCompte : Compte Cheque";	
	}
		
	
	
}
