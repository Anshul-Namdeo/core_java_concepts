import java.util.ArrayList;

class V 
{
    public static void main(String args[])
    {
        ArrayList x = new ArrayList();

        x.add(new Student("mohan",12));
        x.add(new Student("sohan",13));
        x.add(new Student("rohan",14));
        x.add(new Student("gohan",15));
        x.add(new Student("tohan",16));

        System.out.println(x);

        Student a = new Student("rohan",14);
        System.out.println(x.contains(a));

        System.out.println(x);
    }
}

// D:\javaprac\37_collections>java V
// [mohan - 12, sohan - 13, rohan - 14, gohan - 15, tohan - 16]
// false
// [mohan - 12, sohan - 13, rohan - 14, gohan - 15, tohan - 16]