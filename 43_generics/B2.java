import java.util.ArrayList;

class B2
{
    public static void main (String args[])
    {
        ArrayList <? super Cat> list1 = new ArrayList<Cat>();
        ArrayList<? super Cat> list2 = new ArrayList<Animal>();
        ArrayList<? super Cat> list3 = new ArrayList<LivingBeing>();
        ArrayList<? super Cat> list4 = new ArrayList<Object>();

        // ADD karte hai ab....

               
                // list1.add(new Cow());
                // list1.add(new Animal());
                // list1.add(new LivingBeing());
                // list1.add(new Object());
                // list1.add(new Dog()); 
                // list1.add(new BDog()); 

                 list1.add(new Cat()); // ok
                list1.add(new billi()); // ok


    }
}