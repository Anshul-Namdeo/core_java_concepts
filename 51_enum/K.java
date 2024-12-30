enum Days 
{
    SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
}

class K 
{
    public static void main(String args[])
    {
        Days day = Days.FATHERSDAY;
        System.out.println(day);
    }
}

// D:\javaprac\51_enum>javac K.java
// K.java:10: error: cannot find symbol
//         Days day = Days.FATHERSDAY;
//                        ^
//   symbol:   variable FATHERSDAY
//   location: class Days
// 1 error