package com.msgloc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.msgloc.models.Msg;
import com.msgloc.models.User;

public class UserDao {
	JdbcTemplate template;
	/**
	 * @return the template
	 */
	public JdbcTemplate getTemplate() {
		return template;
	}
	/**
	 * @param template the template to set
	 */
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	public void save(User user)throws Exception{
		System.out.println(user.getLocation()+"in Dao");
		String sql = "insert into users(name,location) values('"+user.getName()+"','"+user.getLocation()+"')";
		template.update(sql);	
	}
	
	/**
	 * 
	 * @return
	 */
	public List<User> getAllUsers()throws Exception{
		String sql = "select * from users";
		List<User> names = template.query(sql, new RowMapper<User>(){
			public User mapRow(ResultSet rs,int row)throws SQLException{
			User u = new User();
			u.setName(rs.getString("name"));
			u.setLocation(rs.getString("location"));
			return u;
		}	
		});
		return names;
	}	
	
	
	
	public User getUserById(Integer id)throws Exception{
		String sql = "select * from users where id=?";
		User user = (User)template.queryForObject(sql, new Object[] { id }, new BeanPropertyRowMapper(User.class));
		return user;
	}
	
	public void updateUser(User user)throws Exception{
		String sql = "update users set name ='"+user.getName()+"', location = '"+user.getLocation()+"' where id ="+user.getId();
		template.update(sql);
	}
	
	public void deleteUser(Integer id)throws Exception{
		
	}
	
	
}