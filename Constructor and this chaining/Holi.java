class Holi {
    String type;
    int intensity;
    boolean organic;
    String scent;
    double price;
    String brand;
    
    Holi() {}
    Holi(String type) { this.type = type; }
    Holi(String type, int intensity) { this.type = type; this.intensity = intensity; }
    Holi(String type, int intensity, boolean organic) { this.type = type; this.intensity = intensity; this.organic = organic; }
    Holi(String type, int intensity, boolean organic, String scent) { this.type = type; this.intensity = intensity; this.organic = organic; this.scent = scent; }
    Holi(String type, int intensity, boolean organic, String scent, double price) { this.type = type; this.intensity = intensity; this.organic = organic; this.scent = scent; this.price = price; }
    Holi(String type, int intensity, boolean organic, String scent, double price, String brand) { this.type = type; this.intensity = intensity; this.organic = organic; this.scent = scent; this.price = price; this.brand = brand; }
    
    void display() {
		
		System.out.println("Type:"+this.type);
	  System.out.println("Intensity:"+this.intensity);
	  System.out.println("Organic:"+this.organic);
	  System.out.println("scent:"+this.scent);
	  System.out.println("Price:"+this.price);
	  System.out.println("brand:"+this.brand);
		System.out.println("......................................................");
    }
	}
