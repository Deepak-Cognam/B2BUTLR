package com.B2BUTLR.generic;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;

import org.yaml.snakeyaml.Yaml;

public class yamlReader {
	
	  public static String yamlreader(HashMap<String,String> Fields, String parent) {
		   
		   Map<String, String> inValues = null;
		    //
		   String value = null;
		  // String path = GenericLib.getValue("path");
		   try
		   {
		  
	        Yaml yaml = new Yaml();
	        
	        Reader yamlFile = new FileReader("./Source/testdata/Testdat.yml");

	        Map<String , Object> yamlMaps = yaml.load(yamlFile);
	        
	        Map<String , Object> B2B = (Map<String, Object>) yamlMaps.get("B2B");
	        inValues = new HashMap<String , String>();
	        Map<String, Object> module = (Map<String, Object>) B2B.get(parent);
	        
	        
	        getAllValues(module, inValues, Fields);
	       	            
		   }
	            	
		   catch(FileNotFoundException e)
		   {
			
			   e.printStackTrace();
		   
		   }
		   
	       return value;
	           
	         }

	   
	   
	private static void getAllValues(Map<String, Object> module, Map<String, String> inValues, HashMap<String,String> Fields) {
		
		for(String s : module.keySet())
       {
       	if(Fields.containsKey(s))
       	{
       		Fields.replace(s, module.get(s).toString());
       	}
       	else{
       		getAllValues((Map<String, Object>)module.get(s),inValues, Fields);
       	}
       		
       }
	}

	

}
