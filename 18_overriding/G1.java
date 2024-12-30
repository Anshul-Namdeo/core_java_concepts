class G1 {

             static void playSound(Animal d){

                 d.MakeSound();
         }



        // static void playSound(Dog d){

        //         d.MakeSound();
        // }

        //  static void playSound(Cat d){

        //         d.MakeSound();
        // }
        //  static void playSound(Cow d){

        //         d.MakeSound();
        // }

        public static void main(String args[]){

                Dog dog = new Dog();
                playSound(dog);

                 Cat cat = new Cat();
                playSound(cat);

                 Cow cow = new Cow();
                playSound(cow);
        }
}