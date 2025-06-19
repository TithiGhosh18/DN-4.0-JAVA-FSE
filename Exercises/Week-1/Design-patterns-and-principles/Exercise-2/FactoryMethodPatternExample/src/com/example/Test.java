package com.example;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DocumentFactory word = new WordDocumentFactory();
		Document wordDoc = word.CreateDocument();
		wordDoc.msg();
		
		DocumentFactory pdf = new PdfDocumentFactory();
		Document pdfDoc = pdf.CreateDocument();
		pdfDoc.msg();
		
		DocumentFactory excel = new ExcelDocumentFactory();
		Document ExcelDoc = excel.CreateDocument();
		ExcelDoc.msg();
		
	}

}
