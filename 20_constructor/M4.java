class M4 {

        public static void main(String args[]){
            
            Student s = new Student("khushi",19 ,"Nursing", "biology", 5);
            Teachar t = new Teachar("M k Mishra", 42, 20, "phd", 522222222);


            System.out.println("~~~~~~~~~~~~~~~~~~~Student Info~~~~~~~~~~~~~~~");
            System.out.println(s.name);
            System.out.println(s.age);
            System.out.println(s.degree);
            System.out.println(s.branch);
            System.out.println(s.semester);


            System.out.println("~~~~~~~~~~~~~~~~~~~~Teachar Info~~~~~~~~~~~~~~~~`");
            System.out.println(t.name);
            System.out.println(t.age);
            System.out.println(t.experience);
            System.out.println(t.qualification);
            System.out.println(t.salary);

        }
}

class User {

        String name;
        int age;

        User(String name, int age){

                this.name = name;
                this.age = age;
        }
}

class Student extends User{

        // String name;
        // int age;
        String degree;
        String branch;
        int semester; 


        Student(String name, int age, String degree, String branch, int semester){
                super(name,age);
                // this.name = name ;
                // this.age = age;
                this.degree = degree;
                this.branch = branch;
                this.semester = semester;
        }
}

class Teachar extends User {

        // String name;
        // int age;
        int experience;
        String qualification;
        float salary;

        Teachar(String name, int age, int experience, String qualification,float salary){
                super(name,age);
                // this.name = name;
                // this.age = age;
                this.experience = experience;
                this.qualification = qualification;
                this.salary = salary;
        }
}

