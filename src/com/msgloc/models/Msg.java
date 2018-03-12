package com.msgloc.models;

public class Msg {

	private int msg_id;
	int sender_id;
	int receiver_id;
	private String message, type, status, sent_time, receive_time;
	/**
	 * @return the msg_id
	 */
	public int getMsg_id() {
		return msg_id;
	}
	/**
	 * @param msg_id the msg_id to set
	 */
	public void setMsg_id(int msg_id) {
		this.msg_id = msg_id;
	}
	/**
	 * @return the sender_id
	 */
	public int getSender_id() {
		return sender_id;
	}
	/**
	 * @param sender_id the sender_id to set
	 */
	public void setSender_id(int sender_id) {
		this.sender_id = sender_id;
	}
	/**
	 * @return the receiver_id
	 */
	public int getReceiver_id() {
		return receiver_id;
	}
	/**
	 * @param receiver_id the receiver_id to set
	 */
	public void setReceiver_id(int receiver_id) {
		this.receiver_id = receiver_id;
	}
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @return the sent_time
	 */
	public String getSent_time() {
		return sent_time;
	}
	/**
	 * @param sent_time the sent_time to set
	 */
	public void setSent_time(String sent_time) {
		this.sent_time = sent_time;
	}
	/**
	 * @return the receive_time
	 */
	public String getReceive_time() {
		return receive_time;
	}
	/**
	 * @param receive_time the receive_time to set
	 */
	public void setReceive_time(String receive_time) {
		this.receive_time = receive_time;
	}
	
	
}
