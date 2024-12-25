class Q {

        public static void main(String args[]){

                Student  x = new Student();
                Teachar y = new Teachar();

                attendance(x);
                attendance(y);

        }


       static  void attendance(Student  s){

                System.out.println("I am present");
        }

       static  void attendance(Teachar t){

                System.out.println("I am present");
        }
}