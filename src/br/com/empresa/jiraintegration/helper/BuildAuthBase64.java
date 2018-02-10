package br.com.empresa.jiraintegration.helper;

import org.apache.commons.codec.binary.Base64;

import br.com.empresa.jiraintegration.config.Constants;

public class BuildAuthBase64 {

	public String getAuthBase64() {
		String authString = Constants.Credentials.USER + ":" + Constants.Credentials.PASS;
		byte[] authEncBytes = Base64.encodeBase64(authString.getBytes());
		return new String(authEncBytes);
	}
	
}
