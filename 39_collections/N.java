import java.util.TreeSet;
import java.io.Console;
import java.util.Comparator;

class N 
{
    public static void main(String[] args) {
        
        Console con = System.console();

        System.out.println("Press 1 for NameSort , \n2 for NameSortDecendingOrder, \n3 for AgeSort, \n4 for AgeSortDecendingOrder : ");
        int input = Integer.parseInt(con.readLine());

        Comparator comp = null;

        if(input == 1)
        {
            comp = new NameSort();
        } else  if(input == 2)
        {
            comp = new NameDscSort();
        } else  if(input == 3)
        {
            comp = new AgeSort();
        } else  if(input == 4)
        {
            comp = new AgeDscSort();
        }

        TreeSet set = new TreeSet(comp);

        set.add(new Student("kartik",18));
        set.add(new Student("simha",9));
        set.add(new Student("vijendra",12));
        set.add(new Student("prasad",5));
        set.add(new Student("ganesh",10));

        System.out.println(set);
    }
}

class NameSort implements Comparator 
{
    public int compare(Object obj1, Object obj2)
    {
        Student x = (Student)obj1;
        Student y = (Student)obj2;

        String nm1 = x.name ;
        String nm2 = y.name ;

        return nm1.compareTo(nm2);
    }
}
class NameDscSort implements Comparator 
{
    public int compare(Object obj1, Object obj2)
    {
        Student x = (Student)obj1;
        Student y = (Student)obj2;

        String nm1 = x.name ;
        String nm2 = y.name ;

        return nm2.compareTo(nm1);
    }
}
class AgeSort implements Comparator 
{
    public int compare(Object obj1, Object obj2)
    {
        Student x = (Student)obj1;
        Student y = (Student)obj2;

        Integer ag1 = x.age ;
        Integer ag2 = y.age ;

        return ag1.compareTo(ag2);
    }
}
class AgeDscSort implements Comparator 
{
    public int compare(Object obj1, Object obj2)
    {
        Student x = (Student)obj1;
        Student y = (Student)obj2;

        Integer ag1 = x.age ;
        Integer ag2 = y.age ;

        return ag2.compareTo(ag1);
    }
}

class Student 
{
    String name ;
    Integer age ;

    Student (String name , Integer age)
    {
        this.name = name ;
        this.age = age ;
    }
    public String toString()
    {
        return name + " - " + age ;
    }
}


// D:\javaprac\39_collections>javac N.java
// Note: N.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.

// D:\javaprac\39_collections>java N
// Press 1 for NameSort ,
// 2 for NameSortDecendingOrder,
// 3 for AgeSort,
// 4 for AgeSortDecendingOrder :
// 4
// [kartik - 18, vijendra - 12, ganesh - 10, simha - 9, prasad - 5]

// D:\javaprac\39_collections>java N
// Press 1 for NameSort ,
// 2 for NameSortDecendingOrder,
// 3 for AgeSort,
// 4 for AgeSortDecendingOrder :
// 3
// [prasad - 5, simha - 9, ganesh - 10, vijendra - 12, kartik - 18]

// D:\javaprac\39_collections>java N
// Press 1 for NameSort ,
// 2 for NameSortDecendingOrder,
// 3 for AgeSort,
// 4 for AgeSortDecendingOrder :
// 2
// [vijendra - 12, simha - 9, prasad - 5, kartik - 18, ganesh - 10]

// D:\javaprac\39_collections>java N
// Press 1 for NameSort ,
// 2 for NameSortDecendingOrder,
// 3 for AgeSort,
// 4 for AgeSortDecendingOrder :
// 1
// [ganesh - 10, kartik - 18, prasad - 5, simha - 9, vijendra - 12]