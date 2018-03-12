package com.msgloc.models;

public class User {

	private int id;
	private String name, location,IP, last_login, last_update;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}
	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}
	/**
	 * @return the iP
	 */
	public String getIP() {
		return IP;
	}
	/**
	 * @param iP the iP to set
	 */
	public void setIP(String iP) {
		IP = iP;
	}
	/**
	 * @return the last_login
	 */
	public String getLast_login() {
		return last_login;
	}
	/**
	 * @param last_login the last_login to set
	 */
	public void setLast_login(String last_login) {
		this.last_login = last_login;
	}
	/**
	 * @return the last_update
	 */
	public String getLast_update() {
		return last_update;
	}
	/**
	 * @param last_update the last_update to set
	 */
	public void setLast_update(String last_update) {
		this.last_update = last_update;
	}
	/**
	 * @return the mobile
	 */
	public Float getMobile() {
		return mobile;
	}
	/**
	 * @param mobile the mobile to set
	 */
	public void setMobile(Float mobile) {
		this.mobile = mobile;
	}
	Float mobile;
}
