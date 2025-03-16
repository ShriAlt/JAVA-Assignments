class NailPolish {
    String color;
    String brand;
    double price;
    boolean isGlossy;
    int quantity;
    String fragrance;
    
    NailPolish() {}
    NailPolish(String color) { this.color = color; }
    NailPolish(String color, String brand) { this.color = color; this.brand = brand; }
    NailPolish(String color, String brand, double price) { this.color = color; this.brand = brand; this.price = price; }
    NailPolish(String color, String brand, double price, boolean isGlossy) { this.color = color; this.brand = brand; this.price = price; this.isGlossy = isGlossy; }
    NailPolish(String color, String brand, double price, boolean isGlossy, int quantity) { this.color = color; this.brand = brand; this.price = price; this.isGlossy = isGlossy; this.quantity = quantity; }
    NailPolish(String color, String brand, double price, boolean isGlossy, int quantity, String fragrance) { this.color = color; this.brand = brand; this.price = price; this.isGlossy = isGlossy; this.quantity = quantity; this.fragrance = fragrance; }
    
	void display() {
		
	  System.out.println("brand:"+this.brand);
	  System.out.println("price:"+this.price);
	  System.out.println("Color:"+this.color);
	  System.out.println("isGlossy:"+this.isGlossy);
	  System.out.println("quantity:"+this.quantity);
	  System.out.println("fragrance:"+this.fragrance);
	  System.out.println("......................................................");
    }
	}