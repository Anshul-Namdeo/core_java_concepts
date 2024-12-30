import java.util.TreeSet;
import java.io.Console;
import java.util.Comparator;

class O
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

class NameSort implements Comparator <Student>
{
    public int compare(Student obj1, Student obj2)
    {
        return obj1.name.compareTo(obj2.name);
    }
}
class NameDscSort implements Comparator <Student>
{
    public int compare(Student obj1, Student obj2)
    {
        return obj2.name.compareTo(obj1.name);
    }
}
class AgeSort implements Comparator <Student>
{
    public int compare(Student obj1, Student obj2)
    {
        return obj1.age.compareTo(obj2.age);
    }
}
class AgeDscSort implements Comparator <Student>
{
    public int compare(Student obj1, Student obj2)
    {
        return obj2.age.compareTo(obj1.age);
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



// D:\javaprac\39_collections>javac O.java
// Note: O.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.

// D:\javaprac\39_collections>java O
// Press 1 for NameSort ,
// 2 for NameSortDecendingOrder,
// 3 for AgeSort,
// 4 for AgeSortDecendingOrder :
// 4
// [kartik - 18, vijendra - 12, ganesh - 10, simha - 9, prasad - 5]

// D:\javaprac\39_collections>java O
// Press 1 for NameSort ,
// 2 for NameSortDecendingOrder,
// 3 for AgeSort,
// 4 for AgeSortDecendingOrder :
// 3
// [prasad - 5, simha - 9, ganesh - 10, vijendra - 12, kartik - 18]

// D:\javaprac\39_collections>java O
// Press 1 for NameSort ,
// 2 for NameSortDecendingOrder,
// 3 for AgeSort,
// 4 for AgeSortDecendingOrder :
// 2
// [vijendra - 12, simha - 9, prasad - 5, kartik - 18, ganesh - 10]

// D:\javaprac\39_collections>java O
// Press 1 for NameSort ,
// 2 for NameSortDecendingOrder,
// 3 for AgeSort,
// 4 for AgeSortDecendingOrder :
// 1
// [ganesh - 10, kartik - 18, prasad - 5, simha - 9, vijendra - 12]