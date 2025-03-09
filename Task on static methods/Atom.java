class Atom {
   static void element() { 
        System.out.println("Element: Hydrogen"); 
		protons();
    }

   static void atomicNumber() { 
        System.out.println("Atomic Number: 1"); 
    }

   static void atomicMass() { 
        System.out.println("Atomic Mass: 1.008 u"); 
    }

   static void state() { 
        System.out.println("State: Gas"); 
    }

   static void electrons() { 
        System.out.println("Electrons: 1");
		neutrons();
		boilingPoint();
		meltingPoint();
		isotope(); 
		
    }

   static void protons() { 
        System.out.println("Protons: 1"); 
		Globe.shape();
		Globe.material();
		Globe.diameter();
		Globe.continents();
		Globe.oceans();
    }

  static  void neutrons() { 
        System.out.println("Neutrons: 0"); 
    }

   static void boilingPoint() { 
        System.out.println("Boiling Point: -252.9°C"); 
    }

    static void meltingPoint() { 
        System.out.println("Melting Point: -259.2°C"); 
    }

    static void isotope() { 
        System.out.println("Most common isotope: Hydrogen-1"); 
    }
}
