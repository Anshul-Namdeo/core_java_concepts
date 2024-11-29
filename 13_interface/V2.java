interface jumpable{

        void jumpstyle();
        void jumpingFactor();
}


class Car {

}

class Sportscar extends Car implements jumpable{

        public void jumpstyle(){

        }
}
class Animal {

}

class Rabbit extends Animal implements jumpable{

            public void jumpstyle(){

            }
}
class Toy {

}
class Ball extends Toy implements jumpable{

            public void jumpstyle(){

            }
}


// V2.java:12: error: Sportscar is not abstract and does not override abstract method jumpingFactor() in jumpable
// class Sportscar extends Car implements jumpable{
// ^
// V2.java:22: error: Rabbit is not abstract and does not override abstract method jumpingFactor() in jumpable
// class Rabbit extends Animal implements jumpable{
// ^
// V2.java:31: error: Ball is not abstract and does not override abstract method jumpingFactor() in jumpable
// class Ball extends Toy implements jumpable{
// ^
// 3 errors