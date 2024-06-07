package library_management_system;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<Book>();
    }

    //도서 추가 메서드
    public void addBook(Book book){
        books.add(book);
        System.out.println(book.getTitle() + "추가되었습니다.");
    }

    //도서 삭제 메서드
    public void removeBook(String isbn){
        books.removeIf(book -> book.getIsbn().equals(isbn));
        System.out.println(isbn+"이 제거되었습니다.");
    }

    //도서 검색 메서드
    public Book searchBookByTitle(String title){
        for(Book book : books){
            if(book.getTitle().equalsIgnoreCase(title)){
                return book;
            }
        }
        return null;
    }

    public Book searchBookByAutor(String autor){
        for(Book book : books){
            if(book.getAuthor().equalsIgnoreCase(autor)){
                return book;
            }
        }
        return null;
    }

    //도서 목록 출력 메서드
    public  void listBooks(){
        for(Book book : books){
            System.out.println(book.getTitle());
        }
    }
}
