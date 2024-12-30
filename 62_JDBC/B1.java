import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.Scanner;

class B1 
{
    public static void main(String args[])
    {
        Scanner cs = new Scanner(System.in);

        System.out.print("Enter name : ");
        String name = cs.nextLine();

        // System.out.println();
        System.out.print("Enter college : ");
        String college = cs.nextLine();

        System.out.print("Enter Degree : ");
        String degree = cs.next();

        System.out.print("Enter semester : ");
        int semester = cs.nextInt();

        System.out.print("Enter Branch : ");
        String branch = cs.next();
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schooldb?user=root&password=1234");
            System.out.println(con);
            System.out.println();

            String query = " insert into students (name, college, degree, semester, branch) value (?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(query);
            System.out.println(ps);
            System.out.println();

            ps.setString(1, name);
            ps.setString(2, college);
            ps.setString(3, degree);
            ps.setInt(4, semester);
            ps.setString(5, branch);

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







// D:\javaprac\62_JDBC>javac B1.java

// D:\javaprac\62_JDBC>java B1
// Enter name :  Nayan
// Enter college : Shri Ram
// Enter Degree :  BTech
// Enter semester :  4
// Enter Branch :  CS
// com.mysql.cj.jdbc.ConnectionImpl@cd3fee8

// com.mysql.cj.jdbc.ClientPreparedStatement:  insert into students (name, college, degree, semester, branch) value (** NOT SPECIFIED **, ** NOT SPECIFIED **, ** NOT SPECIFIED **, ** NOT SPECIFIED **, ** NOT SPECIFIED **)

// com.mysql.cj.jdbc.ClientPreparedStatement:  insert into students (name, college, degree, semester, branch) value (' Nayan', 'Shri Ram', 'BTech', 4, 'CS')

// 1
