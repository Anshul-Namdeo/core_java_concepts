import java.util.HashMap;

class E 
{
    public static void main(String args[])
    {
        HashMap <String,Integer> map = new HashMap<String,Integer>();

        map.put("mohan",78);
        map.put("rohan",89);
        map.put("sohan",62);
        map.put("ganesh",100);
        map.put("vikram",56);

        Boolean x = map.containsKey("sohan");
        System.out.println(x);
    }
}


// D:\javaprac\40_collections>javac E.java

// D:\javaprac\40_collections>java E
// true