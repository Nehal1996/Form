package com.vo;

import javax.persistence.Column;
import org.hibernate.validator.constraints.NotEmpty;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.NotNull;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.Email;

@Entity
@Table(name="Tablef")
public class regvo2 {
	
@Id
@GeneratedValue(strategy=GenerationType.AUTO)

int id;

@Column(name="fname")
@NotEmpty(message= "please fill ")
String fn;

@Column(name="mname")
@Size(min=2,max=30)
String mn;
@Column(name="lname")
String ln;
@Column(name="address")
String add;

@Column(name="email")
@Email
String email;
@Column(name="contact")
String contact;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFn() {
	return fn;
}
public void setFn(String fn) {
	this.fn = fn;
}
public String getMn() {
	return mn;
}
public void setMn(String mn) {
	this.mn = mn;
}
public String getLn() {
	return ln;
}
public void setLn(String ln) {
	this.ln = ln;
}
public String getAdd() {
	return add;
}
public void setAdd(String add) {
	this.add = add;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getContact() {
	return contact;
}
public void setContact(String contact) {
	this.contact = contact;
}





}
