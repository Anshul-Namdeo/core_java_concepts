import java.util.HashMap;

class J2 {
    public static void main(String args[]) {
        HashMap<Student, Integer> map = new HashMap<Student, Integer>();

        map.put(new Student("om", 12), 78);
        map.put(new Student("umesh", 19), 97);
        map.put(new Student("jay", 13), 64);
        map.put(new Student("ekta", 9), 83);
        map.put(new Student("deepak", 5), 99);
        map.put(new Student("jay", 13), 77);

        System.out.println(map);
    }
}

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " - " + age;
    }

    public boolean equals(Object obj) {
        boolean flag = false;

        if (obj instanceof Student) {
            Student x = this;
            Student y = (Student) obj;

            String nm1 = x.name;
            String nm2 = y.name;

            flag =  nm1.equals(nm2) && x.age == y.age;
        }
        return flag; 
    }

    public int hashCode()
    {
        int code  = 0;

        String abc = " abcdefghijklmnopqstuvwxyz";

        for(int i=0; i<name.length(); i++)
        {
            code = code + abc.indexOf(name.charAt(i));
        }

        return code ;
    }
}


// D:\javaprac\40_collections>javac J2.java

// D:\javaprac\40_collections>java J2
// {umesh - 19=97, jay - 13=77, ekta - 9=83, deepak - 5=99, om - 12=78}