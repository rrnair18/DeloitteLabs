package com.deloitte.lab4.ex3;

import java.util.Objects;

public abstract class Item {
	
	int UID;
	String Title ;
	int numberOfCopies;
	
	public Item(int id, String title, int numberOfCopies) {
		super();
		UID = id;
		Title = title;
		this.numberOfCopies = numberOfCopies;
	}
	public int getUID() {
		return UID;
	}
	public void setUID(int uID) {
		UID = uID;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public int getNumberOfCopies() {
		return numberOfCopies;
	}
	public void setNumberOfCopies(int numberOfCopies) {
		this.numberOfCopies = numberOfCopies;
	}
	
    public void checkIn() {
        this.numberOfCopies++;
    }

    public void checkOut() {
        if (this.numberOfCopies > 0) {
            this.numberOfCopies--;
        } else {
            System.out.println("No copies available to check out.");
        }
    }
	
    public void addCopies(int copies) {
    	this.numberOfCopies += copies;
    }
    
	public abstract void print();
	
    @Override
    public String toString() {
        return "ID: " + UID + ", Title: " + Title + ", Copies: " + numberOfCopies;
    }

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		return Objects.equals(Title, other.Title) && UID == other.UID && numberOfCopies == other.numberOfCopies;
	}
	
}
