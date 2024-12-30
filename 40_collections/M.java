import java.util.Hashtable;

class M 
{
    public static void main(String args[])
    {
        Hashtable<String,Integer> map = new Hashtable <String,Integer> ();

        map.put("mohan",78);
        map.put("rohan",null);
        map.put("sohan",62);
        map.put("ganesh",100);
        map.put("vikram",null);

        System.out.println(map);
    }
}


// D:\javaprac\40_collections>javac M.java

// D:\javaprac\40_collections>java M
// Exception in thread "main" java.lang.NullPointerException
//         at java.base/java.util.Hashtable.put(Hashtable.java:476)
//         at M.main(M.java:10)
