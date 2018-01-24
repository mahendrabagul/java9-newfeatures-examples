package io.github.mahendrabagul.http2;

import java.net.URI;

import jdk.incubator.http.HttpClient;
import jdk.incubator.http.HttpRequest;
import jdk.incubator.http.HttpResponse;

//HTTP2  _incubator module_ 
public class Solution {
	public static void main(String[] args) {
		HttpClient client = HttpClient.newHttpClient();
		HttpRequest req = HttpRequest.newBuilder(URI.create("http://www.google.com")).header("User-Agent", "Java").GET()
				.build();
		HttpResponse<String> resp = client.send(req, HttpResponse.BodyHandler.asString());
	}
}
