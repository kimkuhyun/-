package library_management_system;

import java.util.Scanner;

public class LibraryApp {
    private static Library library = new Library();


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("1. 도서 추가");
            System.out.println("2. 도서 제거");
            System.out.println("3. 제목으로 도서 검색");
            System.out.println("4. 작가명으로 도서 검색");
            System.out.println("5. 도서 리스트");
            System.out.println("6. 나가기");
            System.out.print("메뉴 선택 : ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice) {
                case 1:
                    addBook(scanner);
                    break;
                    case 2:
                        removeBook(scanner);
                        break;
                        case 3:
                            searchBookByTitle(scanner);
                            break;
                            case 4:
                                searchBookByAuthor(scanner);
                                break;
                                case 5:
                                    listBooks();
                                    break;
                                    case 6:
                                        System.out.println("시스템을 종료 합니다.");
                                        return;
                default:
                    System.out.println("1~6번만 입력. 다시 시도하세요.");


            }
        }
    }
    private static void addBook(Scanner scanner){
        System.out.println("제목 입력");
        String title = scanner.nextLine();
        System.out.println("작가 입력");
        String author = scanner.nextLine();
        System.out.println("ISBN 입력");
        String isbn = scanner.nextLine();
        Book book =  new Book(title,author,isbn);
        library.addBook(book);
    }
    private static void removeBook(Scanner scanner){
        System.out.println("삭제할 도서의 ISBN 입력");
        String isbn = scanner.nextLine();
        library.removeBook(isbn);
    }

    private static void searchBookByTitle(Scanner scanner){
        System.out.println("검색할 책의 제목 입력");
        String title = scanner.nextLine();
        Book book = library.searchBookByTitle(title);
        if(book != null) {
            System.out.println(book.toString());
        } else {
            System.out.println("책을 찾을 수 없습니다.");
        }

    }
    private static void searchBookByAuthor(Scanner scanner){
        System.out.println("검색할 책의 작가 이름 입력");
        String author = scanner.nextLine();
        Book book = library.searchBookByTitle(author);
        if(book != null) {
            System.out.println(book.toString());
        } else {
            System.out.println("책을 찾을 수 없습니다.");
        }

    }
    private static void listBooks(){
        library.listBooks();
    }
}
