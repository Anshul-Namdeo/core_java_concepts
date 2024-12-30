class M3 {

        public static void main(String args[]){
            Student s = new Student("anshul" ,19, "B.tech","cs",4);
            Teachar t = new Teachar("pratham",42 , 12 ,"phd",255);


            System.out.println(s.name);
             System.out.println(s.age);
              System.out.println(s.degree);
               System.out.println(s.branch);
                System.out.println(s.semester);


                System.out.println(t.name);
                System.out.println(t.age);
                System.out.println(t.experience);
                System.out.println(t.qualification);
                System.out.println(t.salary);

        }
}
class User {

        String name ;
        int age;
}
class Student extends User {

        // String name;
        // int age;
        String degree;
        String branch;
        int semester;

        Student(String name, int age, String degree, String branch, int semester){

                this.name = name;
                this.age = age;
                this.degree = degree;
                this.branch = branch;
                this.semester = semester;
        }
}


class Teachar extends User{

        // String name;
        // int age;
        int experience;
        String qualification;
        float salary;

        Teachar(String name, int age, int experience, String qualification, float salary){

                this.name = name;
                this.age = age;
                this.experience = experience;
                this.qualification = qualification;
                this.salary = salary;
        }
}