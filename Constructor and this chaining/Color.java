class Color {
    String name;
    String hexCode;
    int red;
    int green;
    int blue;
    boolean isPrimary;
    
    Color() {}
    Color(String name) { this.name = name; }
    Color(String name, String hexCode) { this.name = name; this.hexCode = hexCode; }
    Color(String name, String hexCode, int red) { this.name = name; this.hexCode = hexCode; this.red = red; }
    Color(String name, String hexCode, int red, int green) { this.name = name; this.hexCode = hexCode; this.red = red; this.green = green; }
    Color(String name, String hexCode, int red, int green, int blue) { this.name = name; this.hexCode = hexCode; this.red = red; this.green = green; this.blue = blue; }
    Color(String name, String hexCode, int red, int green, int blue, boolean isPrimary) { this.name = name; this.hexCode = hexCode; this.red = red; this.green = green; this.blue = blue; this.isPrimary = isPrimary; }
	
	void display() {
		
	  System.out.println("Name:"+this.name);
	  System.out.println("Hexcode:"+this.hexCode);
	  System.out.println("Red:"+this.red);
	  System.out.println("green:"+this.green);
	  System.out.println("isPrimary:"+this.isPrimary);
	  System.out.println("blue:"+this.blue);
	  System.out.println("......................................................");
    }
}