enum Days 
{
    SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
}

class I 
{
    public static void main(String args[])
    {
        Days day;
        System.out.println(day);
    }
}


// D:\javaprac\51_enum>javac I.java
// I.java:11: error: variable day might not have been initialized
//         System.out.println(day);
//                            ^
// 1 error