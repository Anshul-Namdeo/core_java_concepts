enum Days 
{
    SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;
}

class O 
{
    public static void main(String args[])
    {
        Days day = new Days();

        System.out.println(day);
    }
}

// D:\javaprac\51_enum>javac O.java
// O.java:10: error: enum types may not be instantiated
//         Days day = new Days();
//                    ^
// 1 error


// Note : hum enum ka constructor nhi bana sakte hai... (may not be instantiated)
