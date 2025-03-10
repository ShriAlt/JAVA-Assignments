class Runner{
	public static void main(String[] value){
		System.out.println("explicit constructors");
		Facewash ref1=new Facewash();
		ref1=new Facewash();
		ref1=new Facewash();
		ref1=new Facewash();
		ref1=new Facewash();
		Oil name= new Oil("harsha");
		name= new Oil("harsha");
		name= new Oil("harsha");
		name= new Oil("harsha");
		name= new Oil("harsha");
		Bucket buk=new Bucket(6);
		 buk=new Bucket(6);
		  buk=new Bucket(6);
		   buk=new Bucket(6);
		    buk=new Bucket(6);
		Bat bat=new Bat();
		bat=new Bat();
		bat=new Bat();
		bat=new Bat();
		bat=new Bat();
		Cream cream=new Cream();
		cream=new Cream();
		cream=new Cream();
		cream=new Cream();
		cream=new Cream();
		System.out.println("implicit constructors");
		Bud bud=new Bud();
		Charger charge=new Charger();
		Slipper slip=new Slipper();
		Crocs croc=new Crocs();
		Sandels sand=new Sandels();
	}
}