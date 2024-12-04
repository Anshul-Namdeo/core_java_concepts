class D {

        public static void main(String[] args){

                Bdog x = new Bdog();

                // case 1:

                if(x instanceof Bdog){
                    System.out.println("Bdog object IS-A Bdog");
                }
        }
}

class LivingBeing {

}

class Animal extends LivingBeing{

}

class Dog extends Animal{

}

class Bdog extends Dog{

}