package main.java.dao;

import java.util.List;

import main.java.model.Articles;
import main.java.model.Categories;

interface IArticlesDao {
	public List<Articles> getArticless(Long id);
	public Articles getArticles(Long CodeArticles);
	public List<Categories> getCategoriess();
	public Long getCatId(String cat);
	public String getCat(Long id);
	public Categories getCategory(Long id);
}
