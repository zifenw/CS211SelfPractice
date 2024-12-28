package Practice2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


public class ExchangeRate {
	
	public static void main(String[] args) {
		
		try {					
				String firstPartURL = "https://v6.exchangerate-api.com/v6/";
				String key ="445bc40444e487e870ef354d"; 
				String thirdPartURL = "/latest/USD";
				String theURL = firstPartURL + key + thirdPartURL;
				
				URL url = new URL(theURL); 
				
				BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
				
			    JSONParser jsonParser = new JSONParser();
				JSONObject myObject = (JSONObject)jsonParser.parse(br);	 		
					
				System.out.println(myObject);
		
			  	
		      }
		 
		   catch (Exception ex) {	
			 ex.printStackTrace();
		   }
	    
   	 }
	}