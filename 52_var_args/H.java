class H 
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

        pro(t, w, d, g);
    }
}

class LivingBeing { }
class Animal extends LivingBeing { }
class Cat extends Animal { }
class Cow extends Animal { }
class Dog extends Animal { }
class BDog extends Dog { }



// D:\javaprac\52_var_args>javac H.java

// D:\javaprac\52_var_args>java H
// Cat@372f7a8d
// Cow@2f92e0f4
// Dog@28a418fc
// BDog@5305068a