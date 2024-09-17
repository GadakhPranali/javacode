package assignments;
//WAP for multilevel inheritance in a single class proeram and also in a seprate class 
public class Assignment_21 
{
	// Base class
    static class Base 
    {
        void displayBase() 
        {
            System.out.println("This is the Base class.");
        }
    }
    // subclass inheriting from Base class
    static class Derived1 extends Base 
    {
        void displayDerived1() 
        {
            System.out.println("This is the Derived1 class, inheriting from Base.");
        }
    }
    // Further derived class inheriting from Derived1 class
    static class Derived2 extends Derived1 
    {
        void displayDerived2() 
        {
            System.out.println("This is the Derived2 class, inheriting from Derived1.");
        }
    }
    public static void main(String[] args) 
    {
        Derived2 obj = new Derived2();
        
        // Call methods from all levels of inheritance
        obj.displayBase();       // Method from Base class
        obj.displayDerived1();  // Method from Derived1 class
        obj.displayDerived2();  // Method from Derived2 class
    }
}

