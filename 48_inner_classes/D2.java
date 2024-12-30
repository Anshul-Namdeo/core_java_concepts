class D2
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
           new Y();
     }
}

// D:\javaprac\48_inner_classes>javac D2.java
// D2.java:20: error: non-static variable this cannot be referenced from a static context
//            new Y();
//            ^
// 1 error