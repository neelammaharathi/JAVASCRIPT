package com.cure.connects.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="CureConnectRegister")
public class RegisterInfo 
{
	@Id
	@Column(name="User_id")
	private String userId;
	@Column(name="MediType")
	private String meditype;
	@Column(name="First_name")
	private String firstname;
	@Column(name="Last_name")
	private String lastname;
	@Column(name="Address")
	private String address;
	@Column(name="Phone")
	private String phone;
	private String license;
	private String qualification;
	private String email;
	private String password;
	private byte[] certificate;
	private String certificateName;
	
	public RegisterInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public RegisterInfo(String userId,String meditype, String firstname, String lastname, String address, String phone,
			String license, String qualification, String email, String password,byte[] certificate,String certificateName) {
		super();
		this.userId=userId;
		this.meditype = meditype;
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.phone = phone;
		this.license = license;
		this.qualification = qualification;
		this.email = email;
		this.password = password;
		this.certificate=certificate;
		this.certificateName=certificateName;
	}

	public String getMeditype() {
		return meditype;
	}
	public void setMeditype(String meditype) {
		this.meditype = meditype;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getLicense() {
		return license;
	}
	public void setLicense(String license) {
		this.license = license;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public byte[] getCertificate() {
		return certificate;
	}
	public void setCertificate(byte[] certificate) {
		this.certificate = certificate;
	}
	public String getCertificateName() {
		return certificateName;
	}

	public void setCertificateName(String certificateName) {
		this.certificateName = certificateName;
	}

	@Override
	public String toString() {
		return "RegisterInfo [userId=" + userId + ", meditype=" + meditype + ", firstname=" + firstname + ", lastname="
				+ lastname + ", address=" + address + ", phone=" + phone + ", license=" + license + ", qualification="
				+ qualification + ", email=" + email + ", password=" + password + "]";
	}

	
	
}
