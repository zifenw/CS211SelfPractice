package BigData;

public class Weather211 {
	// define some private variables
		private String cityname;
		private String weather;
		private String Temp;
		private String lowTemp;
		private String highTemp;
		
		
		public Weather211(String cityname, String weather, String Temp, String lowTemp, String highTemp) {
			this.cityname = cityname;
			this.weather = weather;
			this.Temp = Temp;
			this.lowTemp = lowTemp;
			this.highTemp = highTemp;
			
			
		}
		
		public String getCityname() {
			return this.cityname;
		}

		public String getWeather(){
			return this.weather;
		}
		public String getTemp(){
			return this.Temp;
		}
		public String getHighTemp(){
			return this.highTemp;
		}
		public String getLowTemp(){
			return this.lowTemp;
		}
		
		@Override
		public String toString() {
			return "city: " + cityname + ", weather: " + weather + ", Temperature: " + Temp + ", highTemp: " + highTemp + ", lowTemp: " + lowTemp;
		}
}
