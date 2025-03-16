class Egg {
    String type;
    double weight;
    String color;
    boolean organic;
    String size;
    String source;
    
    Egg() {}
    Egg(String type) { this.type = type; }
    Egg(String type, double weight) { this.type = type; this.weight = weight; }
    Egg(String type, double weight, String color) { this.type = type; this.weight = weight; this.color = color; }
    Egg(String type, double weight, String color, boolean organic) { this.type = type; this.weight = weight; this.color = color; this.organic = organic; }
    Egg(String type, double weight, String color, boolean organic, String size) { this.type = type; this.weight = weight; this.color = color; this.organic = organic; this.size = size; }
    Egg(String type, double weight, String color, boolean organic, String size, String source) { this.type = type; this.weight = weight; this.color = color; this.organic = organic; this.size = size; this.source = source; }
    
	void display() {
		
	  System.out.println("Type:"+this.type);
	  System.out.println("Weight:"+this.weight);
	  System.out.println("Color:"+this.color);
	  System.out.println("Organic:"+this.organic);
	  System.out.println("Size:"+this.size);
	  System.out.println("Source:"+this.source);
	  System.out.println("......................................................");
    }
}