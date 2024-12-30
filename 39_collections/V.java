import java.util.HashMap;


class V 
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
    }
}


// D:\javaprac\39_collections>java V
// {sohan=62, rohan=89, vikram=56, mohan=78, ganesh=100}