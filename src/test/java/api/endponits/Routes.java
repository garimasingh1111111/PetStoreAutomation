package api.endponits;

/*
  swagger uri : https://petstore.swagger.io/#
  
  create user(POST) : https://petstore.swagger.io/#/user
  https://petstore.swagger.io/v2/user/createWithArray
 
  get user(GET):https://petstore.swagger.io/#/user/{username}
  https://petstore.swagger.io/v2/user/string
 
  update user(PUT):https://petstore.swagger.io/#/user/{username}
   https://petstore.swagger.io/v2/user/string
 
  
  delete user(DELETE):https://petstore.swagger.io/#/user/{username}
   https://petstore.swagger.io/v2/user/string
  
 */
public class Routes {

	// User Module
	public static String base_url = "https://petstore.swagger.io/v2";
	// public static String base_url = "https://petstore.swagger.io/#";
	public static String post_url = base_url + "/user";
	public static String get_url = base_url + "/user/{username}";
	public static String put_url = base_url + "/user/{username}";
	public static String delete_url = base_url + "/user/{username}";

	// Add Pet Module
	// Add Store Module

}
