class Address 
{
    String city;
    String state;

    Address(String city, String state)
    {
        this.city = city;
        this.state = state;
    }
}

class Student implements Cloneable 
{
    String name;
    int age;
    Address addr;

    Student(String name, int age, Address addr)
    {
        this.name = name;
        this.age = age;
        this.addr = addr;
    }

    Student createClone()
    {
        Student st = null;

        try{
            st = (Student)this.clone();
        }catch(CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
        return st;
    }
}

class I 
{
    public static void main(String args[])
    {
        Address addr = new Address("jabalpur","Mp");

        Student st = new Student("Golu",13,addr);

        System.out.println("Student name : " + st.name);
        System.out.println("Student age : " + st.age);
        System.out.println("Student addr-> city : " + st.addr.city);
        System.out.println("Student addr-> state : " + st.addr.state);

        Student y = st.createClone();
         System.out.println("-----------------------------------------------");

         System.out.println("Student name : " + st.name);
        System.out.println("Student age : " + st.age);
        System.out.println("Student addr-> city : " + st.addr.city);
        System.out.println("Student addr-> state : " + st.addr.state);

    }
}


// D:\javaprac\56_cloning>javac I.java

// D:\javaprac\56_cloning>java I
// Student name : Golu
// Student age : 13
// Student addr-> city : jabalpur
// Student addr-> state : Mp
// -----------------------------------------------
// Student name : Golu
// Student age : 13
// Student addr-> city : jabalpur
// Student addr-> state : Mp