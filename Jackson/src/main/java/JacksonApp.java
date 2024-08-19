import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonApp {
	
	
	public static void main(String[] args) throws Exception {

		JacksonApp dd=new JacksonApp();
		
		dd.JsontoObj();
		
//		dd.ObjtoJson();
		
		System.out.println("hello Word");
		
	}
	
	public void ObjtoJson() throws Exception {
		Customer obj= new Customer(10, "Somaraju", 21);
		
		ObjectMapper om=new ObjectMapper();
		om.writeValue(new File("customer.json"), obj);
		
		System.out.println("Serialization Completed");
		
	}
	
	public void JsontoObj()  throws Exception{

		ObjectMapper om=new ObjectMapper();
		Customer obj=om.readValue(new File("customer.json"), Customer.class);
		System.out.println("De-sSerialization Completed");
		System.out.println(obj);
		


	}

}
