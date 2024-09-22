package com.deloitte.lab4.ex3;

public class JournalPaper extends WrittenItem {
	
    public JournalPaper(int id, String title, int numberOfCopies, String author) {
        super(id, title, numberOfCopies, author);
    }

    @Override
    public void print() {
        System.out.println("Journal Article Details: " + toString());
    }
}


