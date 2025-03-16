class Tomato {
    String type;
    String color;
    double weight;
    boolean ripe;
    String origin;
    int shelfLife;
    
    Tomato() {}
    Tomato(String type) { this.type = type; }
    Tomato(String type, String color) { this.type = type; this.color = color; }
    Tomato(String type, String color, double weight) { this.type = type; this.color = color; this.weight = weight; }
    Tomato(String type, String color, double weight, boolean ripe) { this.type = type; this.color = color; this.weight = weight; this.ripe = ripe; }
    Tomato(String type, String color, double weight, boolean ripe, String origin) { this.type = type; this.color = color; this.weight = weight; this.ripe = ripe; this.origin = origin; }
    Tomato(String type, String color, double weight, boolean ripe, String origin, int shelfLife) { this.type = type; this.color = color; this.weight = weight; this.ripe = ripe; this.origin = origin; this.shelfLife = shelfLife; }
    
	void display() {
		
	  System.out.println("Type:"+this.type);
	  System.out.println("Weight:"+this.weight);
	  System.out.println("Color:"+this.color);
	  System.out.println("Ripe:"+this.ripe);
	  System.out.println("Origin:"+this.origin);
	  System.out.println("ShelfLife:"+this.shelfLife);
	  System.out.println("......................................................");
    }
}