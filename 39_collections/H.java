import java.util.TreeSet;

class H 
{
    public static void main(String[] args) {
        
        TreeSet set = new TreeSet();

        set.add(new Student("kartik",18));
        set.add(new Student("simha",9));
        set.add(new Student("vijendra",12));
        set.add(new Student("prasad",5));
        set.add(new Student("ganesh",10));

        System.out.println(set);
    }
}

class Student 
{
    String name ;
    Integer age ;   // Integer  wrapper class hai jo ki ek comparable interface 
                    //  ko implements karta hai isliye yaha exception aa raha hai.. 
    Student(String name,  Integer age )
    {
        this.name = name ;
        this.age = age ;
    }

    public String toString()
    {
        return name + " - " + age ;
    }
}

// D:\javaprac\39_collections>java H
// Exception in thread "main" java.lang.ClassCastException: class Student cannot be cast to class java.lang.Comparable (Student is in unnamed module of loader 'app'; java.lang.Comparable is in module java.base of loader 'bootstrap')
//         at java.base/java.util.TreeMap.compare(TreeMap.java:1569)
//         at java.base/java.util.TreeMap.addEntryToEmptyMap(TreeMap.java:776)
//         at java.base/java.util.TreeMap.put(TreeMap.java:785)
//         at java.base/java.util.TreeMap.put(TreeMap.java:534)
//         at java.base/java.util.TreeSet.add(TreeSet.java:255)
//         at H.main(H.java:9)