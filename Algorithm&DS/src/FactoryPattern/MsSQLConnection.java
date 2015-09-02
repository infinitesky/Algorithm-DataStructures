package FactoryPattern;

public class MsSQLConnection implements IConnector{

	String dbName = "MSSQL";
	@Override
	public void getConnection() {
		String msSQLconnection = "geting connection from MSSQL";
		
		System.out.println(msSQLconnection);
		
	}

	@Override
	public String getDatabaseName(String dbname) {
		// TODO Auto-generated method stub
		 this.dbName=dbname;
		 return dbName;
	}

}
