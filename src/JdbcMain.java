import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class JdbcMain 
{
	public static void main(String[] args) 
	{
		try
		{
			String query = "select * from Student where StudId = 2;";
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(JdbcConnectivity.getURL(),JdbcConnectivity.getUserName(),JdbcConnectivity.getPassword());
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			rs.next();
			int SNo = Integer.parseInt(rs.getString("StudId"));
			String SName = rs.getString("StudName");
			System.out.println(SNo+" "+SName);
			st.close();
			rs.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}