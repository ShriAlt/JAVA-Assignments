class Ingridiants{
	public static String fetch(String foodname){
		if(foodname.equals("coffe")){
			return "milk and coffe";
		}
		else if(foodname.equals("tea")){
			return "milk and tea ";
		}
		else if(foodname.equals("dose")){
			return "sambar and chutney";
		}
		else return"item ingrdiants not found";
	}
}