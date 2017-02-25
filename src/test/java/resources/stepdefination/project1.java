package resources.stepdefination;

import cucumber.api.java.en.*;

public class project1 {
	@Given("^user is having valid url$")
	public void user_is_having_valid_url() {
	    // Write code here that turns the phrase above into concrete actions
	    
	    System.out.println("success");
	    
	    String str= null;
	    int a=10; int b=0;
	    
	    try{
	    System.out.println(str.length());
	    str= "Divya";
	            }
	    catch(NullPointerException npe)
	    {
		System.out.println("catch block");
	}
	    catch(Exception npe){
	    	System.out.println("parent exception block");
	    }
	    
	    finally {
	    	System.out.println("final block");
	    }
	}
	    

	@Then("^application should launch$")
	public void application_should_launch(){
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("succecess1");
		try {
		throw new NullPointerException();
		}
		catch(NullPointerException npe){
		System.out.println("safas");
	}


}

@Then("^sample throws$")
public void sample_throws() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new Exception();
}

public void sample() throws Throwable{
	throw new Exception();
}
}
