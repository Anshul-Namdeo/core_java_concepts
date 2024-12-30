import java.util.HashMap;

class K 
{
    public static void main(String args[])
    {
        HashMap<String,Integer> map = new HashMap <String,Integer> ();

        map.put("mohan",78);
        map.put("rohan",null);
        map.put("sohan",62);
        map.put("ganesh",100);
        map.put("vikram",null);

        System.out.println(map);
    }
}

// collections>javac K.java

// D:\javaprac\40_collections>java K
// {sohan=62, rohan=null, vikram=null, mohan=78, ganesh=100}