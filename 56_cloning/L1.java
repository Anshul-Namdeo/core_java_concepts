class Student/*extends Object */ implements Cloneable 
{
     String name;
    int age;

    Student (String name, int age)
    {
        this.name = name;
        this.age = age ;
    }

    public Student clone() // method overriding rule ke hisab agar ap kissi method ko override kar rahe hai or usa ka  return type classtype(reference type) hai to hum waha par usa ka subtype likh sakte hai jaise ki isa exam.. mai sub-type(Student) likha hai waise hi...
    {
            Student st = null;
        try{
            st = (Student)super.clone();
        }catch(CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
        return st;
    }
}

class L1 
{
    public static void main(String args[])
    {
        Student x = new Student("om",12);

        System.out.println("X.name  : " + x.name);
        System.out.println("X.age  : " + x.age);

        Student y = x.clone();
       
        System.out.println("Y.name  : " + y.name);
        System.out.println("Y.age : " + y.age);

       
    }
}

// D:\javaprac\56_cloning>javac L1.java

// D:\javaprac\56_cloning>java L1
// X.name  : om
// X.age  : 12
// Y.name  : om
// Y.age : 12
