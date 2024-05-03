package org.example.business;

import org.example.entities.Book;

public interface Impl {
    void addBook(int bookId, String bookName, String bookAuthor);
    void addMember(int memberId, String memberName, String memberLastName);
    void addPublisher(int publisherId, String publisherName);
    void deleteBook(int bookId);
    void listBook();
    void takeBook(int bookId,int memberId,int publisherId);


}
