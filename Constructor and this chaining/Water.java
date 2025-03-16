class Water {
    String type;
    double volume;
    String source;
    boolean purified;
    double pH;
    String color;
    
    Water() {}
    Water(String type) { this.type = type; }
    Water(String type, double volume) { this.type = type; this.volume = volume; }
    Water(String type, double volume, String source) { this.type = type; this.volume = volume; this.source = source; }
    Water(String type, double volume, String source, boolean purified) { this.type = type; this.volume = volume; this.source = source; this.purified = purified; }
    Water(String type, double volume, String source, boolean purified, double pH) { this.type = type; this.volume = volume; this.source = source; this.purified = purified; this.pH = pH; }
    Water(String type, double volume, String source, boolean purified, double pH, String color) { this.type = type; this.volume = volume; this.source = source; this.purified = purified; this.pH = pH; this.color = color; }
    
	void display() {
		
	  System.out.println("Type:"+this.type);
	  System.out.println("volume:"+this.volume);
	  System.out.println("source:"+this.source);
	  System.out.println("purified:"+this.purified);
	  System.out.println("pH:"+this.pH);
	  System.out.println("color:"+this.color);
	  System.out.println("......................................................");
    }
	}