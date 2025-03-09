class InfoRunner{
	public static void main (String[] args){
		long num =6361294787L;
		String name=Information.name(num);
		System.out.println("name:"+name);
		String coname= "Harsha";
		String cname=Information.company(coname);
		System.out.println("company name :"+cname);
		String fooditem="Biriyani";
		int price=Information.price(fooditem);
		System.out.println("food price:"+price);
		int accnum=63636;
		double balance=Information.balance(accnum);
		System.out.println("gjgj"+balance);
	}
}