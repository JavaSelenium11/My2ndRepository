package org.testing.practice;

import static io.restassured.RestAssured.*;

import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class TC6_PostRequest_OrgJsonLibrary 
{
	public static void main(String[] args) 
	{
		JSONObject jo=new JSONObject();
		jo.put("Name","Yuvraj");
		jo.put("LastName","Singh");
		jo.put("BattingAvg","39");
		
		Response store=
		given()
		.contentType(ContentType.JSON)
		.body(jo.toString())
		.when()
		.post("http://localhost:3000/India");
		
		System.out.println("The status code is ");
		System.out.println(store.statusCode());	
	}
	}