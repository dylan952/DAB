package banque;

import java.util.Scanner;

public class DAB {
	Banque banque = new Banque();
	Scanner sc = new Scanner(System.in);
	int numClient;

	public void initialiser(Banque parBanque) {
		this.banque = parBanque;
	}

	public void demarrer() {
		afficheMenu0();
		numClient = sc.nextInt();

		if (numClient == 0) {
			// exit app
			sc.close();
			System.exit(0);
		} else {
			
			etape1();
		}
	}

	public void etape1() {
		afficheMenu1(numClient);
		int choix = sc.nextInt();
		switch (choix) {
		case 0: demarrer();
			break;
		case 1: etape2();
			break;
		case 2:
			System.out.println("Choisissez le compte a debiter :");
			banque.getClients(numClient - 1).afficher();
			int compte1 = sc.nextInt();
			System.out.println("Choisissez le client a crediter :");
			banque.afficherClients();
			int numCli = sc.nextInt();
			System.out.println("Choisissez le compte a crediter :");
			banque.getClients(numCli - 1).afficher();
			int compte2 = sc.nextInt();
			System.out.println("montant du virement :");
			double montant = sc.nextDouble();
			banque.getClients(numClient - 1).getCompte(compte1 - 1).virement(banque.getClients(numCli - 1).getCompte(compte2 - 1), montant);
			
			//recap
			banque.getClients(numClient - 1).afficherCompte(compte1 - 1);
			banque.getClients(numCli - 1).afficherCompte(compte2 - 1);
			 
			etape1();
			break;
		case 3:
			banque.getClients(numClient - 1).afficher();
			 
			etape1();
			break;
		}
	}
	
	public void etape2(){
		System.out.println("Choisissez un compte :");
		banque.getClients(numClient - 1).afficher();
		int numCompte = sc.nextInt();
			
			afficheMenu2();
			int entier3 = sc.nextInt();
			switch(entier3){
			case 0://menu1
			break;
			case 1:
				System.out.println("Entrez un montant à retirer :");
				double montant = sc.nextDouble();
				banque.getClients(numClient - 1).getCompte(numCompte-1).debiter(montant);
				//recap
				banque.getClients(numClient - 1).afficherCompte(numCompte - 1);
				etape1();
			break;
			case 2:
				System.out.println("Entrez un montant à deposer :");
				double montant1 = sc.nextDouble();
				banque.getClients(numClient - 1).getCompte(numCompte-1).crediter(montant1);
				//recap
				banque.getClients(numClient - 1).afficherCompte(numCompte - 1);
				 
				etape1();
			break;
			case 3:
			banque.getClients(numClient - 1).getCompte(numCompte-1).affiche();
			 
			etape1();
			break;
			
			}
	
	}

	private void afficheMenu0() {
		System.out.println("Quel est votre nom ? ");
		banque.afficherClients();
		System.out.println("0) Quitter");
	}

	public void afficheMenu1(int numClient) {
		System.out.println("Bonjour m. ou Mme "+ banque.getClients(numClient - 1));
		System.out.println("Quelle opération voulez-vous effectuer");
		System.out.println("0) Revenir au menu principal ");
		System.out.println("1) Effectuer une opération sur un compte");
		System.out.println("2) Faire un virement");
		System.out.println("3) Afficher le bilan de vos comptes");
	}

	public void afficheMenu2() {
		System.out.println("Quelle opération voulez-vous effectuer");
		System.out.println("0) Retour");
		System.out.println("1) Faire un retrait");
		System.out.println("2) Faire un depot");
		System.out.println("3) Afficher le solde");
	}
}
