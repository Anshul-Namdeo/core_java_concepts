import java.util.HashMap;

class E1 
{
    public static void main(String args[])
    {
        HashMap  map = new HashMap();

        map.put("mohan",78);
        map.put("rohan",89);
        map.put("sohan",62);
        map.put("ganesh",100);
        map.put("vikram",56);

        Boolean x = map.containsKey("sohan");
        System.out.println(x);
    }
}


// D:\javaprac\40_collections>javac E1.java
// Note: E1.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.

// D:\javaprac\40_collections>java E1
// true