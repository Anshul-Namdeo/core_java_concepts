import java.util.HashMap;
import java.util.Set;

class G1 
{
    public static void main(String[] args) {
        
        HashMap <String,Integer> map = new HashMap <String,Integer> ();

        map.put("mohan",78);
        map.put("rohan",89);
        map.put("sohan",62);
        map.put("ganesh",100);
        map.put("vikram",56);

        System.out.println(map);

        Set<String> set = map.keySet();

        for( String key : set )
        {
            System.out.println(key + " - " + map.get(key));
        }
    }
}


// D:\javaprac\40_collections>javac G1.java

// D:\javaprac\40_collections>java G1
// {sohan=62, rohan=89, vikram=56, mohan=78, ganesh=100}
// sohan - 62
// rohan - 89
// vikram - 56
// mohan - 78
// ganesh - 100