package aop;

import org.springframework.stereotype.Component;

@Component("libaryBean")
public class Libary {
    public void getBook(){
        System.out.println("GET BOOK");
    }

    public void addBook(String bookName){
        System.out.println("Добавляем книгу " + bookName);
    }
}
