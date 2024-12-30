import java.util.ArrayList;

class B 
{
    public static void main(String args[])
    {
            ArrayList<? super Dog > list1 = new ArrayList <Dog> ();
        ArrayList<? super Dog > list2 = new ArrayList <Animal> ();
        ArrayList<? super Dog > list3 = new ArrayList <LivingBeing> ();
        ArrayList<? super Dog > list4 = new ArrayList <Object> ();


            //   list1.add(new Cat());
            //   list1.add(new Cow());
            //   list1.add(new Animal());
            //   list1.add(new LivingBeing());
            //   list1.add(new Object());
              list1.add(new Dog()); // ok
              list1.add(new BDog()); // ok

            //   list2.add(new Cat());
            //   list2.add(new Cow());
            //   list2.add(new Animal());
            //   list2.add(new LivingBeing());
            //   list2.add(new Object());
             // list2.add(new Dog()); // ok
             // list2.add(new BDog()); // ok

              //   list3.add(new Cat());
            //   list3.add(new Cow());
            //   list3.add(new Animal());
            //   list3.add(new LivingBeing());
            //   list3.add(new Object());
             // list3.add(new Dog()); // ok
             // list3.add(new BDog()); // ok

              //   list4.add(new Cat());
            //   list4.add(new Cow());
            //   list4.add(new Animal());
            //   list4.add(new LivingBeing());
            //   list4.add(new Object());
             // list4.add(new Dog()); // ok
             // list4.add(new BDog()); // ok



    }
}


// D:\javaprac\43_generics>javac B.java
// B.java:13: error: incompatible types: Cat cannot be converted to CAP#1
//         list1.add(new Cat());
//                   ^
//   where CAP#1 is a fresh type-variable:
//     CAP#1 extends Object super: Dog from capture of ? super Dog
// B.java:14: error: incompatible types: Cow cannot be converted to CAP#1
//          list1.add(new Cow());
//                    ^
//   where CAP#1 is a fresh type-variable:
//     CAP#1 extends Object super: Dog from capture of ? super Dog
// B.java:15: error: incompatible types: Animal cannot be converted to CAP#1
//           list1.add(new Animal());
//                     ^
//   where CAP#1 is a fresh type-variable:
//     CAP#1 extends Object super: Dog from capture of ? super Dog
// B.java:16: error: incompatible types: LivingBeing cannot be converted to CAP#1
//            list1.add(new LivingBeing());
//                      ^
//   where CAP#1 is a fresh type-variable:
//     CAP#1 extends Object super: Dog from capture of ? super Dog
// B.java:17: error: incompatible types: Object cannot be converted to CAP#1
//             list1.add(new Object());
//                       ^
//   where CAP#1 is a fresh type-variable:
//     CAP#1 extends Object super: Dog from capture of ? super Dog
// Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
// 5 errors