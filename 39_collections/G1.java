import java.util.TreeSet;

class G1 
{
    public static void main(String[] args) {
        
        TreeSet<Integer> set = new TreeSet<Integer>();

        set.add(56);
        set.add(23);
        set.add(41);
        set.add(19);
        set.add(4);
        set.add(38);
        set.add(9);

        for(Integer y : set )
        {
            System.out.println(y + " - ");
        }
    }
}


// D:\javaprac\39_collections>javac G1.java

// D:\javaprac\39_collections>java G1
// 4 -
// 9 -
// 19 -
// 23 -
// 38 -
// 41 -
// 56 -