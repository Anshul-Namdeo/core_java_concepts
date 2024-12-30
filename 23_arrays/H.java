class H {
    public static void main(String args[]){
     Student x1 = new Student("nayan" , 22);
     Student x2 = new Student("mno", 12);
     Student x3 = new Student("agggesh", 32);
     Student x4 = new Student("poiuytr", 12);


     Student[] Y = new Student[4];

     System.out.println(Y[0]);
     System.out.println(Y[1]);
     System.out.println(Y[2]);
     System.out.println(Y[3]);

     Y[0]  = x1 ;
     Y[1]  = x2;
     Y[2]  = x3;
     Y[3]  = x4;


    System.out.println(Y[0]);
     System.out.println(Y[1]);
     System.out.println(Y[2]);
     System.out.println(Y[3]);


   }
}

class Student{
    String name ;
    int age ;

    Student(String name, int age){

            this.name = name;
            this.age = age;
    }

    public String toString(){
        return name + " " + age;
    }
}



// null
// null
// null
// null
// nayan 22
// mno 12
// agggesh 32
// poiuytr 12