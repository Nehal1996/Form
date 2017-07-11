package com.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="Tablen")
public class regvo {
	
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
int id;
@Column(name="fname")
String fn;
@Column(name="mname")
String mn;
@Column(name="lname")
String ln;



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


}
