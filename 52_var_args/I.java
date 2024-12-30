class I 
{
    static void pro(Animal... x)
    {
        System.out.println(x[0]);
        System.out.println(x[1]);
    }

    public static void main(String args[])
    {
        Dog d = new Dog();
        Dog c = new Dog();

        Dog[] m = {d,c};

        pro(m);
    }
}

class LivingBeing { }
class Animal extends LivingBeing { }
class Cat extends Animal { }
class Cow extends Animal { }
class Dog extends Animal { }
class BDog extends Dog { }


// D:\javaprac\52_var_args>javac I.java

// D:\javaprac\52_var_args>java I
// Dog@5ca881b5
// Dog@24d46ca6