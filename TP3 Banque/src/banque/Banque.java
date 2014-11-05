package banque;

import java.util.ArrayList;

public class Banque {

	ArrayList<Client> clients = new ArrayList<Client>();
	static int numero = 0;

	protected void afficherClients() {
		for (Client c: clients) {
			System.out.println(c.getPrenom());
		}
	}

	public static int numCompte() {
		return numero += 1;
	}
	
	protected void addClient(Client c){
		clients.add(c);
	}

	public Client getClients(int i) {
		return clients.get(i);
	}
}
