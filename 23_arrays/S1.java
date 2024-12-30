class S1 {
    public static void main(String args[]){

            Cat cat = new Cat();
            Cow cow = new Cow();
            Dog dog = new Dog();
            BDog bdog = new BDog();

            Animal anm;

            anm = cat ;
            System.out.println(anm);

            anm = cow ;
            System.out.println(anm);

            anm = dog ;
            System.out.println(anm);

            anm = bdog;
            System.out.println(anm);
    }
}