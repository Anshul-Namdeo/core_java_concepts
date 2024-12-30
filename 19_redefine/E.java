class Car{

}

class SportsCar extends Car{

}

class E {

        static void pro(Car car){

                System.out.println("car");
        }

        static void pro(SportsCar SportsCar){

                System.out.println("Sportscar");
        }

        public static void main (String args[]){
            Car x = new SportsCar();
            pro(x);
        }
}