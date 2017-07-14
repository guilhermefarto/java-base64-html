package farto.cleva.guilherme.utils;

import java.io.File;
import java.io.FileInputStream;
import org.apache.commons.codec.binary.Base64;

public class Base64Util {

	public static String encodeFileToBase64Binary(String fileName) throws Exception {
		File file = new File(fileName);

		String encodedBase64 = null;

		FileInputStream fileInputStreamReader = new FileInputStream(file);

		byte[] bytes = new byte[(int) file.length()];

		fileInputStreamReader.read(bytes);

		encodedBase64 = new String(Base64.encodeBase64(bytes));

		fileInputStreamReader.close();

		return encodedBase64;
	}

}
