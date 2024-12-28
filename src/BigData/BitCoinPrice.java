package BigData;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.text.NumberFormat;
import java.util.Locale;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class BitCoinPrice {
	private static String coinURL ="https://api.coindesk.com/v1/bpi/currentprice.json";  //read the URL of BitCoin BigData
/*{
"time":{
"updated":"Jan 18, 2022 06:41:00 UTC",
"updatedISO":"2022-01-18T06:41:00+00:00",
"updateduk":"Jan 18, 2022 at 06:41 GMT“
},
"disclaimer":"This data was produced from the CoinDesk Bitcoin Price Index (USD). Non-USD currency data converted using hourly conversion rate from openexchangerates.org",
"chartName":"Bitcoin",
"bpi":{
"USD":{"code":"USD","symbol":"&#36;","rate":"42,277.2967","description":"United States Dollar","rate_float":42277.2967},
"GBP":{"code":"GBP","symbol":"&pound;","rate":"31,008.1564","description":"British Pound Sterling","rate_float":31008.1564},
"EUR":{"code":"EUR","symbol":"&euro;","rate":"37,095.1570","description":"Euro","rate_float":37095.157}
}*/
	public static void main(String[] args) {
		try {				//这开始了一个try块，表示以下的代码可能引发异常。
			URL url = new URL(coinURL);		// 使用coinURL变量的值创建一个名为url的新URL对象。它表示某个与币种相关的数据的URL。
			BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));		//创建一个BufferedReader，命名为br，以从打开到指定URL的连接的输入流中读取数据。

			JSONParser jsonParser = new JSONParser();		//创建一个JSONParser对象以解析JSON数据。 
			JSONObject myObject = (JSONObject)jsonParser.parse(br);		//解析从URL获取的JSON数据并将其存储在名为myObject的JSONObject中
			JSONObject bpi = (JSONObject)myObject.get("bpi");		//从myObject中检索与键“bpi”关联的值，并将其存储在名为bpi的新JSONObject中。
			JSONObject usd = (JSONObject)bpi.get("USD");		// 从bpi中检索与键“USD”关联的值，并将其存储在名为usd的新JSONObject中。
			        
			NumberFormat format = NumberFormat.getInstance(Locale.getDefault());		// 基于默认区域设置创建一个NumberFormat对象。
			Number number = format.parse((String) usd.get("rate"));		//将从usd中关联键“rate”的值解析为字符串，并将其转换为Number对象。
			double price = number.doubleValue();		// 从Number对象中检索double值，并将其赋给变量price。
			System.out.println("price: "+price);		//将price的值打印到控制台。
			
			String s= (String) usd.get("description");		//从usd中检索与键“description”关联的值，并将其存储在名为s的字符串变量中。
			System.out.println("description: "+s);		//将s的值打印到控制台。
		   } 
		catch (Exception ex) {		//捕获可能在try块执行期间发生的任何异常。
			ex.printStackTrace();		//打印捕获的异常的堆栈跟踪。
		}

	}

}
