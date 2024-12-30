import java.util.HashMap;

class Y 
{
    public static void main(String args[])
    {
        
        HashMap map = new HashMap();

        map.put("mohan",78);
        map.put("rohan",89);
        map.put("sohan",62);
        map.put("ganesh",100);
        map.put("vikram",56);

        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.isEmpty());
    }
}


// D:\javaprac\39_collections>javac Y.java
// Note: Y.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.

// D:\javaprac\39_collections>java Y
// {sohan=62, rohan=89, vikram=56, mohan=78, ganesh=100}
// 5
// false