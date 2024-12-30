import java.util.ArrayList;

class X2 
{
    public static void main(String args[])
    {
        ArrayList x = new ArrayList();

        x.add("mohan");
        x.add("ganesh");
        x.add("bikram");
        x.add("raj");
        x.add("swaraj");

        for(String y : x){
            System.out.println(y);
        }
    }
}


// D:\javaprac\37_collections>javac X2.java
// X2.java:15: error: incompatible types: Object cannot be converted to String
//         for(String y : x){
//                        ^
// Note: X2.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.
// 1 error