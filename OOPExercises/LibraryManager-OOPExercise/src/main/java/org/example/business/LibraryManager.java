package org.example.business;

import org.example.entities.Book;
import org.example.entities.Member;
import org.example.entities.Publisher;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class LibraryManager implements Impl {

    private List<Book> books;
    private List<Member> members;
    private List<Publisher> publishers;



    public LibraryManager() {
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
        this.publishers = new ArrayList<>();
    }

    @Override
    public void addBook(int bookId, String bookName, String bookAuthor) {
        Book book = new Book(bookId, bookName, bookAuthor);
        books.add(book);
        System.out.println(book.getBookName() + " adlı kitap sisteme eklendi");
    }
    @Override
    public void addMember(int memberId, String memberName, String memberLastName) {
        Member member = new Member(memberId, memberName, memberLastName);
        members.add(member);
    }

    @Override
    public void addPublisher(int publisherId, String publisherName) {
        Publisher publisher=new Publisher(publisherId,publisherName);
        publishers.add(publisher);
    }

    @Override
    public void deleteBook(int bookId) {
        List<Book> updatedBooks = books.stream()
                .filter(book -> book.getBookId() != bookId)
                .collect(Collectors.toList());

        if (updatedBooks.size() < books.size()) {
            books = updatedBooks;
            System.out.println("Kitap silindi: " + bookId);
        } else {
            System.out.println("Belirtilen kitap bulunamadı.");
        }
    }

    @Override
    public void listBook() {
        for (Book book : books) {
            System.out.println("Kitaplar listelendi: " + book.getBookName());
        }
    }

    @Override
    public void takeBook(int bookId, int memberId,int publisherId) {
        Optional<Book> selectedBook = books.stream()
                .filter(b -> b.getBookId() == bookId)
                .findFirst();

        Optional<Member> selectedMember = members.stream()
                .filter(m -> m.getMemberId() == memberId)
                .findFirst();

        Optional<Publisher> selectedPublisher=publishers.stream()
                        .filter(publisher -> publisher.getPublisherId()==publisherId)
                                .findFirst();


        selectedBook.ifPresent(book ->
                selectedMember.ifPresent(member ->
                        selectedPublisher.ifPresent(publisher ->
                        System.out.println(member.getMemberName() + " isimli üye " +
                                book.getBookName() + " kitabını " + publisher.getPublisherName()
                        + " yayınevinden kiraladı")
                )
                )
        );

        if (selectedBook.isEmpty() || selectedMember.isEmpty()) {
            System.out.println("Belirtilen kitap veya üye bulunamadı.");
        }
    }
    }


