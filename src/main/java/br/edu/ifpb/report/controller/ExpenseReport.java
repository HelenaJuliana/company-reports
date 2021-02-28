package br.edu.ifpb.report.controller;

import br.edu.ifpb.report.service.ConnectorService;
import br.edu.ifpb.report.service.PostgreSQLDatabaseService;

public class ExpenseReport extends Template {

//  private PostgreSQLDatabaseConnector connector = new PostgreSQLDatabaseConnector();
	private ConnectorService connectorPostgre = new PostgreSQLDatabaseService();

	@Override
	public void createDatabaseConnection() {
		System.out.println("Creating Database Connection...");
		connectorPostgre.takeConnection();
	}

	@Override
	public void executeQuery() {
		System.out.println("Executing Postgres Query...");
		String query = "SELECT * FROM expenses";
		connectorPostgre.takeQuery(query);

	}

	@Override
	public void convertTo() {
		System.out.println("Converting To XLS...");

	}

}