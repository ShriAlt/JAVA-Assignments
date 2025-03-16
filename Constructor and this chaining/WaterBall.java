class WaterBall {
    String type;
    int diameter;
    String color;
    boolean isBouncy;
    double weight;
    String material;
    
    WaterBall() {}
    WaterBall(String type) { this.type = type; }
    WaterBall(String type, int diameter) { this.type = type; this.diameter = diameter; }
    WaterBall(String type, int diameter, String color) { this.type = type; this.diameter = diameter; this.color = color; }
    WaterBall(String type, int diameter, String color, boolean isBouncy) { this.type = type; this.diameter = diameter; this.color = color; this.isBouncy = isBouncy; }
    WaterBall(String type, int diameter, String color, boolean isBouncy, double weight) { this.type = type; this.diameter = diameter; this.color = color; this.isBouncy = isBouncy; this.weight = weight; }
    WaterBall(String type, int diameter, String color, boolean isBouncy, double weight, String material) { this.type = type; this.diameter = diameter; this.color = color; this.isBouncy = isBouncy; this.weight = weight; this.material = material; }
    
	void display() {
		
	  System.out.println("Type:"+this.type);
	  System.out.println("Diameter:"+this.diameter);
	  System.out.println("Color:"+this.color);
	  System.out.println("IsBouncy:"+this.isBouncy);
	  System.out.println("Weigth:"+this.weight);
	  System.out.println("Material:"+this.material);
	  System.out.println("......................................................");
    }
	
}