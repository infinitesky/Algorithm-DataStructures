package FactoryPattern;

public class OrcaleConnection implements IConnector{

	String dbName = "ORACLE";
	@Override
	public void getConnection() {
		
		String oracleConnection = "geting connection from Oracle";
		System.out.println(oracleConnection);
	}

	@Override
	public String getDatabaseName(String dbname) {
		
		this.dbName = dbname;
		return dbName;
	}

}
