interface jumpable{

        void jumpstyle();
        void jumpingFactor();
}


class Car {

}

class Sportscar extends Car implements jumpable{

}
class Animal {

}

class Rabbit extends Animal implements jumpable{

}
class Toy {

}
class Ball extends Toy implements jumpable{

}

// V1.java:12: error: Sportscar is not abstract and does not override abstract method jumpingFactor() in jumpable
// class Sportscar extends Car implements jumpable{
// ^
// V1.java:19: error: Rabbit is not abstract and does not override abstract method jumpingFactor() in jumpable
// class Rabbit extends Animal implements jumpable{
// ^
// V1.java:25: error: Ball is not abstract and does not override abstract method jumpingFactor() in jumpable
// class Ball extends Toy implements jumpable{
// ^
// 3 errors