import java.util.LinkedHashMap;

class O
{
    public static void main(String args[])
    {
        LinkedHashMap<String,Integer> map = new LinkedHashMap <String,Integer> ();

        map.put("mohan",78);
        map.put("rohan",54);
        map.put("sohan",62);
        map.put("ganesh",100);
        map.put("vikram",12);

        System.out.println(map);
    }
}


// D:\javaprac\40_collections>javac O.java

// D:\javaprac\40_collections>java O
// {mohan=78, rohan=54, sohan=62, ganesh=100, vikram=12}
