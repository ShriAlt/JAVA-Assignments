class Wire{
	static void connect(){
		System.out.println("running in wire m21");
	}
	static void cut(){
		System.out.println("running in wire m22");
		lengthWire();
		shortCircuit();
	}
	static void lengthWire(){
		System.out.println("running in wire m23");
	}
	static void shortCircuit(){
		System.out.println("running in wie m24");
		Bracelet.gold();
		Bracelet.silver();
	}
}