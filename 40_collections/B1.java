import java.util.HashMap;

class B1 
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

        System.out.println(map.remove("yamraj"));

        System.out.println(map);
    }
}


// D:\javaprac\40_collections>javac B1.java
// Note: B1.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.

// D:\javaprac\40_collections>java B1
// {sohan=62, rohan=89, vikram=56, mohan=78, ganesh=100}
// null
// {sohan=62, rohan=89, vikram=56, mohan=78, ganesh=100}
