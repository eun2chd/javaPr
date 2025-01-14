package quiz;

public class Book {
	private String title;
	private String author;
	private int year;
	
	// 생성자
	public Book(String title, String author, int year) {
		// TODO Auto-generated constructor stub
		this.title = title;
		this.author = author;
		this.year = year;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public void printInfo() {
		System.out.println("Title : " + title);
		System.out.println("Author : " + author);
		System.out.println("Year : " + year);
	}

}
