package br.com.empresa.jiraintegration;

import java.io.IOException;

import br.com.empresa.jiraintegration.config.Constants;
import br.com.empresa.jiraintegration.helper.HttpHelper;

public class Main {

	public static void main(String[] args) throws IOException{
		
		System.out.println(new HttpHelper().doHttpGet(Constants.Fields.ISSUE, "QA-9"));
		System.out.println(new HttpHelper().getAvatar());
	}
	
}
