import java.util.HashMap;

class D1 
{
    public static void main(String args[])
    {
        HashMap<String,Integer> map = new HashMap <String,Integer>();

        map.put("mohan",78);
        map.put("rohan","JEC");
        map.put("sohan",62);
        map.put(456,100);
        map.put("vikram",56);

        Integer x = map.get("sohan");
        System.out.println(x);


    }
}


// D:\javaprac\40_collections>javac D1.java
// D1.java:10: error: incompatible types: String cannot be converted to Integer
//         map.put("rohan","JEC");
//                         ^
// D1.java:12: error: incompatible types: int cannot be converted to String
//         map.put(456,100);
//                 ^
// Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
// 2 errors
