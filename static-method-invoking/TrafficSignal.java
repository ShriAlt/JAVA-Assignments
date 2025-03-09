class TrafficSignal{
	static void changeSignal(){
		System.out.println("M5.running in traffic signal");
	}
	static void safeToGo(){
		System.out.println("m6.running in traffic signal");
		redStop();
		greenGo();
	}
	static void redStop(){
		System.out.println("m7.running in traffic safeToGo");
	}
	static void greenGo(){
		System.out.println("m8.running in traffic safeToGo");
		Brand.asus();
		Brand.fromSoft();
	}
}