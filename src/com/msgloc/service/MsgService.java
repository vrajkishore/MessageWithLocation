package com.msgloc.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.msgloc.dao.MsgDao;
import com.msgloc.models.Msg;

public class MsgService {
	private MsgDao msgDao;

	public MsgDao getMsgDao() {
		return msgDao;
	}

	public MsgService() {
		super();
	}

	public void setMsgDao(MsgDao msgDao) {
		this.msgDao = msgDao;
	}

	public List<Msg> getAllMsgs(Integer id) {
		// TODO Auto-generated method stub
		
		List<Msg> msg = null;
		try {
			msg = msgDao.getAllMsgs(id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return msg;
		
	}

	public String saveMsg(Msg msg, Integer id,HttpServletRequest req) {
		// TODO Auto-generated method stub
		String ipAddress = req.getHeader("X-FORWARDED-FOR");  
	       if (ipAddress == null) {  
	         ipAddress = req.getRemoteAddr();  
	   }
		boolean status = false;
		String message = "msg not updated";
		try {
			msgDao.saveMsg(msg,ipAddress);
			status = true;
			message = "updated";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "{\"status\":"+status+",\"message\":\""+message+"\"}";
	}

	public String deleteMsg(Integer id, Integer msgId) {
		// TODO Auto-generated method stub
		boolean status = false;
		String message = "msg not updated";
		try {
			msgDao.deleteMsg(msgId);
			status = true;
			message = "deleted";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "{\"status\":"+status+",\"message\":\""+message+"\"}";
	}
}
