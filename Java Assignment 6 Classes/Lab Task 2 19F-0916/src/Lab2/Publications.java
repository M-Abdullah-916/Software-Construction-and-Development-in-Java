package Lab2;

public abstract class Publications {
	private String title;
	private float price;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Publications [title=" + title + ", price=" + price + " rs" + "]";
	}

	public void displayDetails() {
		System.out.println(toString());
	}

}
