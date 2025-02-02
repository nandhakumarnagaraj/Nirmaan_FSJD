package Day_08;

public class Book {
	String Name;
	String Author;
	double Price;

	public Book(String name, String author, double price) {
		super();
		Name = name;
		Author = author;
		Price = price;
	}

	public Book() {
		super();
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		Price = price;
	}

	@Override
	public String toString() {
		return String.format("Book Name: %s, Book Author: %s, Available Count : %f", Name, Author, Price);
	}

}
