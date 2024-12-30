import java.util.ArrayList;

class U 
{
    public static void main(String args[])
    {
        ArrayList <? extends Animal> x1 = new ArrayList <LivingBeing> ();
    }
}

class LivingBeing { }
class Animal extends LivingBeing { }
class Cat extends Animal { }
class Cow extends Animal { }
class Dog extends Animal { }
class BDog extends Animal { }




// D:\javaprac\42_generics>javac U.java
// U.java:7: error: incompatible types: ArrayList<LivingBeing> cannot be converted to ArrayList<? extends Animal>
//         ArrayList <? extends Animal> x1 = new ArrayList <LivingBeing> ();
//                                           ^
// 1 error
