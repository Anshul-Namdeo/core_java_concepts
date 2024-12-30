  


           /**** Singleton class banane ke steps ****/

     //  step1) decalre all the constructor private so that no one can create object of singleton class c
     //  step2) declare a static variable of the(E) class Type.. and aasign an object of the same class..
     //  setp3) jo static variable banaya hai use Private mark karna padhega...
     //  step4) define a public static method which will retrun the one and only object stored in the static variable...

class F 
{
    // early initialization 

   private static F x = new F();

    private F()
    {
        
    }

    public static F getInstance()
    {
        return x;
    }
}

class X1 
{
    public static void main(String args[])
    {
        F a1 = new F(); // Not Ok
    }
}


// D:\javaprac\57_singleton_class>javac F.java
// F.java:32: error: F() has private access in F
//         F a1 = new F();
//                ^
// 1 error
