package FactoryPattern;

public class CallFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FactoryConnector fc = new FactoryConnectoryImpl();
		IConnector connection = fc.getDatabaseName("POSTGRESQL");
		connection.getConnection();
		
		
		connection = fc.getDatabaseName("ORACLE");
		connection.getConnection();
		
		
	}

}
