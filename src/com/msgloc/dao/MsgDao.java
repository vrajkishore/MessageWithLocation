package com.msgloc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.msgloc.models.Msg;

public class MsgDao {
	private JdbcTemplate template;

	public MsgDao() {
		super();
	}

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	public List<Msg> getAllMsgs(Integer id) throws Exception{
		String sql = "select msg_id,message from msg where sender_id="+id+" or receiver_id="+id;
		List<Msg> msgs = template.query(sql, new RowMapper<Msg>(){
			public Msg mapRow(ResultSet rs,int row)throws SQLException{
				
				Msg m = new Msg();
				m.setMsg_id(rs.getInt(1));
				m.setMessage(rs.getString(2));
				return m;
			}
		});
		return msgs;
	}
	
	public void saveMsg(Msg msg,String ip) throws Exception{
		String sql = "insert into msg(sender_id,receiver_id,message,sender_ip) values("+msg.getSender_id()+","+msg.getReceiver_id()+",'"+msg.getMessage()+"','"+ip+"')";
		template.update(sql);
	}
	
	public void deleteMsg(Integer id) throws Exception{
		String sql = "delete from msg where msg_id ="+id;
		template.update(sql);
	}
	
}
