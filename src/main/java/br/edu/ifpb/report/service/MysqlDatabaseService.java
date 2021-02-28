package br.edu.ifpb.report.service;

import br.edu.ifpb.report.database.Connector;
import br.edu.ifpb.report.database.MysqlDatabaseConnector;

public class MysqlDatabaseService extends ConnectorService{

	@Override
	protected Connector makeConnector() {
		return new MysqlDatabaseConnector();
	}

}