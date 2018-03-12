package com.msgloc.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.msgloc.models.Msg;
import com.msgloc.service.MsgService;

@Controller
public class MsgController {
	
	@Autowired
	private MsgService msgService;

	public MsgController() {
		super();
	}

	public MsgService getMsgService() {
		return msgService;
	}

	public void setMsgService(MsgService msgService) {
		this.msgService = msgService;
	}
	
	
	@RequestMapping(value = "users/{id}/msgs", method = RequestMethod.GET)
	public @ResponseBody List<Msg> getAllMsgs(@PathVariable Integer id){
		return msgService.getAllMsgs(id);
	}
	
	@RequestMapping(value = "users/{id}/msgs",method = RequestMethod.POST)
	public @ResponseBody String saveMsg(@RequestBody Msg msg, @PathVariable Integer id,HttpServletRequest req){
		
		return msgService.saveMsg(msg,id,req);
		
	}
	
	@RequestMapping(value = "users/{id}/msgs/{msgId}", method = RequestMethod.DELETE)
	public @ResponseBody String deleteMsg(@PathVariable Integer id,@PathVariable Integer msgId){
		return msgService.deleteMsg(id,msgId);
		
	}
}
