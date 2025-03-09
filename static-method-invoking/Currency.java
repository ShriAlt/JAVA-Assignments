class Currency{
	static void usd(){
		System.out.println("running in currency m37 ");
	}
	static void rupee(){
		System.out.println("running in currency m38");
		yen();
		darames();
	}
	static void yen(){
		System.out.println("running in currency m39");
	}
	static void darames(){
		System.out.println("running in currency m40");
		Bitcoin.checkBalance();
		Bitcoin.sellBitcoin();
	}
}