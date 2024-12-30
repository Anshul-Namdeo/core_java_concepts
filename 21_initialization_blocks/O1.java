class O1 {
    public static void main(String args[]){
        Animal x = new Dog();

        BDog y = (BDog)x;
    }
}

class Animal{}
class Dog extends Animal{}
class BDog extends Dog{}


// Exception in thread "main" java.lang.ClassCastException: class Dog cannot be cast to class BDog (Dog and BDog are in unnamed module of loader 'app')
//         at O1.main(O1.java:5)