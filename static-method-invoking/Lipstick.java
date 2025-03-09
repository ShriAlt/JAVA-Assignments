class Lipstick{
	static void apply(){
		System.out.println("m1.running in Lipstick");
	}
	static void remove(){
		System.out.println("m2.running in Lipstick");
		color();
		shade();
	}
	static void color(){
		System.out.println("m3.running in lipstick");
	}
	static void shade(){
		System.out.println("m4.running in the lipstick");
		TrafficSignal.changeSignal();
		TrafficSignal.safeToGo();
	}
}