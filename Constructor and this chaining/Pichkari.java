class Pichkari {
    String type;
    int capacity;
    String color;
    boolean isAutomatic;
    double length;
    String brand;
    
    Pichkari() {}
    Pichkari(String type) { this.type = type; }
    Pichkari(String type, int capacity) { this.type = type; this.capacity = capacity; }
    Pichkari(String type, int capacity, String color) { this.type = type; this.capacity = capacity; this.color = color; }
    Pichkari(String type, int capacity, String color, boolean isAutomatic) { this.type = type; this.capacity = capacity; this.color = color; this.isAutomatic = isAutomatic; }
    Pichkari(String type, int capacity, String color, boolean isAutomatic, double length) { this.type = type; this.capacity = capacity; this.color = color; this.isAutomatic = isAutomatic; this.length = length; }
    Pichkari(String type, int capacity, String color, boolean isAutomatic, double length, String brand) { this.type = type; this.capacity = capacity; this.color = color; this.isAutomatic = isAutomatic; this.length = length; this.brand = brand; }
    
    void display() {
		
		System.out.println("Type:"+this.type);
	  System.out.println("capacity:"+this.capacity);
	  System.out.println("color:"+this.color);
	  System.out.println("isAutomatic:"+this.isAutomatic);
	  System.out.println("length:"+this.length);
	  System.out.println("brand:"+this.brand);
		System.out.println("......................................................");
    }
}
