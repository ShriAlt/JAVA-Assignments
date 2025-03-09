class Bracelet{
	static void gold(){
		System.out.println("running in bracelet m25");
	}
	static void silver(){
		System.out.println("runninng in bracelet m26");
		brass();
		roseGold();
	}
	static void brass(){
		System.out.println("runninng in bracelet m27");
		
	}
	static void roseGold(){
		System.out.println("running in bracelet m28");
		Perfume.whisky();
		Perfume.wildStone();
	}
}