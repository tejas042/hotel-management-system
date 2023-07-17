package hotel.managment.system;
import java.sql.*;

public class conn {
    public Connection conn;
    public Statement s;
public PreparedStatement pstmt; 
public conn(){
try{

Class.forName("com.mysql.cj.jdbc.Driver");


conn=DriverManager.getConnection("jdbc:mysql:///hms","root","");
System.out.println("Connected"); 
s = conn.createStatement();
}
catch(Exception e) { e.printStackTrace();
}

}

}
