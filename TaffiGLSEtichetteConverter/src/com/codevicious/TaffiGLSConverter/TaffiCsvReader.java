package com.codevicious.TaffiGLSConverter;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class TaffiCsvReader {
	
	private final String relativePath;
	
	public TaffiCsvReader(String relativePath) {
		this.relativePath = relativePath;
	}
		
	public Reader getReader() {
		Reader r = null;
		
		try {
			 r = new InputStreamReader(this.getClass().getClassLoader().getResourceAsStream(relativePath), "UTF-8");
		} catch (UnsupportedEncodingException e) {
			
			e.printStackTrace();
		}
		
		return r;
	}

}
