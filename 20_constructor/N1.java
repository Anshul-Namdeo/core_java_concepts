class Student {

        String name;
        String email;
        String password;
        String degree;
        String branch;
        String semester;

        Student(String email, String password){
                this.email = email;
                this.password = password;
        }

         Student(String name, String email, String password, String degree, String branch, String semester){
                this(email,password);
                this.name = name;
                // this.email = email;
                // this.password = password;
                this.degree = degree;
                this.branch = branch;
                this.semester = semester;
               
         }
}
class N1 {

        public static void main(String args[]){


                Student s2 = new Student("gagan","gangan@gamil.com","321456987","B.Tech","CSE","4");

                 System.out.println("~~~~~~~~~~~~~~~Student 2 ~~~~~~~~~~~~~~~~~~~");
                System.out.println("NAME  - " + s2.name);
                 System.out.println("EMAIL - " + s2.email);
               System.out.println("PASSWORD - " + s2.password);
                System.out.println("DEGREE - " + s2.degree);
                 System.out.println("BRANCH - " + s2.branch);
                    System.out.println("SEMESTER - " + s2.semester);
        }
}