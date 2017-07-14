package farto.cleva.guilherme;

import farto.cleva.guilherme.utils.Base64Util;

public class Main {

	private static final String RESOURCES_DIR = "src/main/resources/";

	private static final String FILES_DIR = RESOURCES_DIR + "files/";

	public static void main(String[] args) {
		try {
			String pngFile = FILES_DIR + "farm.png";

			String encodedPng = Base64Util.encodeFileToBase64Binary(pngFile);

			System.out.println(encodedPng);

			String pdfFile = FILES_DIR + "farm.pdf";

			String encodedPdf = Base64Util.encodeFileToBase64Binary(pdfFile);

			System.out.println(encodedPdf);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
