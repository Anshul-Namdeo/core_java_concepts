class D9{

        public static void main(String[] args){

                TennicBall x = new TennicBall();

                // case 1:

                if(x instanceof TennicBall ){
                    System.out.println("TennicBall object IS-A TennicBall");
                }
                

                // case 2:

                if(x instanceof Toy){
                    System.out.println("TannicBall object IS-A Toy");
                }

                // case 3:

                if(x instanceof NonLivingBeing){
                    System.out.println("TennicBall object IS-A NonLivingeing");
                }

                // case 4:
                if(x instanceof Object){
                    System.out.println("TennicBall objject IS-A object");
                }
        }
}

class NonLivingBeing{

}

class Toy extends NonLivingBeing{

}

class Ball extends Toy{

}

class TennicBall extends Ball{

}

                

