import java.sql.*;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String url = "jdbc:mysql://localhost:3306/demo?useSSL=false";
		String user = "root";
		String password = "Denaskind5";
		
		
		try {
			
			// 1. Get a connection to database 
			Connection myConn = DriverManager.getConnection(url, user, password);
			// 2. Create a statement
			Statement myStmt = myConn.createStatement();
			// 3. Execute SQL query
			String sql = "insert into employees"
					+ "(id,last_name, first_name, email)"
					+ "values ('9','Nemiraite', 'Brigita', 'brigita.nemiraite@gmail.com')";
			
			myStmt.executeUpdate(sql);
			System.out.println("Insert complete.");
			
			ResultSet myRs = myStmt.executeQuery("select * from employees");
			
			// 4. Process the result set
			
			// System.out.println("Rows affected: " +  rowsAffected);
			// System.out.println("Delete complete");
			while (myRs.next()) {
				System.out.println(myRs.getString("last_name") + " " + myRs.getString("first_name"));
			}
		}
		catch(Exception exc){
			exc.printStackTrace();
		}

	}

}