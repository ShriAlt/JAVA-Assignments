class Runner{

public static void main(String[] values){

String mobileno= "8122185043";
String name=InfoRetriever.fetchInfo( mobileno);
System.out.println(name);

System.out.println("===================================================");

String companyName = "Adobe";
String OwnerName=InfoRetriever.MNCCompany( companyName);
System.out.println(OwnerName);

System.out.println("===================================================");

String foodItem = "Dham Biriyani";
int price=InfoRetriever.Restaurant( foodItem);
System.out.println(price);


System.out.println("===================================================");

long accNo = 73677L;
long balance=InfoRetriever.Bank( accNo);
System.out.println(balance);

System.out.println("===================================================");

 String source ="Microsoft 365" ;
int cost=InfoRetriever.Products( source);
System.out.println(cost);


System.out.println("===================================================");

String Pname ="Shri" ;
boolean alive=InfoRetriever.Patient( name);
System.out.println(alive);
}
}