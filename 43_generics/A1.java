import java.util.ArrayList;

class A1 
{
    public static void main(String args[])
    {
        // Note : jab bhi declaration side mai <? super ....> eaisa likha ho to hum instansition side mai  same type or parent(super)type hi likha sakte hai jaisa ki isa exmaple mai kiya hai hum ne..but agar ap ne same or parent type ke alawa or kuch likha hai to fir error aajayega..

        ArrayList <? super Dog > list1 = new ArrayList<Human> ();

        ArrayList <? super Dog > list2 = new ArrayList <BDog> ();
    }
}

// D:\javaprac\43_generics>javac A1.java
// A1.java:7: error: incompatible types: ArrayList<Human> cannot be converted to ArrayList<? super Dog>
//         ArrayList <? super Dog > list1 = new ArrayList<Human> ();
//                                          ^
// A1.java:9: error: incompatible types: ArrayList<BDog> cannot be converted to ArrayList<? super Dog>
//         ArrayList <? super Dog > list2 = new ArrayList <BDog> ();
//                                          ^
// 2 errors