import java.util.HashMap;

class X 
{
    public static void main(String args[])
    {
        HashMap map = new HashMap();

        map.put("mohan",78);
        map.put("yam",62);
        map.put("rohan",89);
        map.put("sohan",62);
        map.put("ganesh",100);
        map.put("vikram",56);
        map.put("golu",62);

        System.out.println(map);
    }
}


// D:\javaprac\39_collections>javac X.java
// Note: X.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.

// D:\javaprac\39_collections>java X
// {sohan=62, golu=62, rohan=89, vikram=56, yam=62, mohan=78, ganesh=100}