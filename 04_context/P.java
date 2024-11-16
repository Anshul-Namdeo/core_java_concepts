class Employee {

            String name ;
            int age;
             

             public static void main(String[] args){

                    Employee emp = new Employee();

                    emp.name = "anshul";
                    emp.age = 30;

                    emp.showInfo();

             }

             void showInfo(){

                
                        showName();
                        showName();
             }

             void showName(){

                    System.out.println(name);
             }

             void showAge(){

                    System.out.println(age);
             }
}