class Gun { 
    public static void main(String[] args) { 
        System.out.println("Assignment on character data type");
        char letter = 'a';
        char six = '6';
        String word = "hey";
        String text = "hello";
		System.out.println(letter); 
        System.out.println(word); 
        System.out.println(six); 
        System.out.println(text); 
		System.out.println("After re-init:");
		letter = 'a';
        six = '6';
        word = "hey";
        text = "hello";
        
        System.out.println(letter); 
        System.out.println(word); 
        System.out.println(six); 
        System.out.println(text); 
    }
}
