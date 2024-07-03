package assignmentweek2day4.Abstraction;


public class JavaConnection extends MySqlConnection {
	
	
	@Override
	public void connect() {
		System.out.println("Inside connect method ");
		
	}

	@Override
	public void disconnect() {
		System.out.println("Inside disconnect method ");
		
	}

	@Override
	public void executeUpdate() {
		System.out.println("Inside executeUpdate method ");
		
	}

	@Override
	public void executeQuery() {
		System.out.println("Inside executeQuery method ");
		
	}
	
	public static void main(String[] args) {
		JavaConnection DBClass= new JavaConnection();
		DBClass.connect();
		DBClass.disconnect();
		DBClass.executeUpdate();
		DBClass.executeQuery();
	}

}
