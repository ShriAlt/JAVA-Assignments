class Ladder{
	public static void climb(String name){
		System.out.println(name);
	}
	public static void fold(String step){
		System.out.println(step);
		int num =9;
		climbDown(num);
		int n1=6;
		String ref="eminEm";
		climbUp(n1,ref);
		int n2=6;
		String ref1="me";
		size(n2,ref1);
		long n3 =6;
		byte b1=89;
		String case1="one";
		long ahhh=6767;
		byte ohh=75;
		String help="help";
		steps(n3,b1,case1);
		fall(ahhh,ohh,help);
		
	}
	public static void climbDown(int num){
		System.out.println(num);
	}
	public static void climbUp(int no , String name){
		System.out.println(no + name);
	}
	public static void size( int no , String company){
		System.out.println(no + company);
	}
	public static void steps(long num , byte step,String staires){
		System.out.println(num + step + staires);
	}
	public static void fall(long ah , byte oh, String help){
		System.out.println(ah+oh+help);
		String name="Ananya";
		WhiteBoard.write(name);
	}
}