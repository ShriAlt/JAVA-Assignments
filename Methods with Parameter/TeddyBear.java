class TeddyBear {
    public static void hug(String name) {
        System.out.println(name);
		String refall="all Strings";
		int refallint=69;
		squeeze(refall);
		cuddle(refallint);
		gift(refall,refallint);
		store(refall,refallint);
		customize(refall,refallint,refall);
		play(refall,refallint,refall);
    }

    public static void squeeze(String type) {
        System.out.println(type);
    }
    public static void cuddle(int times) {
        System.out.println(times);
    }
    public static void gift(String name, int quantity) {
        System.out.println( quantity + name);
    }

    public static void store(String location, int count) {
        System.out.println(count +  location);
    }
    public static void customize(String color, int size, String material) {
        System.out.println( color + size + material);
    }

    public static void play(String name, int duration, String activity) {
        System.out.println(name + duration  + activity);
		String glow="wow";
		Tubelight.glow(glow);
    }
}
