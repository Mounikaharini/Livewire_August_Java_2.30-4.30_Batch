package Module1;

import java.sql.*;
import java.util.Scanner;

public class projectMounika {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		String url = "jdbc:mysql://localhost:3306/javaproject";
	    String user = "root"; 
	    String password = "1234";
	    Class.forName("com.mysql.cj.jdbc.Driver");
	    Connection con = DriverManager.getConnection(url, user, password);
	    
	    int id = 0 ;
	    String name = "";
	    Scanner s = new Scanner(System.in);
	    int n = 1;
//	    while(n!=0) {
//	    		System.out.println("Enter the Id : ");
//	    		id = s.nextInt();
//	    		s.nextLine();
//	    		System.out.println("Enter the Name : ");
//	    		name=s.nextLine();
//	    		System.out.println("For Continue Enter '1' / exit '0' : ");
//	    		n = s.nextInt();
//	    		s.nextLine();
//	    		String insertQuery = "INSERT INTO details(id, name) VALUES (?, ?)";
//	    	    PreparedStatement pst = con.prepareStatement(insertQuery);
//	    	    pst.setInt(1, id);
//	    	    pst.setString(2, name);
//	    	    pst.executeUpdate();
//	    	    System.out.println("Data Stored");
//	    }
	    
	    
	    String selectQuery = "SELECT * FROM details";
	    Statement st = con.createStatement();
	    ResultSet rs = st.executeQuery(selectQuery);
	    System.out.println("\n--- Student Records ---");
	    while (rs.next()) {
	         System.out.println(rs.getInt("id") +" "+rs.getString("name"));
	     }
	           rs.close();
	            st.close();
//	            pst.close();
	            con.close();
//	            sc.close();



	}

}
