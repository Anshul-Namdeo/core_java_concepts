class V 
{
    public static void main(String args[])
    {
        Employee e = new Employee();

        System.out.println("normal variable print - " + e);
        System.out.println("toString ke print - " + e.toString());
        System.out.println("hashCode ke print - " + e.hashCode());  
        System.out.println(Integer.toHexString(e.hashCode()));
    }
}

class Employee{
  
}


// D:\javaprac\38_collections>javac V.java

// D:\javaprac\38_collections>java V
// normal variable print - Employee@f6f4d33
// toString ke print - Employee@f6f4d33
// hashCode ke print - 258952499
// f6f4d33
