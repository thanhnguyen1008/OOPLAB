package hust.soict.dsai.aims.media;

public class Disc extends Media {
	private int length;
	private String director;

	public Disc() {
		this.length = 0;
		this.director = "";
	}
	public Disc(int id, String title, String category, float cost, String director, int length) {
		super(id, title, category, cost);
		this.director = director;
		this.length = length;
	}

	public int getLength() {
		return length;
	}

	public String getDirector() {
		return director;
	}

	@Override
	public String toString() {
		return "Disc" + "-" + this.getTitle() + "-" + this.getCategory() + "-" + this.getDirector() + "-" + String.valueOf(this.getLength()) + ": " + String.valueOf(this.getCost()) + "$";
	};
}