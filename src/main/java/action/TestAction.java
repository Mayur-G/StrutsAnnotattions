package action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

@Results({
		@Result(name="success" , location = "/success.jsp"),
		@Result(name="error" , location = "/error.jsp")
})
@Action("/testAction")
public class TestAction {

	public String execute()
	{
		System.out.println("execute() method called");
		return "success";
	}
}
