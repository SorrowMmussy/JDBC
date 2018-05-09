import java.sql.*;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			// 1. Get a connection to database 
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
			// 2. Create a statement
			
			// 3. Execute SQL query
			
			// 4. Process the result set
		}
		catch(Exception exc){
			exc.printStackTrace();
		}

	}

}