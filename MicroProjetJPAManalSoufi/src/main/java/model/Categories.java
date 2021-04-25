package main.java.model;

import javax.persistence.*;

@Entity
public class Categories {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private String RefCat;
    public String Cat;
	public Categories() {
		// TODO Auto-generated constructor stub
	}
	public String getRefCat() {
		return RefCat;
	}
	public void setRefCat(String refCat) {
		RefCat = refCat;
	}
	public String getCat() {
		return Cat;
	}
	public void setCat(String cat) {
		Cat = cat;
	}
	public Categories(String refCat, String cat) {
		super();
		RefCat = refCat;
		Cat = cat;
	}

	@Override
	public String toString() {
		return "Categories{" +
				"RefCat='" + RefCat + '\'' +
				", Cat='" + Cat + '\'' +
				'}';
	}
}
