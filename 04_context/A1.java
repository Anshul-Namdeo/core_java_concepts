class Student{

        String name;
        int age;

        static int maxAge = 20;

        public static void main(String[] args){

                Student x = new Student();

                x.name = "mohan";
                x.age = 20;
                x.showInfo();
                System.out.println(maxAge);
                System.out.println(Student.maxAge);

        }

        void showInfo(){

                System.out.println(name);
                System.out.println(maxAge);
        }
}