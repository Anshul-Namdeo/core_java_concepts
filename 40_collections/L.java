import java.util.HashMap;

class L 
{
    public static void main(String args[])
    {
        HashMap<String,Integer> map = new HashMap <String,Integer> ();

        map.put("mohan",78);
        map.put(null,54);
        map.put("sohan",62);
        map.put("ganesh",100);
        map.put(null,12);

        System.out.println(map);
    }
}


// D:\javaprac\40_collections>javac L.java

// D:\javaprac\40_collections>java L
// {null=12, sohan=62, mohan=78, ganesh=100}
