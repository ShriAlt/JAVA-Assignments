class Dmart {
   
    public static void shop(String product) {
        System.out.println( product);
		String yeah="item";
		int num=69;
		double n1=69.69;
		checkout(yeah);
		discount(num);
		buy(yeah,num);
		payment(yeah,n1);
		order(yeah,num,yeah);
		returnItem(yeah,num,yeah);
    }

    public static void checkout(String bill) {
        System.out.println( bill);
    }

    public static void discount(int percent) {
        System.out.println(percent);
    }

  
    public static void buy(String item, int quantity) {
        System.out.println(quantity +item);
    }

    public static void payment(String method, double amount) {
        System.out.println(amount + method);
    }

    
    public static void order(String item, int quantity, String deliveryMode) {
        System.out.println(quantity + item + deliveryMode);
    }

    public static void returnItem(String item, int days, String reason) {
        System.out.println(item + days + reason);
		String ref = "yes";
		Mask.wear(ref);
    }
}
