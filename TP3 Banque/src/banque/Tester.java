package banque;

public class Tester {
	public static void main(String[] s) {
		Compte c = new Compte(1, 300);
		Compte c2 = new Compte(2, 500);
		
		Client cl = new Client("pierre", "Martin", "abc ");
		Client cl2 = new Client("pierre", "Robert", "abc ");
		cl2.addCompte(c2);
		
		cl.addCompte(c);
		cl.addCompte(c2);
		
		//cl.afficher();
		//cl.afficherComptes();
		
		Banque banque = new Banque();
		
		banque.addClient(cl);
		banque.addClient(cl2);
		//banque.afficherClients();
		//test
		
		DAB dab = new DAB();
		dab.initialiser(banque);
		dab.demarrer();
		
	}
}
