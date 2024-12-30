import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;

class B 
{
    public static void main(String args[])
    {   
        String name = args[0];
        String college = args[1];
        String degree = args[2];
        int semester = Integer.parseInt(args[3]);
        String branch = args[4];
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schooldb?user=root&password=1234");

            System.out.println(con);
            System.out.println();

        String query = " insert into students (name, college, degree, branch, semester) value (?, ?, ?, ?, ?)";

        PreparedStatement ps = con.prepareStatement(query);

        System.out.println(ps);
        System.out.println();

        ps.setString(1, name);
        ps.setString(2, college);
        ps.setString(3, degree);
        ps.setString(4, branch);
        ps.setInt(5, semester);
        
        System.out.println(ps);
        System.out.println();

        int val = ps.executeUpdate();

        System.out.println(val);

            
        }catch(SQLException | ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }
}


// D:\javaprac\62_JDBC>javac B.java

// D:\javaprac\62_JDBC>java B yamraj yamlock mritu 1000 mittt
// com.mysql.cj.jdbc.ConnectionImpl@1b1473ab

// com.mysql.cj.jdbc.ClientPreparedStatement:  insert into students (name, college, degree, branch, semester) value (** NOT SPECIFIED **, ** NOT SPECIFIED **, ** NOT SPECIFIED **, ** NOT SPECIFIED **, ** NOT SPECIFIED **)

// com.mysql.cj.jdbc.ClientPreparedStatement:  insert into students (name, college, degree, branch, semester) value ('yamraj', 'yamlock', 'mritu', 'mittt', 1000)

// 1
