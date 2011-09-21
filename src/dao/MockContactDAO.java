package dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import model.Contact;

public class MockContactDAO implements ContactDAO {

	private static MockContactDAO dao;
	
	private static Map<Integer, Contact> contacts;
	
	static {
		populateCont1acts();
	}
	
	public static ContactDAO getInstance() {
		if (dao == null) {
			dao = new MockContactDAO();
			return dao;
		}
		return dao;
	}

	public Collection<Contact> read() {
		return contacts.values();
	}

	public Contact read(Integer id) {
		return contacts.get(id);
	}

	public void save(Contact contact) {
		contacts.put(contact.getId(), contact);
	}

	public void delete(Integer id) {
		contacts.remove(id);
	}

	private static void populateCont1acts() {
		Contact enderson = new Contact("Enderson", "Bazetti", "endersonbazetti@gmail.com", "1199991111", "15/08/1985");
		Contact diego = new Contact("Diego", "Almeida", "diegoalmeida@gmail.com", "1188882222", "21/02/1985");
		Contact andre = new Contact("Andre", "Michi", "andremichi@gmail.com", "1177773333", "01/01/1985");
		Contact felipe = new Contact("Felipe", "Bassan", "felipebassan@gmail.com", "1166664444", "18/10/1985");
		
		contacts = new HashMap<Integer, Contact>();
		contacts.put(enderson.getId(), enderson);
		contacts.put(diego.getId(), diego);
		contacts.put(andre.getId(), andre);
		contacts.put(felipe.getId(), felipe);
	}
	
}
