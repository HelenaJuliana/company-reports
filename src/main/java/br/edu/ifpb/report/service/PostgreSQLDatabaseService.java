package br.edu.ifpb.report.service;

import br.edu.ifpb.report.database.Connector;
import br.edu.ifpb.report.database.PostgreSQLDatabaseConnector;

public class PostgreSQLDatabaseService extends ConnectorService {

	@Override
	protected Connector makeConnector() {
		return new PostgreSQLDatabaseConnector();
	}

}