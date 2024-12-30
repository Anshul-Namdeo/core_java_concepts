import java.util.HashMap;

class W 
{
    public static void main(String args[])
    {
        HashMap map = new HashMap();

        map.put("mohan",78);
        map.put("rohan",89);
        map.put("sohan",62);
        map.put("ganesh",100);
        map.put("vikram",56);
        map.put("sohan",34);

        System.out.println(map);
    }
}


D:\javaprac\39_collections>javac W.java
// Note: W.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.

// D:\javaprac\39_collections>java W
// {sohan=34, rohan=89, vikram=56, mohan=78, ganesh=100}
