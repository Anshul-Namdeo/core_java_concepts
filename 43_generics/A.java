import java.util.ArrayList;

class A 
{
    public static void main(String args[])
    {
        // Note : jab bhi declaration side mai <? super ....> eaisa likha ho to hum instansition side mai  same type or parent(super)type hi likha sakte hai jaisa ki isa exmaple mai kiya hai hum ne..

        ArrayList<? super Dog > list1 = new ArrayList <Dog> ();
        ArrayList<? super Dog > list2 = new ArrayList <Animal> ();
        ArrayList<? super Dog > list3 = new ArrayList <LivingBeing> ();
        ArrayList<? super Dog > list4 = new ArrayList <Object> ();
    }
}

// hapily compile and run.....