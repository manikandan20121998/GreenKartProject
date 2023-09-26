package org.page;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Pom extends BaseClass {

	public Pom() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//input[@type='search']")
	private WebElement search;
	
	@FindBy(xpath="//a[text()='+']")
	private WebElement incre;
	
	@FindBy(xpath="(//button[@type='button'])[2]")
	private WebElement addtocart;
	
	@FindBy(xpath="//img[@alt='Cart']")
	private WebElement card;
	
	@FindBy(xpath="//button[text()='PROCEED TO CHECKOUT']")
	private WebElement checkout;
	
	@FindBy(xpath="//input[@class='promoCode']")
	private WebElement promo;
	
	@FindBy(xpath="//button[@class='promoBtn']")
	private WebElement apply;
	
	public WebElement getPromo() {
		return promo;
	}

	public WebElement getApply() {
		return apply;
	}


	@FindBy(xpath="//button[text()='Place Order']")
	private WebElement place;
	
	@FindBy(xpath="//div[@class='wrapperTwo']//following::div/select")
	private WebElement country;
	
	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement con;
	
	@FindBy(xpath="//button[text()='Proceed']")
	private WebElement placelast;

	public WebElement getSearch() {
		return search;
	}

	public  WebElement getIncre() {
		return incre;
	}

	public WebElement getAddtocart() {
		return addtocart;
	}

	public WebElement getCard() {
		return card;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getPlace() {
		return place;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getCon() {
		return con;
	}

	public WebElement getPlacelast() {
		return placelast;
	}
	
	
	public static void countryselect() {
		Pom p=new Pom();
		Select s=new Select(p.getCountry());
		List<WebElement> alloption = s.getOptions();
		int size = alloption.size();
		System.out.println(size);
		for (int i = 1; i <alloption.size(); i++) {
			String text = alloption.get(i).getText();
			System.out.println(text);
		}
		s.selectByIndex(10);
	}
	
	public static void increment() throws InterruptedException {
		Pom p=new Pom();
		for (int i = 0; i < 4; i++ ) {
			
			jeclick(p.getIncre());
			
		}
	}
	
	@FindBy(xpath="//h4[@class='product-name']")
	private static List<WebElement> products;
	
	public static List<WebElement> getProducts() {
		return products;
	}

	public List<WebElement> getPrices() {
		return  prices;
	}


	@FindBy(xpath="//p[@class='product-price']")
	private List<WebElement> prices;
	
	
	
	public static void map() {

		Pom p=new Pom();
		List<WebElement> prod =p.getProducts();
		List<WebElement> pric =p.getPrices();
		 Map<String,String> mp=new HashMap<String,String>();
		   for (int i = 0; i < prod.size(); i++) {
			String pro = prod.get(i).getText();
			String pri = pric.get(i).getText();
			mp.put(pro, pri);
			 System.out.println("product====="+pro+"====="+"price=="+pri);
		}
		}
	
	public static void particular() {
		Pom p=new Pom();
		List<WebElement> prod =p.getProducts();
		List<WebElement> pric =p.getPrices();
		 Map<String,String> mp=new HashMap<String,String>();
		   for (int i = 0; i < prod.size(); i++) {
			String pro = prod.get(i).getText();
			String pri = pric.get(i).getText();
			mp.put(pro, pri);	
	}
		   String p1 = mp.get("Mango - 1 Kg");
		   System.out.println(p1);	
	}
	
	
	public static void list() {
		List<String> l=new LinkedList<String>();
		Pom p=new Pom();
		List<WebElement> pp = p.getProducts();
		for (int i = 0; i < pp.size(); i++) {
			String w = pp.get(i).getText();
			l.add(w);
		}
		System.out.println(l);
	}
	
	public static void set() {

		List<String> l=new LinkedList<String>();
		Pom p=new Pom();
		List<WebElement> pp = p.getProducts();
		for (int i = 0; i < pp.size(); i++) {
			String w = pp.get(i).getText();
			l.add(w);
		}
		Set<String> s=new HashSet<String>();
		s.addAll(l);
		System.out.println(s);
		System.out.println(l.size()-s.size());
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

