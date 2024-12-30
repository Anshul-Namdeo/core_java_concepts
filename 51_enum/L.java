enum Days 
{
    SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
}

class L 
{
    public static void main(String args[])
    {
        Days[] days = Days.values();

        for(Days day : days)
        {
            System.out.println(day);
        }
    }
}


// D:\javaprac\51_enum>javac L.java

// D:\javaprac\51_enum>java L
// SUNDAY
// MONDAY
// TUESDAY
// WEDNESDAY
// THURSDAY
// FRIDAY
// SATURDAY
