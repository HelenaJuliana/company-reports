package br.edu.ifpb.report.controller;

public abstract class Template {

	public void generate() {
		createDatabaseConnection();
		executeQuery();
		convertTo();
	}

	public abstract void createDatabaseConnection();

	public abstract void executeQuery();

	public abstract void convertTo();

}