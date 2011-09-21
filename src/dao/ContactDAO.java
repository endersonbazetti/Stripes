package dao;

import java.util.Collection;

import model.Contact;

public interface ContactDAO {

	Collection<Contact> read();
	Contact read(Integer id);
	void save(Contact contact);
	void delete(Integer id);
}
