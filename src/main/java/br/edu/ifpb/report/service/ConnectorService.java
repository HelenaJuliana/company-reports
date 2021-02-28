package br.edu.ifpb.report.service;

import br.edu.ifpb.report.database.Connector;

public abstract class ConnectorService {

	abstract protected Connector makeConnector();

	Connector connector = this.makeConnector();

	public void takeConnection() {
		connector.openConnection();

	}

	public void takeQuery(String query) {
		connector.executeQuery(query);
	}

}