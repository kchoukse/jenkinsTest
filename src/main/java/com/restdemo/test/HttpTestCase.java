package com.restdemo.test;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;

import javax.json.Json;
import javax.json.JsonObject;

import org.junit.Test;
import org.mockito.Mock;
import org.springframework.boot.json.GsonJsonParser;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ibm.icu.impl.duration.impl.DataRecord.ENumberSystem;
import com.restdemo.model.ApplicantScore;
import com.restdemo.repository.ApplicantScoreRepository;

public class HttpTestCase {

	private static final String GET_URL = "http://localhost:8080/restdemo/appScore/get-score-list";

	@Mock
	ApplicantScoreRepository x;

	@Test
	public void test() throws Exception {

		URL obj = new URL(GET_URL);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		con.setRequestMethod("GET");
		int responseCode = con.getResponseCode();
		BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();

		System.out.println(response.toString());
		assertNotNull(response);
//		System.out.println("GET Response Code :: " + responseCode);
//		if (responseCode == HttpURLConnection.HTTP_OK) { // success
//			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
//			String inputLine;
//			StringBuffer response = new StringBuffer();
//
//			while ((inputLine = in.readLine()) != null) {
//				response.append(inputLine);
//			}
//			in.close();
//
//			// print result
//			System.out.println(response.toString());
//		} else {
//			System.out.println("GET request not worked");
//		}
//		}
//
//
//		// When
//		HttpResponse response = HttpClientBuilder.create().build().execute(request);
//
//		// Then
//		GitHubUser resource = RetrieveUtil.retrieveResourceFromResponse(response, GitHubUser.class);
//		assertThat("eugenp", Matchers.is(resource.getLogin()));
	}

}
