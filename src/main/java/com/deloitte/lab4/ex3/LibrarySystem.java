package com.deloitte.lab4.ex3;

public class LibrarySystem {
    public static void main(String[] args) {
        Book book = new Book(1, "Effective Java", 5, "Joshua Bloch");
        JournalPaper journalArticle = new JournalPaper(2, "Quantum Computing", 3, "John Doe");
        Video video = new Video(3, "Inception", 2, 148, "Christopher Nolan", 2010, "Sci-Fi");
        CD cd = new CD(4, "Thriller", 10, 42, "Michael Jackson", "Pop");

        book.print();
        journalArticle.print();
        video.print();
        cd.print();
    }
}
