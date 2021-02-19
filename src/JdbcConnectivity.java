public class JdbcConnectivity 
{
	private final static String url = "jdbc:mysql://localhost:3306/JDBCTutorial";
	private final static String username = "root";
	private final static String password = "root123";
	static String getUserName()
	{
		return username;
	}
	static String getPassword()
	{
		return password;
	}
	static String getURL()
	{
		return url;
	}
}
