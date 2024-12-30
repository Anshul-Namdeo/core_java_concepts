


            /**** Singleton class banane ke steps ****/

     //  step1) decalre all the constructor private so that no one can create object of singleton class c
     //  step2) declare a static variable of the(E) class Type.. and aasign an object of the same class..
     //  setp3) jo static variable banaya hai use Private mark karna padhega...

class E 
{
    // early initialization 

   private static E x = new E();

    private E()
    {
        
    }
}