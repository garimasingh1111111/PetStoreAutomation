package api.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import api.endponits.UserEndPoints;
import api.payloads.User;
import api.utilities.Dataprovider;
//if data provider method is not in the same class specify the dataprovider class name as well
import io.restassured.response.Response;

@Test(priority = 1, dataProvider = "Data", dataProviderClass = Dataprovider.class)
public class DataDrivenTest {
	public void testPostUsers(String userID, String userName, String fname, String lName, String userEmail, String pwd,
			String ph) {
		User userPayload = new User();
		userPayload.setId(Integer.parseInt(userID));
		userPayload.setUsername(userName);
		userPayload.setFirstName(fname);
		userPayload.setLastName(lName);
		userPayload.setEmail(userEmail);
		userPayload.setPassword(pwd);
		userPayload.setPhone(ph);

		Response response = UserEndPoints.createUser(userPayload);
		// response.then().log().all();
		Assert.assertEquals(response.getStatusCode(), 200);

	}

	@Test(priority = 2, dataProvider = "UserNames", dataProviderClass = Dataprovider.class)
	public void testDeleteUserByName(String userName) {
		// User userPayload = new User();
		// userPayload.setUsername(userName);
		Response response = UserEndPoints.deleteUser(userName);
		// response.then().log().all();
		Assert.assertEquals(response.getStatusCode(), 200);

	}

}
