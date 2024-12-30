  


           /**** Singleton class banane ke steps ****/

     //  step1) decalre all the constructor private so that no one can create object oF2 singleton class c
     //  step2) declare a static variable oF2 the(F2) class Type.. and aasign an object oF2 the same class..
     //  setp3) jo static variable banaya hai use Private mark karna padhega...
     //  step4) deF2ine a public static method which will retrun the one and only object stored in the static variable...

class F2 
{
    // early initialization 

   private static F2 x = new F2();

    private F2()
    {
        
    }

    public static F2 getInstance()
    {
        return x;
    }
}

class X3 
{
    public static void main(String args[])
    {
       // F2 a1 = new F2();  Not Ok

        //F2 a2 = F.x ;  // Not Ok

         F2 a3 = F2.getInstance();

         System.out.println(a3);
    }
}


// D:\javaprac\57_singleton_class>javac F2.java

// D:\javaprac\57_singleton_class>java X3
// F2@36baf30c