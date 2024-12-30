import java.util.HashMap;

class A 
{

    public static void main(String args[])
    {
        HashMap map = new HashMap();

        map.put("mohan",78);
        map.put("rohan",89);
        map.put("sohan",62);
        map.put("ganesh",100);
        map.put("vikram",56);

        System.out.println(map.get("ganesh"));
        System.out.println(map);
    }
}


// D:\javaprac\40_collections>javac A.java
// Note: A.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.

// D:\javaprac\40_collections>java A
// 100
// {sohan=62, rohan=89, vikram=56, mohan=78, ganesh=100}
