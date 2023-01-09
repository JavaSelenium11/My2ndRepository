package org.testing.practice;

import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class TC7_PostRequest_OrgJson_Complex 
{
	public static void main(String[] args) 
	{
		JSONObject inner=new JSONObject();
		inner.put("NZ","39");
		inner.put("Aus","45");
		inner.put("Eng","38");
		
		JSONObject outer=new JSONObject();
		outer.put("FirstName","Mahendra");
		outer.put("LastName","Dhoni");
		outer.put("BattingAvg",inner);
		
		Response store=
		given()
		.contentType(ContentType.JSON)
		.body(outer.toString())
		.when()
		.post("http://localhost:3000/India");
		
		System.out.println("The status code is ");
		System.out.println(store.statusCode());
	}
}
