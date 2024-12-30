class Employee {

        String name ;
        int age ;

        public Employee(String name , int age){

                name = name ;
                age = age ;
        }
}

class L2 {

        public static void main(String args[]){

                Employee x = new Employee("pratham", 20);

                System.out.println(x.name);
                System.out.println(x.age);


        }
}

// null
// 0

// output null or 0 isliye aa raha hai bez... wo constructor ke andar name or age ko pahchan hi nhi pa raha isliye hum ko usa ye batana padega ki jo name or age hai wo instance level memeber isliye instance member ki pehchan baatane ke liye hame this keyword ka use karn apdhega