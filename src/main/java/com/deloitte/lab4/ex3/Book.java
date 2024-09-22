package com.deloitte.lab4.ex3;

class Book extends WrittenItem {
    public Book(int id, String title, int numberOfCopies, String author) {
        super(id, title, numberOfCopies, author);
    }

    @Override
    public void print() {
        System.out.println("Book Details: " + toString());
    }
}