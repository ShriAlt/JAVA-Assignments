class MainRunner{
	public static void main(String... values){
		String name="harsha";
		String day="wed";
		int time=23;
		Festival festival=new Festival(name,day,time);
		System.out.println("Name:"+festival.name);
		System.out.println("day:"+festival.day);
		System.out.println("time:"+festival.time);
		
		String name1="harsha";
		String day1="wed";
		int time1=23;
		Festival festival1=new Festival(name,day,time);
		System.out.println("Name:"+festival1.name);
		System.out.println("day:"+festival1.day);
		System.out.println("time:"+festival1.time);
		
		String name2="harsha";
		String day2="wed";
		int time2=23;
		Festival festival2=new Festival(name,day,time);
		System.out.println("Name:"+festival2.name);
		System.out.println("day:"+festival2.day);
		System.out.println("time:"+festival2.time);
		
		String name3="harsha";
		String day3="wed";
		int time3=23;
		Festival festival3=new Festival(name,day,time);
		System.out.println("Name:"+festival3.name);
		System.out.println("day:"+festival3.day);
		System.out.println("time:"+festival3.time);
		
		String name4="harsha";
		String day4="wed";
		int time4=23;
		Festival festival4=new Festival(name,day,time);
		System.out.println("Name:"+festival4.name);
		System.out.println("day:"+festival4.day);
		System.out.println("time:"+festival4.time);



		
		String title = "Sales Chart";
        String type = "Bar";
        int dataPoints = 10;
        Chart chart1 = new Chart(title, type, dataPoints);
        System.out.println("Title: " + chart1.title);
        System.out.println("Type: " + chart1.type);
        System.out.println("Data Points: " + chart1.dataPoints);
		

        String title2 = "Growth Chart";
        String type2 = "Line";
        int dataPoints2 = 15;
        Chart chart2 = new Chart(title2, type2, dataPoints2);
        System.out.println("Title: " + chart2.title);
        System.out.println("Type: " + chart2.type);
        System.out.println("Data Points: " + chart2.dataPoints);
 

        String title3 = "Population Chart";
        String type3 = "Pie";
        int dataPoints3 = 8;
        Chart chart3 = new Chart(title3, type3, dataPoints3);
        System.out.println("Title: " + chart3.title);
        System.out.println("Type: " + chart3.type);
        System.out.println("Data Points: " + chart3.dataPoints);
    

        String title4 = "Stock Market Chart";
        String type4 = "Candlestick";
        int dataPoints4 = 20;
        Chart chart4 = new Chart(title4, type4, dataPoints4);
        System.out.println("Title: " + chart4.title);
        System.out.println("Type: " + chart4.type);
        System.out.println("Data Points: " + chart4.dataPoints);
      
        String title5 = "Weather Trends";
        String type5 = "Area";
        int dataPoints5 = 12;
        Chart chart5 = new Chart(title5, type5, dataPoints5);
        System.out.println("Title: " + chart5.title);
        System.out.println("Type: " + chart5.type);
        System.out.println("Data Points: " + chart5.dataPoints);
		
		
		
		String variant1 = "Disinfectant";
        int volume1 = 500;
        String fragrance1 = "Lemon";

        Harpic harpic1 = new Harpic(variant1, volume1, fragrance1);
        System.out.println("Variant: " + harpic1.variant);
        System.out.println("Volume: " + harpic1.volume + "ml");
        System.out.println("Fragrance: " + harpic1.fragrance);

        String variant2 = "Toilet Cleaner";
        int volume2 = 750;
        String fragrance2 = "Rose";

        Harpic harpic2 = new Harpic(variant2, volume2, fragrance2);
        System.out.println("Variant: " + harpic2.variant);
        System.out.println("Volume: " + harpic2.volume + "ml");
        System.out.println("Fragrance: " + harpic2.fragrance);

        String variant3 = "Bathroom Cleaner";
        int volume3 = 1000;
        String fragrance3 = "Lavender";

        Harpic harpic3 = new Harpic(variant3, volume3, fragrance3);
        System.out.println("Variant: " + harpic3.variant);
        System.out.println("Volume: " + harpic3.volume + "ml");
        System.out.println("Fragrance: " + harpic3.fragrance);

        String variant4 = "Multipurpose Cleaner";
        int volume4 = 600;
        String fragrance4 = "Pine";

        Harpic harpic4 = new Harpic(variant4, volume4, fragrance4);
        System.out.println("Variant: " + harpic4.variant);
        System.out.println("Volume: " + harpic4.volume + "ml");
        System.out.println("Fragrance: " + harpic4.fragrance);

        String variant5 = "Floor Cleaner";
        int volume5 = 900;
        String fragrance5 = "Jasmine";

        Harpic harpic5 = new Harpic(variant5, volume5, fragrance5);
        System.out.println("Variant: " + harpic5.variant);
        System.out.println("Volume: " + harpic5.volume + "ml");
        System.out.println("Fragrance: " + harpic5.fragrance);
		
		String version1 = "2.23.10";
        int users1 = 2000000000;
        String developer1 = "Meta";

        WhatsApp app1 = new WhatsApp(version1, users1, developer1);
        System.out.println("Version: " + app1.version);
        System.out.println("Users: " + app1.users);
        System.out.println("Developer: " + app1.developer);

        String version2 = "2.22.19";
        int users2 = 1800000000;
        String developer2 = "Facebook Inc.";

        WhatsApp app2 = new WhatsApp(version2, users2, developer2);
        System.out.println("Version: " + app2.version);
        System.out.println("Users: " + app2.users);
        System.out.println("Developer: " + app2.developer);

        String version3 = "2.21.17";
        int users3 = 1500000000;
        String developer3 = "WhatsApp LLC";

        WhatsApp app3 = new WhatsApp(version3, users3, developer3);
        System.out.println("Version: " + app3.version);
        System.out.println("Users: " + app3.users);
        System.out.println("Developer: " + app3.developer);

        String version4 = "2.20.15";
        int users4 = 1200000000;
        String developer4 = "Brian Acton";

        WhatsApp app4 = new WhatsApp(version4, users4, developer4);
        System.out.println("Version: " + app4.version);
        System.out.println("Users: " + app4.users);
        System.out.println("Developer: " + app4.developer);

        String version5 = "2.19.10";
        int users5 = 1000000000;
        String developer5 = "Jan Koum";

        WhatsApp app5 = new WhatsApp(version5, users5, developer5);
        System.out.println("Version: " + app5.version);
        System.out.println("Users: " + app5.users);
        System.out.println("Developer: " + app5.developer);
		
		String compound1 = "Bromadiolone";
        int dangerLevel1 = 9;
        String producer1 = "Bayer";

        RatPoison poison1 = new RatPoison(compound1, dangerLevel1, producer1);
        System.out.println("Chemical Composition: " + poison1.chemicalComposition);
        System.out.println("Toxicity Level: " + poison1.toxicityLevel);
        System.out.println("Manufacturer: " + poison1.manufacturer);

        String compound2 = "Diphacinone";
        int dangerLevel2 = 8;
        String producer2 = "Bell Labs";

        RatPoison poison2 = new RatPoison(compound2, dangerLevel2, producer2);
        System.out.println("Chemical Composition: " + poison2.chemicalComposition);
        System.out.println("Toxicity Level: " + poison2.toxicityLevel);
        System.out.println("Manufacturer: " + poison2.manufacturer);

        String compound3 = "Brodifacoum";
        int dangerLevel3 = 10;
        String producer3 = "Reckitt Benckiser";

        RatPoison poison3 = new RatPoison(compound3, dangerLevel3, producer3);
        System.out.println("Chemical Composition: " + poison3.chemicalComposition);
        System.out.println("Toxicity Level: " + poison3.toxicityLevel);
        System.out.println("Manufacturer: " + poison3.manufacturer);

        String compound4 = "Warfarin";
        int dangerLevel4 = 7;
        String producer4 = "PestControl Inc.";

        RatPoison poison4 = new RatPoison(compound4, dangerLevel4, producer4);
        System.out.println("Chemical Composition: " + poison4.chemicalComposition);
        System.out.println("Toxicity Level: " + poison4.toxicityLevel);
        System.out.println("Manufacturer: " + poison4.manufacturer);

        String compound5 = "Cholecalciferol";
        int dangerLevel5 = 6;
        String producer5 = "EcoPoison Ltd.";

        RatPoison poison5 = new RatPoison(compound5, dangerLevel5, producer5);
        System.out.println("Chemical Composition: " + poison5.chemicalComposition);
        System.out.println("Toxicity Level: " + poison5.toxicityLevel);
        System.out.println("Manufacturer: " + poison5.manufacturer);
		
		String material1 = "Gold";
        double weight1 = 15.5;
        String color1 = "Yellow";

        Anklet anklet1 = new Anklet(material1, weight1, color1);
        System.out.println("Material: " + anklet1.material);
        System.out.println("Weight: " + anklet1.weight + " grams");
        System.out.println("Color: " + anklet1.color);

        String material2 = "Silver";
        double weight2 = 12.3;
        String color2 = "White";

        Anklet anklet2 = new Anklet(material2, weight2, color2);
        System.out.println("Material: " + anklet2.material);
        System.out.println("Weight: " + anklet2.weight + " grams");
        System.out.println("Color: " + anklet2.color);

        String material3 = "Platinum";
        double weight3 = 20.0;
        String color3 = "Gray";

        Anklet anklet3 = new Anklet(material3, weight3, color3);
        System.out.println("Material: " + anklet3.material);
        System.out.println("Weight: " + anklet3.weight + " grams");
        System.out.println("Color: " + anklet3.color);

        String material4 = "Diamond";
        double weight4 = 30.0;
        String color4 = "Clear";

        Anklet anklet4 = new Anklet(material4, weight4, color4);
        System.out.println("Material: " + anklet4.material);
        System.out.println("Weight: " + anklet4.weight + " grams");
        System.out.println("Color: " + anklet4.color);

        String material5 = "Titanium";
        double weight5 = 10.5;
        String color5 = "Black";

        Anklet anklet5 = new Anklet(material5, weight5, color5);
        System.out.println("Material: " + anklet5.material);
        System.out.println("Weight: " + anklet5.weight + " grams");
        System.out.println("Color: " + anklet5.color);
		
		 String polarity1 = "North";
        double strength1 = 120.5;
        String shape1 = "Circular";

        Magnet magnet1 = new Magnet(polarity1, strength1, shape1);
        System.out.println("Polarity: " + magnet1.polarity);
        System.out.println("Strength: " + magnet1.strength + " Tesla");
        System.out.println("Shape: " + magnet1.shape);

        String polarity2 = "South";
        double strength2 = 150.3;
        String shape2 = "Rectangular";

        Magnet magnet2 = new Magnet(polarity2, strength2, shape2);
        System.out.println("Polarity: " + magnet2.polarity);
        System.out.println("Strength: " + magnet2.strength + " Tesla");
        System.out.println("Shape: " + magnet2.shape);

        String polarity3 = "North";
        double strength3 = 180.8;
        String shape3 = "Horseshoe";

        Magnet magnet3 = new Magnet(polarity3, strength3, shape3);
        System.out.println("Polarity: " + magnet3.polarity);
        System.out.println("Strength: " + magnet3.strength + " Tesla");
        System.out.println("Shape: " + magnet3.shape);

        String polarity4 = "South";
        double strength4 = 100.0;
        String shape4 = "Disc";

        Magnet magnet4 = new Magnet(polarity4, strength4, shape4);
        System.out.println("Polarity: " + magnet4.polarity);
        System.out.println("Strength: " + magnet4.strength + " Tesla");
        System.out.println("Shape: " + magnet4.shape);

        String polarity5 = "North";
        double strength5 = 130.7;
        String shape5 = "Bar";

        Magnet magnet5 = new Magnet(polarity5, strength5, shape5);
        System.out.println("Polarity: " + magnet5.polarity);
        System.out.println("Strength: " + magnet5.strength + " Tesla");
        System.out.println("Shape: " + magnet5.shape);
		
		
		 String substance1 = "Steel";
        double size1 = 50.0;
        String style1 = "Heavy-duty";

        Chain chain1 = new Chain(substance1, size1, style1);
        System.out.println("Substance: " + chain1.substance);
        System.out.println("Size: " + chain1.size + " meters");
        System.out.println("Style: " + chain1.style);

        String substance2 = "Gold";
        double size2 = 25.5;
        String style2 = "Necklace";

        Chain chain2 = new Chain(substance2, size2, style2);
        System.out.println("Substance: " + chain2.substance);
        System.out.println("Size: " + chain2.size + " meters");
        System.out.println("Style: " + chain2.style);

        String substance3 = "Titanium";
        double size3 = 75.2;
        String style3 = "Industrial";

        Chain chain3 = new Chain(substance3, size3, style3);
        System.out.println("Substance: " + chain3.substance);
        System.out.println("Size: " + chain3.size + " meters");
        System.out.println("Style: " + chain3.style);

        String substance4 = "Copper";
        double size4 = 30.0;
        String style4 = "Decorative";

        Chain chain4 = new Chain(substance4, size4, style4);
        System.out.println("Substance: " + chain4.substance);
        System.out.println("Size: " + chain4.size + " meters");
        System.out.println("Style: " + chain4.style);

        String substance5 = "Silver";
        double size5 = 40.0;
        String style5 = "Fashion";

        Chain chain5 = new Chain(substance5, size5, style5);
        System.out.println("Substance: " + chain5.substance);
        System.out.println("Size: " + chain5.size + " meters");
        System.out.println("Style: " + chain5.style);
		
		String barName1 = "Whiskey Bar";
        double length1 = 15.5;
        String barType1 = "Counter Bar";

        Bar bar1 = new Bar(barName1, length1, barType1);
        System.out.println("Bar Name: " + bar1.barName);
        System.out.println("Length: " + bar1.length + " meters");
        System.out.println("Bar Type: " + bar1.barType);

        String barName2 = "Fitness Bar";
        double length2 = 10.0;
        String barType2 = "Barbell";

        Bar bar2 = new Bar(barName2, length2, barType2);
        System.out.println("Bar Name: " + bar2.barName);
        System.out.println("Length: " + bar2.length + " meters");
        System.out.println("Bar Type: " + bar2.barType);

        String barName3 = "Tiki Bar";
        double length3 = 12.0;
        String barType3 = "Tropical Bar";

        Bar bar3 = new Bar(barName3, length3, barType3);
        System.out.println("Bar Name: " + bar3.barName);
        System.out.println("Length: " + bar3.length + " meters");
        System.out.println("Bar Type: " + bar3.barType);

        String barName4 = "Metal Bar";
        double length4 = 8.5;
        String barType4 = "Structural Bar";

        Bar bar4 = new Bar(barName4, length4, barType4);
        System.out.println("Bar Name: " + bar4.barName);
        System.out.println("Length: " + bar4.length + " meters");
        System.out.println("Bar Type: " + bar4.barType);

        String barName5 = "Wine Bar";
        double length5 = 14.2;
        String barType5 = "Serving Bar";

        Bar bar5 = new Bar(barName5, length5, barType5);
        System.out.println("Bar Name: " + bar5.barName);
        System.out.println("Length: " + bar5.length + " meters");
        System.out.println("Bar Type: " + bar5.barType);
		
		 String faceShape1 = "Oval";
        int numOfEyes1 = 2;
        boolean hasBeard1 = false;

        Face face1 = new Face(faceShape1, numOfEyes1, hasBeard1);
        System.out.println("Face Shape: " + face1.faceShape);
        System.out.println("Number of Eyes: " + face1.numOfEyes);
        System.out.println("Has Beard: " + face1.hasBeard);

        String faceShape2 = "Round";
        int numOfEyes2 = 2;
        boolean hasBeard2 = true;

        Face face2 = new Face(faceShape2, numOfEyes2, hasBeard2);
        System.out.println("Face Shape: " + face2.faceShape);
        System.out.println("Number of Eyes: " + face2.numOfEyes);
        System.out.println("Has Beard: " + face2.hasBeard);

        String faceShape3 = "Square";
        int numOfEyes3 = 2;
        boolean hasBeard3 = false;

        Face face3 = new Face(faceShape3, numOfEyes3, hasBeard3);
        System.out.println("Face Shape: " + face3.faceShape);
        System.out.println("Number of Eyes: " + face3.numOfEyes);
        System.out.println("Has Beard: " + face3.hasBeard);

        String faceShape4 = "Heart-shaped";
        int numOfEyes4 = 2;
        boolean hasBeard4 = true;

        Face face4 = new Face(faceShape4, numOfEyes4, hasBeard4);
        System.out.println("Face Shape: " + face4.faceShape);
        System.out.println("Number of Eyes: " + face4.numOfEyes);
        System.out.println("Has Beard: " + face4.hasBeard);

        String faceShape5 = "Diamond";
        int numOfEyes5 = 2;
        boolean hasBeard5 = false;

        Face face5 = new Face(faceShape5, numOfEyes5, hasBeard5);
        System.out.println("Face Shape: " + face5.faceShape);
        System.out.println("Number of Eyes: " + face5.numOfEyes);
        System.out.println("Has Beard: " + face5.hasBeard);
		
		
		String sagarName="baale";
		int sagarAge=69;
		int sagarHeight=6;
		Sagar sagar=new Sagar(sagarName,sagarAge,sagarHeight);
		System.out.println("sagarName:"+sagar.name);
		System.out.println("sagarHeight:"+sagar.age);
		System.out.println("sagarAge:"+sagar.height);
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
      
	}
}