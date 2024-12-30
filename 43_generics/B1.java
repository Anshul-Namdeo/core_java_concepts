import java.util.ArrayList;

class B1 
{
    public static void main (String args[])
    {
        ArrayList <? super Cat> list1 = new ArrayList<Cat>();
        ArrayList<? super Cat> list2 = new ArrayList<Animal>();
        ArrayList<? super Cat> list3 = new ArrayList<LivingBeing>();
        ArrayList<? super Cat> list4 = new ArrayList<Object>();

        // ADD karte hai ab....

               
                list1.add(new Cow());
                list1.add(new Animal());
                list1.add(new LivingBeing());
                list1.add(new Object());
                list1.add(new Dog()); 
                list1.add(new BDog()); 


    }
}


// D:\javaprac\43_generics>javac B1.java
// B1.java:15: error: incompatible types: Cow cannot be converted to CAP#1
//                 list1.add(new Cow());
//                           ^
//   where CAP#1 is a fresh type-variable:
//     CAP#1 extends Object super: Cat from capture of ? super Cat
// B1.java:16: error: incompatible types: Animal cannot be converted to CAP#1
//                 list1.add(new Animal());
//                           ^
//   where CAP#1 is a fresh type-variable:
//     CAP#1 extends Object super: Cat from capture of ? super Cat
// B1.java:17: error: incompatible types: LivingBeing cannot be converted to CAP#1
//                 list1.add(new LivingBeing());
//                           ^
//   where CAP#1 is a fresh type-variable:
//     CAP#1 extends Object super: Cat from capture of ? super Cat
// B1.java:18: error: incompatible types: Object cannot be converted to CAP#1
//                 list1.add(new Object());
//                           ^
//   where CAP#1 is a fresh type-variable:
//     CAP#1 extends Object super: Cat from capture of ? super Cat
// B1.java:19: error: incompatible types: Dog cannot be converted to CAP#1
//                 list1.add(new Dog());
//                           ^
//   where CAP#1 is a fresh type-variable:
//     CAP#1 extends Object super: Cat from capture of ? super Cat
// B1.java:20: error: incompatible types: BDog cannot be converted to CAP#1
//                 list1.add(new BDog());
//                           ^
//   where CAP#1 is a fresh type-variable:
//     CAP#1 extends Object super: Cat from capture of ? super Cat
// Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
// 6 errors