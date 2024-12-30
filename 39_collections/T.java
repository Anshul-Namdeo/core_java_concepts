import java.util.TreeSet;

class T 
{
    public static void main(String args[])
    {
        TreeSet set = new TreeSet();

        set.add(56);
        set.add("mohan");
        set.add(true);
        set.add(5.5);

        System.out.println(set);
        System.out.println(set.isEmpty());
        System.out.println(set.size());
    }
}


// D:\javaprac\39_collections>java T
// Exception in thread "main" java.lang.ClassCastException: class java.lang.Integer cannot be cast to class java.lang.String (java.lang.Integer and java.lang.String are in module java.base of loader 'bootstrap')
//         at java.base/java.lang.String.compareTo(String.java:140)
//         at java.base/java.util.TreeMap.put(TreeMap.java:814)
//         at java.base/java.util.TreeMap.put(TreeMap.java:534)
//         at java.base/java.util.TreeSet.add(TreeSet.java:255)
//         at T.main(T.java:10)