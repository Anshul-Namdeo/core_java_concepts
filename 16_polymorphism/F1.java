class F {
    public static void main(String[] args){

            LivingBeing x = new Cat();
                x.cat();

            LivingBeing y = new Cow();
            LivingBeing z = new Dog();
            LivingBeing t = new Bdog();
    }
}

// F1.java:5: error: cannot find symbol
//                 x.cat();
//                  ^
//   symbol:   method cat()
//   location: variable x of type LivingBeing
// 1 error