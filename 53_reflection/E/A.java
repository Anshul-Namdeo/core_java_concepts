class A 
{
    public static void main(String args[])
    {
        try{
            Class klass = Class.forName("Student");

            int code = klass.getModifiers();

            System.out.println(code);
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}

// Note :  hum ne A.java ko compile kiya fir hum ne A.java ko run kiya to Exception aa gya kyoki hum class (student) ko ek string ke ander likha hai to usa ke liye koi bhi (.class file nhi banegi) to ClassNotFoundException a jayega.

// D:\javaprac\53_reflection\E>javac A.java

// D:\javaprac\53_reflection\E>java A
// java.lang.ClassNotFoundException: Student 


// Note : ab hum A.java ko compile karenge fir Student.java ko compile karenge fir A.java ko run karenge

// D:\javaprac\53_reflection\E>javac A.java

// D:\javaprac\53_reflection\E>javac Student.java

// D:\javaprac\53_reflection\E>java A
// 17