package org.example;

import org.example.business.LibraryManager;
import org.example.entities.Book;
import org.example.entities.Member;
import org.example.entities.Publisher;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        LibraryManager libraryManager=new LibraryManager();

        libraryManager.addBook(1,"Harry Potter","J.K.Rowling");
        libraryManager.addBook(2,"Lord of The Rings", "J.R.R Tolkien");
        libraryManager.addBook(3,"Game of Thrones", "George R.R Martin");

        libraryManager.addMember(1,"Ali","Can");
        libraryManager.addMember(2,"Mehmet","Şahin");
        libraryManager.addMember(3,"Ayşe","Canan");

        libraryManager.addPublisher(1,"Altın Yayınevi");
        libraryManager.addPublisher(2,"Kitaplık Yayınevi");
        libraryManager.addPublisher(3,"Çayır Yayınevi");

        System.out.println("Listelenen Kitaplar: ");
        libraryManager.listBook();

        System.out.println("Silinen kitaplar: ");
        libraryManager.deleteBook(1);

        System.out.println("Güncellenen kitaplar: ");
        libraryManager.listBook();

        libraryManager.takeBook(2,2,2);



    }
}