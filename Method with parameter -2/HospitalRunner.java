class HospitalRunner{
	public static void main(String[] values){
		//patientname,age,mobile,email,sicknes
		String patientname="Harsha";
		int age= 20;
		long mobile=636129787L;
		String email="shriharshakm10@gmail.com";
		String sicknes="cold"; 
		Hospital.checkup(patientname,age,mobile,email,sicknes);
	}
}