package main.java.model;
import javax.persistence.*;

@Entity
public class Commandes {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private double NumCommande;
	@ManyToOne
	@JoinColumn(name = "client_id", referencedColumnName = "id")
    public Clients CodeClient;
    public String DateCommande;
	public Commandes() {
		// TODO Auto-generated constructor stub
	}
	public double getNumCommande() {
		return NumCommande;
	}
	public void setNumCommande(double numCommande) {
		NumCommande = numCommande;
	}
	public Clients getCodeClient() {
		return CodeClient;
	}
	public void setCodeClient(Clients codeClient) {
		CodeClient = codeClient;
	}
	public String getDateCommande() {
		return DateCommande;
	}
	public void setDateCommande(String dateCommande) {
		DateCommande = dateCommande;
	}
	public Commandes(double numCommande, Clients codeClient, String dateCommande) {
		super();
		NumCommande = numCommande;
		CodeClient = codeClient;
		DateCommande = dateCommande;
	}

	@Override
	public String toString() {
		return "Commandes{" +
				"NumCommande=" + NumCommande +
				", CodeClient=" + CodeClient +
				", DateCommande='" + DateCommande + '\'' +
				'}';
	}
}
