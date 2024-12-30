class Employee {

        String name ;
        int age ;

        public Employee(String name , int age){

                this.name = name ;
                this.age = age ;
        }
}

class L3 {

        public static void main(String args[]){

                Employee x = new Employee("pratham", 20);

                System.out.println(x.name);
                System.out.println(x.age);


        }
}