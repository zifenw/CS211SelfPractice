package BigData;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ExchangeRate {

	public static void main(String[] args) {
		try {
			
			String firstPartURL = "https://v6.exchangerate-api.com/v6/";
			String key = "445bc40444e487e870ef354d";
			String thirdPartURL = "/latest/USD";
			String theURL = firstPartURL + key + thirdPartURL;
			//"https://v6.exchangerate-api.com/v6/445bc40444e487e870ef354d/latest/USD"
			
			URL url = new URL(theURL);
			BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
			
			JSONParser jsonParser = new JSONParser();
			JSONObject myObject = (JSONObject)jsonParser.parse(br);
			
	
			
			System.out.println(myObject);
			
		
			//read the exchange rate here
			double USDrate = (long)((JSONObject)myObject.get("conversion_rates")).get("USD");
			System.out.println("USDrate" + USDrate);
			
			double CNYrate = (double)((JSONObject)myObject.get("conversion_rates")).get("CNY");
			System.out.println("CNYrate" + CNYrate);
	
		}
		
		catch(Exception ex){
			ex.printStackTrace();
		}
	}

}
