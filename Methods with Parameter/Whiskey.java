class Whiskey {

    public static void pour(String brand) {
        System.out.println(brand);
		String yeah="jack Denials";
		int num = 69;
		boolean yes= true;
		drink(yeah);
		sip(num);
		serve(yeah,num);
		taste(yeah,yes);
		mix(yeah,yeah,yes);
		order(yeah,num,yes);
    }
    public static void drink(String type) {
        System.out.println(type);
    }
    public static void sip(int count) {
        System.out.println(count);
    }
    public static void serve(String glassType, int volume) {
        System.out.println(glassType + volume);
    }
    public static void taste(String brand, boolean isAged) {
        System.out.println(brand + isAged);
    }
    public static void mix(String whiskeyType, String mixer, boolean isChilled) {
        System.out.println(whiskeyType + mixer + isChilled);
    }

    public static void order(String brand, int bottles, boolean isExpressDelivery) {
        System.out.println(brand + bottles + isExpressDelivery);
    }
}
