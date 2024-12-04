class D5 {

        public static void main(String[] args){

                Bdog x = new Bdog();

                // case 1:

                if(x instanceof Bdog){
                    System.out.println("Bdog object IS-A Bdog");
                }

                // case 2:

                if(x instanceof Dog){
                    System.out.println("Bdog object IS-A Dog");
                }

                // case 3: 

                if(x instanceof Animal){
                    System.out.println("Bdog object IS-A Animal");
                }

                // case 4:

                if(x instanceof LivingBeing){
                    System.out.println("Bdog object IS-A LivingBeing");
                }

                // case 5:

                if(x instanceof Object){
                    System.out.println("Bdog object IS-A object");
                }

                // case 6:

                if(x instanceof Human){
                    System.out.println("Bdog object IS-A Human");
                }else{
                    System.out.println("Bdog object IS-A not a Human");
                }

                // D5.java:39: error: incompatible types: Bdog cannot be converted to Human
                // if(x instanceof Human){
                //    ^
                // 1 error


        }
}

class LivingBeing {

}

class Animal extends LivingBeing{

}

class Human extends LivingBeing{

}

class Dog extends Animal{

}

class Bdog extends Dog{

}