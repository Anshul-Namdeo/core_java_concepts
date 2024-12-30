class J {
    public static void main(String args[]){

        Teachar[] y = new Teachar[4];

            y[0] = new Teachar("nayan" , 22);
            y[1] = new Teachar ("anshul" , 12);
            y[2] = new Teachar("khushi" , 18);
            y[3] = new Teachar("pratham", 15);


             System.out.print(y[0].name + " ");
            System.out.print(y[1].name + " ");
            System.out.print(y[2].name + " ");
            System.out.print(y[3].name + " ");

            System.out.println();
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

            
             System.out.print(y[0].age + " ");
            System.out.print(y[1].age + " ");
            System.out.print(y[2].age + " ");
            System.out.print(y[3].age + " ");


            System.out.println("                 ");
    }
}