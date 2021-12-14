package by.epam.java.eshop.main;

import by.epam.java.eshop.entity.Basket;
import by.epam.java.eshop.entity.Book;
import by.epam.java.eshop.entity.Bookmark;
import by.epam.java.eshop.entity.FlowerPot;
import by.epam.java.eshop.entity.Freezer;
import by.epam.java.eshop.entity.Microvawe;
import by.epam.java.eshop.entity.Size;
import by.epam.java.eshop.entity.XmasTree;


public class Main {

	public static void main(String[] args) {
	
		Basket basket = new Basket();
		
		
		basket.addToBasket(new Book("Interesting Book", 15.05, "Amazing author", "Just Read it" ));
		basket.addToBasket(new Bookmark("Simple Bookmark", 1.01, "Green"));
		basket.addToBasket(new FlowerPot("Pot for small gardens", 4.01, Size.S));
		basket.addToBasket(new Freezer("Atlant", 10.25, "20 days", "b4503", "40L"));
		basket.addToBasket(new Microvawe("Samsung", 21.99, "15 days", "This is almost new one", Size.valueOf("m".toUpperCase())));
		basket.addToBasket(new XmasTree("Pine", 8.99, 2.87));
		
		System.out.println(basket.cheque());
		
		
		basket.sortBasket();
		
		System.out.println(basket.cheque());
		

	}
	
	
}
			


