package hellostruts2;

import org.apache.struts2.dispatcher.mapper.ActionMapping;

public class LoginAction {
	//name 
	public String name;
	//password
	public String pass;
	
	
	// execute method ,return the string "success"
	  public String execute() throws Exception {
	      return "success";
	   }
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	


	
}