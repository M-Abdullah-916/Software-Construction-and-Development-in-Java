package Lab2;

public class Book extends Publications {
	private int pageCount;

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public void displayDetails() {
		super.displayDetails();
		System.out.println(pageCount+" pages");
	}
}
