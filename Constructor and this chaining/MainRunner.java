class MainRunner{
	public static void main(String[] values){
	String name="huh";
		int age=45;
		Ballon ballon=new Ballon(name);
		Ballon ballon1=new Ballon(name,age);
		ballon.disply();
		ballon1.disply();
	}
}