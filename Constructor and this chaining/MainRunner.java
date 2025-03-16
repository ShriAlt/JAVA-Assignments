class MainRunner
{
public static void main(String[] args) {
        Baloon b1 = new Baloon();
        Baloon b2 = new Baloon("Red");
        Baloon b3 = new Baloon("Blue", "Heart");
        Baloon b4 = new Baloon("Green", "Round", 'S');
        Baloon b5 = new Baloon("Yellow", "Square", 'M', 3);
        Baloon b6 = new Baloon("Pink", "Rubber", 'L', 4,2.4f);
        Baloon b7 = new Baloon("Purple", "Latex",'S',6, 0.5f  , true);
        
        b1.display();
        b2.display();
        b3.display();
        b4.display();
        b5.display();
        b6.display();
        b7.display();
    
	
       System.out.println("............................................................");
        
        Holi h1 = new Holi();
        Holi h2 = new Holi("Gulal");
        Holi h3 = new Holi("Dry", 5);
        Holi h4 = new Holi("Wet", 7, true);
        Holi h5 = new Holi("Organic", 10, true, "Rose");
        Holi h6 = new Holi("Neon", 8, false, "Lemon", 200);
        Holi h7 = new Holi("Classic", 6, true, "Jasmine", 150, "HoliBrand");
        
        h1.display();
        h2.display();
        h3.display();
        h4.display();
        h5.display();
        h6.display();
        h7.display();
		
		 System.out.println("............................................................");
        
		
		Bucket buckets1 = new Bucket();
        Bucket buckets2 = new Bucket("Plastic");
        Bucket buckets3= new Bucket("Metal", 10);
        Bucket buckets4 = new Bucket("Steel", 15, "Blue");
        Bucket buckets5 = new Bucket("Aluminum", 20, "Red", true);
        Bucket buckets6 = new Bucket("Plastic", 25, "Green", false, 2.5);
        Bucket buckets7 = new Bucket("Iron", 30, "Yellow", true, 3.0, "SuperBrand");
        
		buckets1.display();
		buckets2.display();
		buckets3.display();
		buckets4.display();
		buckets5.display();
		buckets6.display();
		buckets7.display();
		
		
		System.out.println("............................................................");
        
		Pichkari p1 = new Pichkari();
       Pichkari  p2 = new Pichkari("Water Gun");
        Pichkari p3 = new Pichkari("Pump", 500);
       Pichkari  p4 = new Pichkari("Manual", 750, "Red");
        Pichkari p5 = new Pichkari("Automatic", 1000, "Blue", true);
        Pichkari p6 = new Pichkari("Super Soaker", 1200, "Green", false, 15.5);
        Pichkari p7 = new Pichkari("Deluxe", 1500, "Yellow", true, 20.0, "SplashMaster");
        
		p1.display();
		p2.display();
		p3.display();
		p4.display();
		p5.display();
		p6.display();
		p7.display();
		
		System.out.println("............................................................");
        
		
		Gun g1 = new Gun();
        Gun g2 = new Gun("Pistol");
        Gun g3 = new Gun("Rifle", "Automatic");
        Gun g4 = new Gun("Shotgun", "Pump-action", 6);
        Gun g5= new Gun("Sniper", "Bolt-action", 5, 4.5);
        Gun g6 = new Gun("Revolver", "Single-action", 6, 1.2, "Steel");
        Gun g7 = new Gun("Machine Gun", "Fully automatic", 30, 7.5, "Composite", true);
        
		
		g1.display();
		g2.display();
		g3.display();
		g4.display();
		g5.display();
		g6.display();
		g7.display();
		
		System.out.println("............................................................");
        
		
		Color c1 = new Color();
        Color c2 = new Color("Red");
        Color c3 = new Color("Green", "#00FF00");
        Color c4 = new Color("Blue", "#0000FF", 0);
        Color c5 = new Color("Yellow", "#FFFF00", 255, 255);
        Color c6 = new Color("Cyan", "#00FFFF", 0, 255, 255);
        Color c7 = new Color("Magenta", "#FF00FF", 255, 0, 255, true);
		
		c1.display();
		c2.display();
		c3.display();
		c4.display();
		c5.display();
		c6.display();
		c7.display();
		
		System.out.println("............................................................");
		
		
		Egg e1 = new Egg();
        Egg e2 = new Egg("Chicken");
        Egg e3 = new Egg("Duck", 60.5);
        Egg e4 = new Egg("Quail", 30.0, "White");
        Egg e5 = new Egg("Turkey", 70.0, "Brown", true);
        Egg e6 = new Egg("Goose", 90.0, "Speckled", false, "Large");
        Egg e7 = new Egg("Ostrich", 1500.0, "Cream", true, "Extra Large", "Farm Raised");
        
		e1.display();
		e2.display();
		e3.display();
		e4.display();
		e5.display();
		e6.display();
		e7.display();
		
		System.out.println("............................................................");
		
		Tomato t1 = new Tomato();
        Tomato t2 = new Tomato("Cherry");
        Tomato t3 = new Tomato("Roma", "Red");
        Tomato t4 = new Tomato("Beefsteak", "Green", 0.5);
        Tomato t5 = new Tomato("Heirloom", "Yellow", 0.3, true);
        Tomato t6 = new Tomato("Plum", "Orange", 0.2, false, "Italy");
        Tomato t7 = new Tomato("Grape", "Red", 0.1, true, "USA", 10);
		
		
		
		t1.display();
		t2.display();
		t3.display();
		t4.display();
		t5.display();
		t6.display();
		t7.display();
		
		System.out.println("............................................................");
		
		WaterBall w1 = new WaterBall();
        WaterBall w2 = new WaterBall("Soft");
        WaterBall w3 = new WaterBall("Hard", 15);
        WaterBall w4 = new WaterBall("Soft", 20, "Blue");
        WaterBall w5 = new WaterBall("Medium", 18, "Red", true);
        WaterBall w6 = new WaterBall("Hard", 25, "Yellow", false, 0.8);
        WaterBall w7 = new WaterBall("Soft", 22, "Green", true, 0.5, "Rubber");
        
		
		w1.display();
		w2.display();
		w3.display();
		w4.display();
		w5.display();
		w6.display();
		w7.display();
		
		System.out.println("............................................................");
		
		
	    NailPolish np1 = new NailPolish();
        NailPolish np2 = new NailPolish("Red");
        NailPolish np3 = new NailPolish("Pink", "Lakme");
        NailPolish np4 = new NailPolish("Blue", "Maybelline", 199.99);
        NailPolish np5 = new NailPolish("Green", "Revlon", 250, true);
        NailPolish np6 = new NailPolish("Yellow", "Elle 18", 150, false, 10);
        NailPolish np7 = new NailPolish("Purple", "Nykaa", 300, true, 15, "Lavender");
        
        np1.display();
        np2.display();
        np3.display();
        np4.display();
        np5.display();
        np6.display();
        np7.display();
		
		System.out.println("............................................................");
		
		
		Water water1 = new Water();
        Water water2 = new Water("Mineral");
        Water water3 = new Water("Spring", 1.5);
        Water water4 = new Water("Distilled", 2.0, "River");
        Water water5 = new Water("Purified", 3.0, "Well", true);
        Water water6 = new Water("Alkaline", 2.5, "Mountain", true, 8.5);
        Water water7 = new Water("Sparkling", 1.0, "Filtered", false, 7.0, "Clear");
        
		
		water1.display();
        water2.display();
        water3.display();
        water4.display();
        water5.display();
        water6.display();
        water7.display();
		
		System.out.println("............................................................");
		
    }
}