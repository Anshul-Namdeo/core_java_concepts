import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;

class A 
{
    public static void main(String args[])
    {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schooldb?user=root&password=1234");

                System.out.println(con);
                System.out.println();


            String query = " insert into students (name, college, degree, branch, semester) value ('OM', 'JEC', 'BTech', 'EC', 4)";

            PreparedStatement ps = con.prepareStatement(query);

            System.out.println(ps);
            System.out.println();

            int val = ps.executeUpdate();

            System.out.println(val);

        }catch(SQLException|ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }
}


// D:\javaprac\62_JDBC>javac A.java

// D:\javaprac\62_JDBC>java A
// com.mysql.cj.jdbc.ConnectionImpl@1b1473ab

// com.mysql.cj.jdbc.ClientPreparedStatement:  insert into students (name, college, degree, branch, semester) value ('OM', 'JEC', 'BTech', 'EC', 4)

// 1
