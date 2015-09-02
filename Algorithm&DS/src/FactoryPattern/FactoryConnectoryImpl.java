package FactoryPattern;

public class FactoryConnectoryImpl extends FactoryConnector {

	@Override
	public IConnector getDatabaseName(String dbanme) {
		
		IConnector connector =null;
		if (dbanme.equals("POSTGRESQL"))
		{
			connector = new PostgreSQLConnection();
		}
		else if (dbanme.equals("MSSQL"))
		{
			connector= new MsSQLConnection();
		}
		else if (dbanme.equals("ORACLE"))
		{
			connector= new OrcaleConnection();
		}
		else throw new RuntimeException("no connector found");
		
		return connector;
	}

}
