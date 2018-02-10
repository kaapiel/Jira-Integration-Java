package br.com.empresa.jiraintegration.helper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import br.com.empresa.jiraintegration.config.Constants;

public class HttpHelper {

	public String doHttpGet(String fieldType, String fieldId) throws IOException{
		
		URL url = new URL(Constants.Links.API_HOST + fieldType + "/" + fieldId);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		conn.setRequestProperty("Authorization", "Basic "+ new BuildAuthBase64().getAuthBase64());
		
		BufferedReader in = new BufferedReader(
		        new InputStreamReader(conn.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine).append("\n");
		}
		
		in.close();
		
		return response.toString();
	}
	
	public String getAvatar() throws IOException{
		
		URL url = new URL(Constants.Links.AVATAR_HOST + Constants.Credentials.USER);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		conn.setRequestProperty("Authorization", "Basic "+ new BuildAuthBase64().getAuthBase64());
		
		BufferedReader in = new BufferedReader(
		        new InputStreamReader(conn.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine).append("\n");
		}
		
		in.close();
		
		return response.toString();
	}
	
}
