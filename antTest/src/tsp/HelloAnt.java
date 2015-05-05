package tsp;

import org.json.JSONException;  
import org.json.JSONObject;

public class HelloAnt {
	public static void main(String[] args) {
		System.out.println("hello ant");
		String dataString = "{\"name\":\"tristan\",\"properties\":{\"a\":\"a\",\"b\":\"b\"}}";

		try {
            JSONObject dataJson = new JSONObject(dataString);
            System.out.println(dataJson.toString());
		} catch (JSONException e) {
            System.out.println(e);
		}
	}

	public static void jsonTry() {
		String dataString = "{\"name\":\"tristan\",\"properties\":{\"a\":\"a\",\"b\":\"b\"}}";

		try {
            JSONObject dataJson = new JSONObject(dataString);
            System.out.println(dataJson.toString());
		} catch (JSONException e) {
            System.out.println(e);
		}
	}
}