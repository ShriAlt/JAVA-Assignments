class Gun {
    String model;
    String type;
    int capacity;
    double weight;
    String material;
    boolean isLoaded;
    
    Gun() {}
    Gun(String model) { this.model = model; }
    Gun(String model, String type) { this.model = model; this.type = type; }
    Gun(String model, String type, int capacity) { this.model = model; this.type = type; this.capacity = capacity; }
    Gun(String model, String type, int capacity, double weight) { this.model = model; this.type = type; this.capacity = capacity; this.weight = weight; }
    Gun(String model, String type, int capacity, double weight, String material) { this.model = model; this.type = type; this.capacity = capacity; this.weight = weight; this.material = material; }
    Gun(String model, String type, int capacity, double weight, String material, boolean isLoaded) { this.model = model; this.type = type; this.capacity = capacity; this.weight = weight; this.material = material; this.isLoaded = isLoaded; }
    
	void display() {
		
	  System.out.println("model:"+this.model);
	  System.out.println("type:"+this.type);
	  System.out.println("capacity:"+this.capacity);
	  System.out.println("weight:"+this.weight);
	  System.out.println("material:"+this.material);
	  System.out.println("isLoaded:"+this.isLoaded);
	  System.out.println("......................................................");
    }
	}