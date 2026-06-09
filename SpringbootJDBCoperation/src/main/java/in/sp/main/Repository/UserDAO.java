package in.sp.main.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import in.sp.main.Entity.User;

@Repository
public class UserDAO {
	
	@Autowired
	private JdbcTemplate jdbctemplate;

	
	//insert Query
//	public boolean insertUser(User user) {
//		
//	    boolean	status = false;
//	    
//		try {
//			String SQL_Query="INSERT INTO USER VALUES(?,?,?,?)";
//			int count=jdbctemplate.update(SQL_Query,user.getName(),user.getEmail(),user.getGender(),user.getCity());
//			if(count>0) {
//				status=true;
//			}
//			else {
//				status=false;
//			}
//		}
//		catch(Exception e) {
//			status=false;
//			e.printStackTrace();
//		}
//		return status;
//	}
	
	
	//Update query
//	public boolean updateuser(User user) {
//		boolean status=false;
//		try {
//			
//			String update_query = "UPDATE USER SET email=?, gender=?, city=? WHERE name=? ";
//			int count=jdbctemplate.update(update_query,user.getEmail() ,user.getGender(),user.getCity(),user.getName());
//			if(count>0) {
//				status=true;
//			}
//			else {
//				status=false;
//			}
//		}catch(Exception e) {
//			status=false;
//			e.printStackTrace();
//			
//		}
//		return status;
//	}
	
	
	//delete query
//	public boolean deletequeryname(String city) {
//		boolean status=false;
//		try {
//			String delete_query="DELETE FROM USER WHERE CITY=?
//			int count=jdbctemplate.update(delete_query,city);
//			
//			if(count>0) {
//				status=true;
//				
//			}
//			else {
//				status = false;
//			}
//			
//		}catch(Exception e) {
//			status=false;
//			e.printStackTrace();
//		}
//		return status;
//	}
	
	//select query
	
	public User getuseremail(String email) {
		String Select_Query="Select * From user where email=?";
		return jdbctemplate.queryForObject(Select_Query, new UserRowMapper(),email);
	}
	
	public static final class UserRowMapper implements RowMapper<User>{

		@Override
		public User mapRow(ResultSet rs, int rowNum) throws SQLException {
			User user=new User();
			user.setName(rs.getString("name"));
			user.setEmail(rs.getString("email"));
			user.setGender(rs.getString("gender"));
			user.setCity(rs.getString("city"));
			
			return user;
		}

		
		
	}

}
