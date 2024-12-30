enum Days 
{
        //enum constant
        SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
}

class H 
{
    Days day;
    public static void main(String args[])
    {
        System.out.println(day);
    }
}

// D:\javaprac\51_enum>javac H.java
// H.java:12: error: non-static variable day cannot be referenced from a static context
//         System.out.println(day);
//                            ^
// 1 error
