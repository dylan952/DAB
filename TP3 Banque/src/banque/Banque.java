package banque;

public class Banque {

	Client[] clients = new Client[10];
	int indexClient = 0;
	static int numero = 0;

	protected void afficherClients() {
		for (int i = 0; i < indexClient; i++) {
			System.out.println(i+1 + ")" + clients[i].getPrenom());
		}
	}

	public static int numCompte() {
		return numero += 1;
	}
	
	protected void addClient(Client c){
		clients[indexClient] = c;
		indexClient++;
	}

	public Client getClients(int i) {
		return clients[i];
	}
}
