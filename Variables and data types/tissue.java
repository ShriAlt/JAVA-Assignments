class Tissue{
	public static void main(String[] values){
		System.out.println("assignment on long data tpe");
		long phone=63612;
		long random=8546448684L;
		long orders=64848L;
		long payment=44454444884L;
		long refno=5565644664L;
		System.out.println(phone);
		System.out.println(random);
		System.out.println(orders);
		System.out.println(payment);
		System.out.println(refno);
		System.out.println("after re-init");
		phone=999999999;
		random=444444445;
		orders=8974949;
		payment=767989;
		refno=8900989998L;
		System.out.println(phone);
		System.out.println(random);
		System.out.println(orders);
		System.out.println(payment);
		System.out.println(refno);
		
	}
}