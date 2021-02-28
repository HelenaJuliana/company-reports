package br.edu.ifpb.report.controller;

import br.edu.ifpb.report.service.ConnectorService;
import br.edu.ifpb.report.service.MysqlDatabaseService;

public class TaxReport extends Template {

//	private MysqlDatabaseConnector connector = new MysqlDatabaseConnector();
	private ConnectorService connectorMysql = new MysqlDatabaseService();

	@Override
	public void createDatabaseConnection() {
		System.out.println("Creating Database Connection...");
		connectorMysql.takeConnection();
	}

	@Override
	public void executeQuery() {
		System.out.println("Executing MySQL Query...");
		String query = "SELECT * FROM taxes";
		connectorMysql.takeQuery(query);

	}

	@Override
	public void convertTo() {
		System.out.println("Converting To PDF...");

	}

}