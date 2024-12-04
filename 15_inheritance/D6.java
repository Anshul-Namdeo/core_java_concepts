class D6{

        public static void main(String[] args){

                TennicBall x = new TennicBall();

                // case 1:

                if(x instanceof TennicBall ){
                    System.out.println("TennicBall object IS-A TennicBall");
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