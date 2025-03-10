class Wepons{
	public static int stats(String weponName){
		System.out.println("running in Wepons"+weponName);
		if (weponName.equals("sabimaru")) {
			int strength=56;
                return strength;
            } 
			else if (weponName.equals("kusabimaru")) {
                int strength=78;
                return strength;
            } 
			else if (weponName.equals("shuraken")) {
                int strength=76;
                return strength;
            } 
			else if (weponName.equals("firecraker")) {
                int strength=98;
                return strength;
            } 
			else if (weponName.equals("axe")) {
                int strength=67;
                return strength;
            }
			else return 000000;
	}
}