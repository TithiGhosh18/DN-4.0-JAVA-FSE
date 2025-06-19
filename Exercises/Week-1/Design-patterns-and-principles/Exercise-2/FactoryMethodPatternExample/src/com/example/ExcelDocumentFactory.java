package com.example;

public class ExcelDocumentFactory extends DocumentFactory {
	 public Document CreateDocument() {
		 return new ExcelDocument();
	 }
	}
