package org.testing.practice;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class TC2_GetRequest_Particular 
{
 public static void main(String[] args) 
 {
	 Response store=
	 
	 given()
	 .contentType(ContentType.JSON)
	 .when()
	 .get("http://localhost:3000/India/1");
	 
	 System.out.println("The status code is ");
	 System.out.println(store.statusCode());
	 System.out.println("The response is ");
	 System.out.println(store.asString());	
}
}
