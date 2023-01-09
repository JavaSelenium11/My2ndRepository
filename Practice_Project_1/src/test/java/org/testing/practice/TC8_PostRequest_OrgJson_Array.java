package org.testing.practice;

import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class TC8_PostRequest_OrgJson_Array 
{
	public static void main(String[] args) 
	{
		JSONObject inner1=new JSONObject();
		inner1.put("Aus","101");
		inner1.put("Eng","125");
		
		JSONObject inner2=new JSONObject();
		inner2.put("Haryana","160");
		inner2.put("TamilNadu","181");
		
		JSONArray ja=new JSONArray();
		ja.put(0,inner1);
		ja.put(1,inner2);
		
		JSONObject jo=new JSONObject();
		jo.put("FirstName","Ajit");
		jo.put("LastName","Agarkar");
		jo.put("Wickets",ja);
		
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
