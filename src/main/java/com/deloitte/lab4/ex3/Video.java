package com.deloitte.lab4.ex3;

class Video extends MediaItem {
	private String director;
	private int releaseYear;
	private String genre;

	public Video(int id, String title, int numberOfCopies, int runtime, String director, int releaseYear,
			String genre) {
		super(id, title, numberOfCopies, runtime);
		this.director = director;
		this.releaseYear = releaseYear;
		this.genre = genre;
	}

	@Override
	public void print() {
		System.out.println("Video Details: " + toString() + ", Director: " + director + ", Year: " + releaseYear
				+ ", Genre: " + genre);
	}

}
