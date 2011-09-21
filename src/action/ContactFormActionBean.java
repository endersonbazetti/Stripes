package action;

import model.Contact;
import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.RedirectResolution;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.action.SimpleMessage;
import net.sourceforge.stripes.validation.DateTypeConverter;
import net.sourceforge.stripes.validation.EmailTypeConverter;
import net.sourceforge.stripes.validation.SimpleError;
import net.sourceforge.stripes.validation.Validate;
import net.sourceforge.stripes.validation.ValidateNestedProperties;
import dao.ContactDAO;
import dao.MockContactDAO;

public class ContactFormActionBean extends BaseActionBean {
	
	private final String FORM = "/WEB-INF/jsp/contact_form.jsp";
	
	private ContactDAO contactDAO = MockContactDAO.getInstance();
	
	public Integer contactId;
	
	@ValidateNestedProperties({
			@Validate(field="email", required=true, on="save", converter=EmailTypeConverter.class),
			@Validate(field="firstName", required=true, on="save"),
			@Validate(field="lastName", on="save"),
			@Validate(field="birthDate", required=true, on="save")})
	public Contact contact;
	
	@DefaultHandler
	public Resolution form() {
		return new ForwardResolution(FORM);
	}
	
	public Resolution save() {
		System.out.println("Email size: " + this.contact.getEmail().length());
		contactDAO.save(this.contact);
		getContext().getMessages().add(new SimpleMessage("{0} has been created", this.contact));
		return new RedirectResolution(ContactListActionBean.class);
	}
	
	public Resolution cancel() {
		getContext().getMessages().add(new SimpleMessage("Action canceled"));
		return new RedirectResolution(ContactListActionBean.class);
	}
}
