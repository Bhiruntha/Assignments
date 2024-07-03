package assignmentweek2day4.Interface;

public class DatabaseConnectionClass implements DatabseConnectionInterface {

	
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

	public static void main(String[] args) {
		DatabaseConnectionClass DBClass= new DatabaseConnectionClass();
		DBClass.connect();
		DBClass.disconnect();
		DBClass.executeUpdate();
		
	}
}
