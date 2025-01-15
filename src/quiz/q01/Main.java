package quiz.q01;

public class Main {
	public static void main(String[] args) {
		// 도서 객체 생성
		Libray library = new Libray();

		library.addBook(new Book("Java Programming", "Jogn Doe", 2020));
		library.addBook(new Book("Data Structures", "Jane Smith", 2018));
		library.addBook(new Book("Algorithm Design", "Robert Brown", 2022));
		
		System.out.println("All Books in Library");
		library.printBooks();
		
		// 제목으로 책 검색하기
		System.out.println("제목으로 검색하기 자바책");	
		library.findBookByTitle("Java Programming");
		
		System.out.println("제목으로 검색하기 데이터책");
		library.findBookByTitle("Algorithm Design");
		
	}

}
