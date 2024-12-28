package BigData;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.text.NumberFormat;
import java.util.Locale;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


import org.json.simple.JSONArray;

public class WeatherAPP {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		
		
		while (true) {
			try {
				System.out.println("Choose the city (type 'exit' to exit):");
				String cityName = input.next();
				
				//check if the user wants to exit
				if (cityName.equalsIgnoreCase("exit")) {
                    System.out.println("Exiting WeatherAPP. Goodbye!");
                    break;
                }
				
				//Create a URL instance
				String firstPartURL = "https://api.openweathermap.org/data/2.5/weather?q=";
				String secondPartURL ="&appid=b0a84a966b9cb32e5c603a3307aedb79"; 
				String theURL = firstPartURL + cityName + secondPartURL;
				  
				//https://api.openweathermap.org/data/2.5/weather?q=Bellevue&appid=b0a84a966b9cb32e5c603a3307aedb79
				//https://api.openweathermap.org/data/2.5/weather?q=seattle&appid=b0a84a966b9cb32e5c603a3307aedb79
				//https://api.openweathermap.org/data/2.5/weather?q=phenix&appid=b0a84a966b9cb32e5c603a3307aedb79
	
				URL url = new URL(theURL); 
				BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
			  //String jsonData = br.readLine();
		      //System.out.println("JSON Data: " + jsonData);
				
				JSONParser jsonParser = new JSONParser();
				JSONObject myObject = (JSONObject)jsonParser.parse(br);
				
				//Temperature
				double cityTemp = (double)((JSONObject) myObject.get("main")).get("temp");
				double cityTempC = cityTemp - 273.15;
				double cityTempF = cityTempC*9/5 + 32;
				String cityTempNow = String.format("%.2f\u00B0F(%.2f\u00B0C)", cityTempF, cityTempC);
				  
				//weather
				JSONArray weatherArray = (JSONArray)myObject.get("weather");
				JSONObject w = (JSONObject) weatherArray.get(0);
				String weatherNow =(String) w.get("description");
				
				//low-Temperature
				double lowTemp = (double)((JSONObject) myObject.get("main")).get("temp_min");
				double lowTempC = (lowTemp - 273.15);
				double lowTempF = lowTempC*9/5 + 32;
				String lowTempNow = String.format("%.2f\u00B0F(%.2f\u00B0C)", lowTempF, lowTempC);
			  
				//high-Temperature 
				double highTemp = (double)((JSONObject) myObject.get("main")).get("temp_max");
				double highTempC = highTemp - 273.15;
				double highTempF = highTempC*9/5 + 32; 
				String highTempNow = String.format("%.2f\u00B0F(%.2f\u00B0C)", highTempF, highTempC);
			  
				//create a same class with Weather211, use constructors
				Weather211 printWeather = new Weather211(cityName, weatherNow, cityTempNow, lowTempNow, highTempNow);
				System.out.println(printWeather);
				  
			
			}
			catch (Exception ex) {		
				ex.printStackTrace();		
			}
		}	

	}

}
