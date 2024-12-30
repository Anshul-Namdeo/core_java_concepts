import java.util.HashMap;
import java.util.Set;

class H 
{
    public static void main(String args[])
    {
        HashMap <String,Integer> map = new HashMap <String,Integer> ();

        
        map.put("mohan",78);
        map.put("rohan",89);
        map.put("sohan",62);
        map.put("ganesh",100);
        map.put("vikram",56);

        System.out.println(map);

        for(Object obj : map)
        {
            System.out.println(obj);
        }
    }
}


// D:\javaprac\40_collections>javac H.java
// H.java:19: error: for-each not applicable to expression type
//         for(Object obj : map)
//                          ^
//   required: array or java.lang.Iterable
//   found:    HashMap<String,Integer>
// 1 error