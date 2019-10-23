public class Product {
	private String kardex;
	private String name;
	private String description;
	private Double price;
	private String category;
	private boolean isDevolution;
	
	public Product(String kardex, String name, String description, Double price, String category, boolean isDevolution) {
		super();
		this.kardex = kardex;
		this.name = name;
		this.description = description;
		this.price = price;
		this.category = category;
		this.isDevolution = isDevolution;
	}

	public String getKardex() {
		return kardex;
	}

	public void setKardex(String kardex) {
		this.kardex = kardex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	public boolean getIsDevolution(){
		return isDevolution;
	}
	
	public void setIsDevolution(boolean isDevolution){
		this.isDevolution = isDevolution;
	}
	
}
