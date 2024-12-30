import java.util.HashMap;

class Z 
{
    public static void main(String args[])
    {
        HashMap map = new HashMap();

       System.out.println(map.put("mohan",78));
       System.out.println(map.put("rohan",89));
       System.out.println(map.put("sohan",62));
       System.out.println(map.put("ganesh",100));
       System.out.println(map.put("vikram",56));


       System.out.println(map.put("sohan",34));

       System.out.println(map);
    }
}


// D:\javaprac\39_collections>javac Z.java
// Note: Z.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.

// D:\javaprac\39_collections>java Z
// null
// null
// null
// null
// null
// 62
// {sohan=34, rohan=89, vikram=56, mohan=78, ganesh=100}