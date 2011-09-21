package action;

import java.util.Collection;

import model.Contact;
import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.RedirectResolution;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.action.SimpleMessage;
import dao.ContactDAO;
import dao.MockContactDAO;

public class ContactListActionBean extends BaseActionBean {

	private final String LIST = "/WEB-INF/jsp/contact_list.jsp";
	private final String VIEW = "/WEB-INF/jsp/contact_view.jsp";
	
	private ContactDAO contactDAO = MockContactDAO.getInstance();
	
	private Integer contactId;
	
	@DefaultHandler
	public Resolution list() {
		return new ForwardResolution(LIST);
	}
	
	public Resolution view() {
		return new ForwardResolution(VIEW);
	}
	
	public Resolution delete() {
		Contact contact = contactDAO.read(getContactId());
		contactDAO.delete(getContactId());
		getContext().getMessages().add(new SimpleMessage("Deleted {0}", contact));
		return new RedirectResolution(getClass());
	}
	
	public Collection<Contact> getContacts() {
		return contactDAO.read();
	}
	
	public Contact getContact() {
		return contactDAO.read(getContactId());
	}

	public void setContactId(Integer contactId) {
		this.contactId = contactId;
	}

	public Integer getContactId() {
		return contactId;
	}
}
