class Ballon{
	String name;
	int age;
	
	
	public Ballon(){
		System.out.println("no args constructor");
	}
	
	
	public Ballon(String name){
		this();
		this.name=name;
	}
	public Ballon(String name,int age){
		this(name);
		this.age=age;
	}
	public static void disply(){
		
		System.out.println(this.name+this.age);
	}
}