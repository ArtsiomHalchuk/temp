package by.epam.java.eshop.entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import by.epam.java.eshop.entity.Goods;

public class Basket {
	List<Goods> goods = new ArrayList<Goods>();
	
	public Basket() {
		return;
	}
	
	public Basket (Goods good) {
		return;
	}
	
	public void addToBasket(Goods good) {
		this.goods.add(good);
	}
	
	public double totalPrice() {
		double sum = 0;
		for (Goods n : goods) {
			sum=sum+n.getPrice();
		}
		return sum;
	}
	
	public String cheque() {
		String s = "Purchase:" + "\n";
		for (Goods n : goods) {
			s=s+n.getName()+"   "+n.getPrice()+"\n";
		}
		s=s+"Total Price:  "+String.format("%.2f", totalPrice());
		return s;
	}
	
	public void sortBasket() {
		Collections.sort(goods);
	}
	
}
