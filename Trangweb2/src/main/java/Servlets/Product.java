package Servlets;

public class Product 
{
	 
	 private String Id;
	 private String Name;
	 private String Type;
	 private int Price;
	 
	 public Product()
	 {}
	 public Product(String id, String name, String type, int price)
	 {
		 this.Id=id;
		 this.Name=name;
		 this.Type=type;
		 this.Price=price;
	 }
	
	 public Product(Product pd)
	 {
		 this.Id=pd.Id;
		 this.Name=pd.Name;
		 this.Type=pd.Type;
		 this.Price=pd.Price;
	 }
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		this.Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		this.Type = type;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		this.Price = price;
	}
}