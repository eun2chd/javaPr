package quiz.q01;

import java.util.ArrayList;

public class Libray {
	private ArrayList<Book> books = new ArrayList<Book>();
	
	public void addBook(Book book) {
		books.add(book);
	}
	
	// 책 출력
	public void printBooks() {
		for (Book book : books) {
			book.printInfo();
		}
	}
	
	// 책 제목으로 찾는 메소드
	public void findBookByTitle(String title) {
		for (Book book : books) {
			if(book.getTitle().equals(title)) {
				book.printInfo();
				return;
			}
		}
		System.out.println("Not found book");
	}

}
