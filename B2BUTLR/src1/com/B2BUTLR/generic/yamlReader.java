package com.B2BUTLR.generic;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;

import org.testng.Reporter;
import org.yaml.snakeyaml.Yaml;

public class yamlReader {
	private static Map<String, Object> object = null;
	private static String ymlFilePath = "./Source/testdata/test.yml";
	
	
	
	
	public static String getValue(String token) throws FileNotFoundException {
		Reader doc = null;
		try {
			doc = new FileReader(ymlFilePath);
		} catch (FileNotFoundException e) {
			Reporter.log("Wrong tier passed in 'Configuration' file'", true);
			return null;
		}
		Yaml yaml = new Yaml();
		if(object==null )
		{ 
		    object = (Map<String, Object>) yaml.load(doc);
		    //System.out.println(object.toString());
		}
        return getMapValue(object, token);
    }
	
	 public static String getMapValue(Map<String, Object> object, String token) {
	        //check for proper yaml token string based on presence of '.'
	        String[] st = token.split("\\.");
	        return parseMap(object, token).get(st[st.length - 1]).toString();
	    }
	 
	 private static Map<String, Object> parseMap(Map<String, Object> object,
	            String token) {
	        if (token.contains(".")) {
	            String[] st = token.split("\\.");
	            object = parseMap((Map<String, Object>) object.get(st[0]),
	                    token.replace(st[0] + ".", ""));
	        }
	        return object;
	    }

	}
	
	
	
	
	


