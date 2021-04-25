package main.java.model;
import javax.persistence.*;

@Entity
public class Lignescommandes {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@ManyToOne
	@JoinColumn(name = "commande_id", referencedColumnName = "NumCommande")
	private Commandes NumCommande;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@ManyToOne
	@JoinColumn(name = "article_id", referencedColumnName = "CodeArticle")
    private Articles CodeArticle;
    public  float QteCde;
	public Lignescommandes() {
		// TODO Auto-generated constructor stub
	}
	public Commandes getNumCommande() {
		return NumCommande;
	}
	public void setNumCommande(Commandes numCommande) {
		NumCommande = numCommande;
	}
	public Articles getCodeArticle() {
		return CodeArticle;
	}
	public void setCodeArticle(Articles codeArticle) {
		CodeArticle = codeArticle;
	}
	public float getQteCde() {
		return QteCde;
	}
	public void setQteCde(float qteCde) {
		QteCde = qteCde;
	}
	public Lignescommandes(Commandes numCommande, Articles codeArticle, float qteCde) {
		super();
		NumCommande = numCommande;
		CodeArticle = codeArticle;
		QteCde = qteCde;
	}

	@Override
	public String toString() {
		return "Lignescommandes{" +
				"NumCommande=" + NumCommande +
				", CodeArticle=" + CodeArticle +
				", QteCde=" + QteCde +
				'}';
	}
}
