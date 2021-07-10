package collectionpkg;

import java.util.ArrayList;
import java.util.List;

class Book{
	
	int id;
	String name;
	String author;
	public Book(int id, String name, String author)
	{
		id=this.id;
		name=this.name;
		author=this.author;
	}
	
}

public class BookListEx {

	public static void main(String[] args) {
    
		List<Book>b= new ArrayList<Book>();
		Book b1= new Book(1, "c","yrk");
		Book b2= new Book(2, "oracle","Sunmicro System");
		b.add(b1);
		b.add(b2);
		for(Book bk:b)
		{
			System.out.println(bk.id+"  "+bk.name+"  "+bk.author);
		}

	}

}
