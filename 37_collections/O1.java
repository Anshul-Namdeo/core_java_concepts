import java.util.ArrayList;

class O1 
{
    public static void main(String args[])
    {
        ArrayList x = new ArrayList();

        x.add(5);

        System.out.println(x);
    }
}


// D:\javaprac\37_collections>javac O1.java
// Note: O1.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.



// NOTE -> ArrayList ka object bana Safe hai 
// Object ko bana ne se koi bhi boring nhi aati hai
// lekin jb usa object par kissi bhi tarah ka operation karte hai to usa mai 
// boring aati hai 