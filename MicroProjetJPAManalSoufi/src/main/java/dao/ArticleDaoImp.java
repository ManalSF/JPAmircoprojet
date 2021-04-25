package main.java.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import main.java.model.Articles;
import main.java.model.Categories;

class ArticlesDaoImp implements IArticlesDao{
	
	EntityManager em = main.java.HibernateUtil.getEntityManager();
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Articles> getArticless(Long id) {
		List<Articles> Articless = new ArrayList<Articles>();
		if(id==null) {
				Articless = em.createQuery("from Articles", Articles.class).getResultList();
		}else {
			Query query = em.createQuery("SELECT a FROM Articles a where a.id = :codeArticles");
	          query.setParameter("codeArticles", id);
	          Articless = query.getResultList();

		}
		
		return Articless;
	}

	@Override
	public List<Categories> getCategoriess() {
		List<Categories> Categoriess = new ArrayList<Categories>();
		Categoriess = em.createQuery("from Categories", Categories.class).getResultList();
		return Categoriess;
	}

	@Override
	public Long getCatId(String cat) {
		Long cat_id;
		Query query = em.createQuery("SELECT c.RefCat FROM Categories c where c.Cat  = :Categorie");
		query.setParameter("Categorie", cat);
		cat_id = (long) query.getSingleResult();
		return cat_id;
	}

	@Override
	public Articles getArticles(Long CodeArticles) {
		Articles Articles =new Articles();
		Query query = em.createQuery("SELECT a FROM Articles a where a.id = :codeArticles");
		query.setParameter("codeArticles", CodeArticles);
		Articles = (Articles) query.getSingleResult();
		return Articles;
	}

	@Override
	public String getCat(Long id) {
		String cat_name="";
		Query query = em.createQuery("SELECT c.Cat FROM Categories c LEFT JOIN c.Articles a where a.id = :codeA");
		query.setParameter("codeA", id);
		cat_name = (String) query.getSingleResult(); 
		return cat_name;
	}
	
	@Override
	public Categories getCategory(Long id) {
		Categories cat = new Categories();
		try {
			Query query = em.createQuery("SELECT a.Categorie FROM Articles a WHERE a.id = :artId");
			query.setParameter("artId", id);
			cat = (Categories) query.getSingleResult();
		} catch(Exception e) {
			e.printStackTrace();
		}
		return cat;
	}
}
