package model;;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Contact {

	private static Integer nextId = 0;
	
	private Integer id;
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	private Date birthDate;
	
	public Contact() {}
	
	public Contact(String firstName, String lastName, String email, String telephone, String date) {
		this.id = ++nextId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = telephone;
		try {
			this.birthDate = new SimpleDateFormat("dd/MM/yyyy").parse(date);
		} catch (ParseException e) {}
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public Date getBirthDate() {
		return birthDate;
	}
	
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
	@Override
	public String toString() {
		return new StringBuilder().append(firstName).append(" ").append(lastName).toString();
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( ! (obj instanceof Contact) ) {
			return false;
		}
		Contact o = (Contact) obj;
		if ( this.id == o.id 
				&& this.firstName == o.firstName
				&& this.lastName == o.lastName
				&& this.email == o.email
				&& this.phoneNumber == o.phoneNumber
				&& this.birthDate == o.birthDate ) {
			
			return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return this.id == null ? 0 : this.id;
	}
}
