class Brand{
	static void samsung(){
		System.out.println("m9.running in the brand");
	}
	static void mi(){
		System.out.println("m10.runnimg in brand");
		asus();
		fromSoft();
	}
	static void asus(){
		System.out.println("m11.running in brand");
		
	}
	static void fromSoft(){
		System.out.println("m12.running in brand");
		Pineapple.eat();
		Pineapple.slice();
	}
}