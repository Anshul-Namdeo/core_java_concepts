import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

class I 
{
    public static void main(String args[])
    {
        HashMap <String,Integer> map = new HashMap <String,Integer> ();

         
        map.put("mohan",78);
        map.put("rohan",89);
        map.put("sohan",62);
        map.put("ganesh",100);
        map.put("vikram",56);

        System.out.println(map);

        Set<Entry<String,Integer>> set = map.entrySet();

        for( Entry<String,Integer> ent  : set) 
        {
            System.out.println(ent.getKey() + " - " + ent.getValue());
        }
    }
}

// D:\javaprac\40_collections>javac I.java

// D:\javaprac\40_collections>java I
// {sohan=62, rohan=89, vikram=56, mohan=78, ganesh=100}
// sohan - 62
// rohan - 89
// vikram - 56
// mohan - 78
// ganesh - 100
