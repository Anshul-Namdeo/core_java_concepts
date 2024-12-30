import java.util.ArrayList;

class U1
{
    public static void main(String args[])
    {
       // ArrayList <? extends Animal> x1 = new ArrayList <LivingBeing> ();
       ArrayList <? extends Animal> x2 = new ArrayList <Animal> ();
       ArrayList <? extends Animal> x3 = new ArrayList <Cat> ();
       ArrayList <? extends Animal> x4 = new ArrayList <Cow> ();
       ArrayList <? extends Animal> x5 = new ArrayList <Dog> ();
       ArrayList <? extends Animal> x6 = new ArrayList <BDog> ();

    }
}

class LivingBeing { }
class Animal extends LivingBeing { }
class Cat extends Animal { }
class Cow extends Animal { }
class Dog extends Animal { }
class BDog extends Animal { }


/// happily compile and run ...