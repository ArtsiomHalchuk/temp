package by.epam.java.eshop.entity;

import java.util.Comparator;

public class BookNameAscComporator implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		return o1.getName().compareTo(o2.getName());
	}

}
