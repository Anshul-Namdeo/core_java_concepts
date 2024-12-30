class M5 {

        public static void main(String args[]){

            Student s = new Student("ANSHUL", 20, "10/01/2020", 656121, "mno@12345678", "HINDU", "MALE", "B.Tech", "cs", 4 );

            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~STUDENT INFO ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
             System.out.println(s.name);
             System.out.println(s.age);
             System.out.println(s.DOB);
             System.out.println(s.mobileNo);     
             System.out.println(s.emailId);
             System.out.println(s.nationality);
             System.out.println(s.gender);
             System.out.println(s.degree);
             System.out.println(s.branch);
             System.out.println(s.semester);


                    Teachar t = new Teachar("Dr Rajiv Khatri", 75, "10/01/1945", 2535612, "rajiv@1236589", "HINDU", "MALE", 30,  "PHD", 580000 );
             System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~TEACHAR INFO ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println(t.name);
                System.out.println(t.age);
                System.out.println(t.DOB);
                System.out.println(t.mobileNo);
                System.out.println(t.emailId);
                System.out.println(t.nationality);
                System.out.println(t.gender);
                System.out.println(t.experience);
                System.out.println(t.qualification);
                System.out.println(t.salary);
        }
}
class User {

        String name;
        int age;
        String DOB;
        int mobileNo;
        String emailId;
        String nationality;
        String gender;  

        User(String name, int age, String DOB, int mobileNo, String emailId, String nationality, String gender){

                    this.name = name;
                    this.age = age;
                    this.DOB = DOB;
                    this.mobileNo = mobileNo;
                    this.emailId = emailId;
                    this.nationality = nationality;
                    this.gender = gender;
        }

}
class Student extends User{

        String degree;
        String branch;
        int semester;

        Student(String name, int age, String DOB, int mobileNo, String emailId, String nationality, String gender,String degree, String branch, int semester){

                super(name,age,DOB,mobileNo,emailId,nationality,gender);

                this.degree = degree;
                this.branch = branch;
                this.semester = semester;
        }
}


class Teachar extends User{

        
        int experience;
        String qualification;
        float salary;   

            Teachar(String name, int age, String DOB, int mobileNo, String emailId, String nationality, String gender,int experience, String qualification, float salary){

                    super(name,age,DOB,mobileNo,emailId,nationality,gender);


                    this.experience = experience;
                    this.qualification = qualification;
                    this.salary = salary;

            }
}