class Student {

        String  name ;
        int age ;


        Student (String nm, int ag){

                name = nm ;
                age = ag;
        }
}

class L1{

        public static void main(String args[]){

                Student x = new Student("anshul", 19);

                System.out.println(x.name);
                System.out.println(x.age);


        }
}