package main.java.model;

import javax.persistence.*;

@Entity
public class Articles {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private String CodeArticle;
    public String Designation;
    public float Prix;
    public int Stock;
	@ManyToOne
	@JoinColumn(name = "categorie", referencedColumnName = "RefCat")
    public Categories Categorie;
    public String photo;
	public Articles() {
		// TODO Auto-generated constructor stub
	}
	public String getCodeArticle() {
		return CodeArticle;
	}
	public void setCodeArticle(String codeArticle) {
		CodeArticle = codeArticle;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	public float getPrix() {
		return Prix;
	}
	public void setPrix(float prix) {
		Prix = prix;
	}
	public int getStock() {
		return Stock;
	}
	public void setStock(int stock) {
		Stock = stock;
	}
	public Categories getCategorie() {
		return Categorie;
	}
	public void setCategorie(Categories categorie) {
		Categorie = categorie;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public Articles(String codeArticle, String designation, float prix, int stock, Categories categorie, String photo) {
		super();
		CodeArticle = codeArticle;
		Designation = designation;
		Prix = prix;
		Stock = stock;
		Categorie = categorie;
		this.photo = photo;
	}

	@Override
	public String toString() {
		return "Articles{" +
				"CodeArticle='" + CodeArticle + '\'' +
				", Designation='" + Designation + '\'' +
				", Prix=" + Prix +
				", Stock=" + Stock +
				", Categorie='" + Categorie + '\'' +
				", photo='" + photo + '\'' +
				'}';
	}
}
