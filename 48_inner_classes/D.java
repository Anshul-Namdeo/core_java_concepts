class D 
{
    // member variable 
    int x = 89;

    // member method 
     void pro()
     {

     }

     //member class
     class Y 
     {

     }

     public static void main(String args[])
     {
        System.out.println(x);
     }
}

// D:\javaprac\48_inner_classes>javac D.java
// D.java:20: error: non-static variable x cannot be referenced from a static context
//         System.out.println(x);
//                            ^
// 1 error
