import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;

class A1 
{
    public static void main(String args[])
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schooldb?user=root&password=1234");

            System.out.println(con);
            System.out.println();

            String query = " insert into students (name, college, degree, semester, branch) value ('Anshul', 'Global', 'BTech', 4, 'CSE')";
                
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