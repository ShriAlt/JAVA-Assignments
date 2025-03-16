class Baloon{

String color;
String shape;
char size;
int noOfBaloon;
float price;
boolean isInflated;

public Baloon()
{
System.out.println("The Baloon constructor first is diaplayed");

}

public Baloon(String color){
	super();
	this.color=color;

}
public Baloon(String color, String shape){
	this(color);
	this.shape=shape;

}
public Baloon(String color, String shape, char size){
	this(color,shape);
	this.size=size;

}
public Baloon(String color, String shape, char size, int noOfBaloon){
	this(color,shape,size);
	this.noOfBaloon=noOfBaloon;

}
public Baloon(String color, String shape, char size, int noOfBaloon, float price){
	this(color,shape,size,noOfBaloon);
	this.price=price;
}
public Baloon(String color, String shape, char size, int noOfBaloon, float price,boolean isInflated){
	this(color,shape,size,noOfBaloon,price);
	this.isInflated=isInflated;

}

void display() {
      System.out.println("Color:"+this.color);
	  System.out.println("Shape:"+this.shape);
	  System.out.println("Size:"+this.size);
	  System.out.println("noOfBaloon:"+this.noOfBaloon);
	  System.out.println("Price:"+this.price);
	  System.out.println("isInflated:"+this.isInflated);
		System.out.println("......................................................");
    }
}