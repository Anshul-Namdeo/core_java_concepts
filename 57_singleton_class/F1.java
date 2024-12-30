  


           /**** Singleton class banane ke steps ****/

     //  step1) decalre all the constructor private so that no one can create object oF1 singleton class c
     //  step2) declare a static variable oF1 the(F1) class Type.. and aasign an object oF1 the same class..
     //  setp3) jo static variable banaya hai use Private mark karna padhega...
     //  step4) deF1ine a public static method which will retrun the one and only object stored in the static variable...

class F1 
{
    // early initialization 

   private static F1 x = new F1();

    private F1()
    {
        
    }

    public static F1 getInstance()
    {
        return x;
    }
}

class X2 
{
    public static void main(String args[])
    {
       // F1 a1 = new F1();  Not Ok

        F1 a2 = F.x ;  // Not Ok
    }
}


// D:\javaprac\57_singleton_class>javac F1.java
// F1.java:34: error: x has private access in F
//         F1 a2 = F.x ;
//                  ^
// .\F.java:32: error: F() has private access in F
//         F a1 = new F(); // Not Ok
//                ^
// 2 errors
