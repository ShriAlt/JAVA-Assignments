class Bucket {
    String material;
    int capacity;
    String color;
    boolean hasHandle;
    double weight;
    String brand;
    
    Bucket(){
		System.out.println("no args constructors");
	}
	
	
    Bucket(String material) { 
		this.material = material; 
	}
	
    Bucket(String material, int capacity) 
	{
		this.material = material;
		this.capacity = capacity; 
	}
	
    Bucket(String material, int capacity, String color) { 
		this.material = material;
		this.capacity = capacity;
		this.color = color; 
		}
	
    Bucket(String material, int capacity, String color, boolean hasHandle)
	{ 
		this.material = material;
		this.capacity = capacity;
		this.color = color;
		this.hasHandle = hasHandle;
	}
	
    Bucket(String material, int capacity, String color, boolean hasHandle, double weight) { 
		this.material = material; 
		this.capacity = capacity; 
		this.color = color; 
		this.hasHandle = hasHandle; 
		this.weight = weight; 
	}
	
    Bucket(String material, int capacity, String color, boolean hasHandle, double weight, String brand) { 
	this.material = material;
	this.capacity = capacity;
	this.color = color; 
	this.hasHandle = hasHandle;
	this.weight = weight;
	this.brand = brand; 
	}
	
    
    void display() {
		
		System.out.println("material:"+this.material);
	  System.out.println("capacity:"+this.capacity);
	  System.out.println("brand:"+this.brand);
	  System.out.println("color:"+this.color);
	  System.out.println("hasHandle:"+this.hasHandle);
	  System.out.println("weight:"+this.weight);
		System.out.println("......................................................");
    }
}