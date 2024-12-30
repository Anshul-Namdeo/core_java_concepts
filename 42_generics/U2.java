import java.util.ArrayList;

class U2
{
    public static void main(String args[])
    {
       // ArrayList <? extends Animal> x1 = new ArrayList <LivingBeing> ();
       ArrayList <? extends Animal> x2 = new ArrayList <Animal> ();
       ArrayList <? extends Animal> x3 = new ArrayList <Cat> ();
       ArrayList <? extends Animal> x4 = new ArrayList <Cow> ();
       ArrayList <? extends Animal> x5 = new ArrayList <Dog> ();
       ArrayList <? extends Animal> x6 = new ArrayList <BDog> ();

       System.out.println(x2);
       System.out.println(x3);
       System.out.println(x4);
       System.out.println(x5);
       System.out.println(x6);

    }
}

class LivingBeing { }
class Animal extends LivingBeing { }
class Cat extends Animal { }
class Cow extends Animal { }
class Dog extends Animal { }
class BDog extends Animal { }



// D:\javaprac\42_generics>javac U2.java

// D:\javaprac\42_generics>java U2
// []
// []
// []
// []
// []
