import java.util.Arrays;

class MainFunction{
	public static void sorting(String value){
		char[] values=value.toCharArray();
		Arrays.sort(values);
		System.out.println("in asending order");
		for(char alphabet: values){
			System.out.println(alphabet);
		}
		
		
	}
}