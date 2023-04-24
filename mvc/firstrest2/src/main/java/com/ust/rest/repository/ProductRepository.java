package com.ust.rest.repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.stereotype.Repository;

import com.ust.rest.resource.Product;
@Repository
public class ProductRepository {
	
	private  ArrayList<Product> ProductCache=new ArrayList<Product>();
	
	public ProductRepository() {
		
		Product p1=new Product();
		p1.setProductId(101);
		p1.setName("laptop");
		p1.setDescription("Macnook Retina Eye");
		p1.setPrice(new BigDecimal(1900000));
		p1.setQty(5);
		ProductCache.add(p1);
		
		Product p2=new Product();
		p2.setProductId(102);
		p2.setName("tablet");
		p2.setDescription("Windows");
		p2.setPrice(new BigDecimal(1500000));
		p2.setQty(10);
		ProductCache.add(p2);
		
		Product p3=new Product();
		p3.setProductId(103);
		p3.setName("mobile");
		p3.setDescription("Samsung spen");
		p3.setPrice(new BigDecimal(150000));
		p3.setQty(10);
		ProductCache.add(p3);
		
		Product p4=new Product();
		p4.setProductId(104);
		p4.setName("tv");
		p4.setDescription("videocon");
		p4.setPrice(new BigDecimal(250000));
		p4.setQty(7);
		ProductCache.add(p4);
		
		Product p5=new Product();
		p5.setProductId(105);
		p5.setName("mobile");
		p5.setDescription("lava Z50");
		p5.setPrice(new BigDecimal(150000));
		p5.setQty(10);
		ProductCache.add(p5);
	}
	//C-create
	public boolean addProduct(Product product) 
	   {
		return ProductCache.add(product);
		}
	//R-retrieve
	public Product getProduct(long productId) 
	{
		Iterator<Product>iter=ProductCache.iterator();
		Product product=null;
		while(iter.hasNext()) {
			 product=iter.next();
			if(product.getProductId()==productId) {
				break;
			}
			
		}
		if(product !=null)
		       return product;
		else
			return null;
	}
	
	public ArrayList<Product> getProduct(){
		return ProductCache;
	}
	
	//u-update
  public Product updateProduct(Product productToUpdate) {
	  Product searchProduct=null;
	  Iterator<Product>iter=ProductCache.iterator();
	  int index=0;
	  while(iter.hasNext()) {
		  searchProduct=iter.next();
		  if(searchProduct.getProductId()==productToUpdate.getProductId()) {
			  ProductCache.add(index,productToUpdate);
			  productToUpdate=searchProduct;
		  }
		  index++;
	  }
	  return productToUpdate;
  }
  //d-delete
  public void delete(long productId) {
	  Iterator<Product>iter=ProductCache.iterator();
	  int index=0;
	  while(iter.hasNext()) {
		  Product temproduct=iter.next();
		  if(temproduct.getProductId()==productId) {
			  ProductCache.remove(index);
			 
		  }
		  index++;
	  }
  }
}
