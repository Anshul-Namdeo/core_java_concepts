class M {

        public static void main(String args[]){

            Student x = new Student();
            Teachar a = new Teachar();

            System.out.println("~~~~~~~~~~~~~~~~before~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println(x.name);
            System.out.println(x.age);
            System.out.println(x.degree);
            System.out.println(x.branch);
            System.out.println(x.semester);


             System.out.println("~~~~~~~~~~~~~~~~before~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println(a.name);
            System.out.println(a.age);
            System.out.println(a.experience);
            System.out.println(a.qualification);
            System.out.println(a.salary);

        }
}

class Student {

        String name;
        int age;
        String degree;
        String branch;
        int semester;
}

class Teachar{

        String name;
        int age;
        int experience;
        String qualification;
        float salary;
}