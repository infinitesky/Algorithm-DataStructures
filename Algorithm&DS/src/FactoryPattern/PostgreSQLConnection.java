package FactoryPattern;

public class PostgreSQLConnection implements IConnector {

	String dbName = "POSTGRES";
	@Override
	public void getConnection() {
		
		String msSQLconnection = "geting connection from POSTGRES";
		System.out.println(msSQLconnection);
		
	}

	@Override
	public String getDatabaseName(String dbname) {
		// TODO Auto-generated method stub
		this.dbName = dbname;
		return dbname;
	}

}
