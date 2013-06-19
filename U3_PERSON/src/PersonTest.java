//==============================================================================
//        * Letsch Informatik *       www.LetsInfo.ch       CH-8636 Wald
//          Beratung, Ausbildung und Realisation in Software-Engineering
//==============================================================================
// Project   : Master of Advanced Studies in Software-Engineering 2013
// Modul     : OO-Einführung mit UML und Java
//             Teil: UML -> Java
// Title     : Übung 3: Klasse Person
// Author    : Thomas Letsch 
// Tab-Width : 2
/*///===========================================================================
* Description: Klasse Person.
CVS:$Revision: 1.15 $  $Date: 2013/04/22 16:12:03 $
/*///===========================================================================
//       1         2         3         4         5         6         7         8
//345678901234567890123456789012345678901234567890123456789012345678901234567890
//==============================================================================

// dazugehörige TestKlasse

public class PersonTest { 
  
  public static void main(String[] args) { 
    
    Person pers = new Person(); // neue Instanz
    
    String name = "John "; // könnte auch John Doe sein
    pers.setName(name);
    pers.setAlter(40);
    pers.setSex(true);
    
    Person pers2 = new Person();
    pers2.setName("Frieda Meier");
    
    		
    System.out.println("Name der Person  : " + pers.getName());
    System.out.println("Alter der Person : " + pers.getAlter());
    if (pers.getSex() == true)
    	{System.out.println(pers.getName() + " ist ein Mann");}
    else
    {System.out.println(pers.getName() + " ist eine Frau");}
    
    System.out.println(pers2.getName());
    
    
	  
  }
}


/* Session-Log:

Name der Person  : John
Alter der Person : 40

*/
