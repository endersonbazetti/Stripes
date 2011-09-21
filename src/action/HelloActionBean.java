package action;
import java.util.Date;
import java.util.Random;

import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.validation.Validate;


public class HelloActionBean extends BaseActionBean {

	private static final String VIEW = "/WEB-INF/jsp/hello.jsp";

	@Validate(encrypted=true)
	public String password;
	
	private Date date;

	public Date getDate() {
		return date;
	}

	@DefaultHandler
	public Resolution currentyDate() {
		System.out.println("Password: " + password);
		this.date = new Date();
		return new ForwardResolution(VIEW);
	}

	public Resolution randomDate() { 
		long max = System.currentTimeMillis(); 
		long random = new Random().nextLong() % max; 
		date = new Date(random); 
		return new ForwardResolution(VIEW); 
	}
}
