class H2 
{
    static void pro(Animal... x)
    {
         for(Animal next : x)
        {
            System.out.println(next);
        }
    }

    public static void main(String args[])
    {
        Cat t = new Cat();
        Cow w = new Cow();
        Dog d = new Dog();
        BDog g = new BDog();
        LivingBeing e = new BDog();

        // pro(t, w, d, g, (Animal)e);  OK 
        // pro(t, w, d, g, (Dog)e);  OK
        pro(t, w, d, g, (BDog)e);  

        
    }
}

class LivingBeing { }
class Animal extends LivingBeing { }
class Cat extends Animal { }
class Cow extends Animal { }
class Dog extends Animal { }
class BDog extends Dog { }



// D:\javaprac\52_var_args>javac H2.java

// D:\javaprac\52_var_args>java H2
// Cat@372f7a8d
// Cow@2f92e0f4
// Dog@28a418fc
// BDog@5305068a
// BDog@1f32e575

// D:\javaprac\52_var_args>javac H2.java

// D:\javaprac\52_var_args>java H2
// Cat@372f7a8d
// Cow@2f92e0f4
// Dog@28a418fc
// BDog@5305068a
// BDog@1f32e575

// D:\javaprac\52_var_args>javac H2.java

// D:\javaprac\52_var_args>java H2
// Cat@372f7a8d
// Cow@2f92e0f4
// Dog@28a418fc
// BDog@5305068a
// BDog@1f32e575