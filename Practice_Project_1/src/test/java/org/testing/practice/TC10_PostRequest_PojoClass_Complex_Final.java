package org.testing.practice;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class TC10_PostRequest_PojoClass_Complex_Final 
{
	public static void main(String[] args) 
	{
		TC10_PostRequest_PojoClass_Complex_Inner inner=new TC10_PostRequest_PojoClass_Complex_Inner();
		inner.setEng("43");
		inner.setAus("48");
		inner.setNZ("45");
		
		TC10_PostRequest_PojoClass_Complex_Outer outer=new TC10_PostRequest_PojoClass_Complex_Outer();
		outer.setFirstName("Virendra");
		outer.setLastName("Sehwag");
		outer.setBattingAvg(inner);
		
		Response store=
				given()
				.contentType(ContentType.JSON)
				.body(outer)
				.when()
				.post("http://localhost:3000/India");
				
				System.out.println("The status code is ");
				System.out.println(store.statusCode());
	}

}
