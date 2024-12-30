

             /**** Singleton class banane ke steps ****/

     //  step1) decalre all the constructor private so that no one can create object of singleton class c
     //  step2) declare a static variable of the(D) class Type.. and aasign an object of the same class..


class D 
{
    // early initialization 

    static D x = new D();

    private D()
    {
        
    }
}