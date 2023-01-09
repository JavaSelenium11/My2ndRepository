package org.testing.practice;

import static io.restassured.RestAssured.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class TC3_PostRequest_SimpleJson 
{
	public static void main(String[] args) throws FileNotFoundException 
	{
		File f=new File("../Practice_Project_1/simplebodydata.json");
		FileReader fr=new FileReader(f);
		JSONTokener jt=new JSONTokener(fr);
		JSONObject jo=new JSONObject(jt);
		
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
