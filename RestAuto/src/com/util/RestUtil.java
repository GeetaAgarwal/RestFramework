package com.util;

import java.io.IOException;

import org.apache.http.HttpHeaders;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.HttpClientBuilder;

import com.pojo.GitHubUser;

public class RestUtil {
	
	HttpUriRequest request;
	HttpResponse  response;
	GitHubUser user;
	String URI = Configuration.URI;
	
	public void getRequest(String resourceUrn) {
		request = new HttpGet(URI+resourceUrn);
		request.addHeader(HttpHeaders.CONTENT_TYPE,"application/json");
		
		try {
			this.response = HttpClientBuilder.create().build().execute(request);
			if (response != null ){
				
			}
			else {System.out.println("something went wrong" + response);}
		} catch (ClientProtocolException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
	}
        public int validateStatusCode(){
        	return response.getStatusLine().getStatusCode();
        }
}
