import java.util.HashMap;

class C 
{
    public static void main(String args[])
    {
        HashMap map = new HashMap();

        map.put("mohan",78);
        map.put("rohan",89);
        map.put("sohan",62);
        map.put("ganesh",100);
        map.put("vikram",56);

        Integer x = map.get("sohan");

        System.out.println(x);
    }
}


// D:\javaprac\40_collections>javac C.java
// C.java:15: error: incompatible types: Object cannot be converted to Integer
//         Integer x = map.get("sohan");
//                            ^
// Note: C.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.
// 1 error