
class M{

        public static void main(String args[]){

           // Milk milk = new Milk();
            TeaLeaves teaLeaves = new TeaLeaves();
            Sugar sugar = new Sugar();
            Water water = new Water();
            Herb herb = new Herb();

            prepBlackTea(teaLeaves,water,sugar);
            prepMilkTea(teaLeaves,water,sugar);
            prepHerbTea(herb,teaLeaves,water,sugar);


        }

        static void prepMilkTea(/*Milk milk*/ TeaLeaves teaLeaves, Water water, Sugar sugar){

                System.out.println("---------------prepMilkTea-----------");
                 System.out.println("setp -1");
                   System.out.println("setp -2");
                      System.out.println("setp -3");
                        System.out.println("setp -4");
        }

         static void prepBlackTea( TeaLeaves teaLeaves, Water water, Sugar sugar){

                System.out.println("---------------preBlackTea-----------");
                // System.out.println("setp -1");
                   System.out.println("setp -2");
                      System.out.println("setp -3");
                        System.out.println("setp -4");
        }

         static void prepHerbTea(Herb herb, TeaLeaves teaLeaves, Water water, Sugar sugar){

                System.out.println("---------------prepHerbTe-----------");
                 System.out.println("setp -1");
                   System.out.println("setp -2");
                      System.out.println("setp -3");
                        System.out.println("setp -4");
        }
}