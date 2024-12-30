import java.lang.reflect.Field;

class A1
{
    public static void main(String args[]) throws IllegalAccessException
    {
        Student x = new Student();
        x.name = "yamraj";
        x.age = 1000;

        Student y = new Student();
        y.name = "chitragupat";
        y.age = 500;

        Class k = x.getClass();

        Field[] fields = k.getDeclaredFields();

        System.out.println(fields[0].get(x));
        System.out.println(fields[1].get(x));
        System.out.println(fields[0].get(y));
        System.out.println(fields[1].get(y));
    }
}


// Note : get(object obj) method seekhi hai jis ka return type Object. or ye method ek cheaked Exception throw karti hai jis ka nam hai.(IllgealAccessException).

// D:\javaprac\53_reflection\P>javac A1.java

// D:\javaprac\53_reflection\P>java A1
// yamraj
// 1000
// chitragupat
// 500