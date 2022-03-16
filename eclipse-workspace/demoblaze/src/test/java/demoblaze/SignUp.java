package demoblaze;

import java.io.IOException;

import org.testng.annotations.Test;

import basePackage.Base;

public class SignUp extends Base {

	@Test(description="Tests a user can sign up with data")
	public void ValidSignUp() throws IOException {
		
		InitDriver();	
	}

}
