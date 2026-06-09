package sp.in.main.Repository;

import org.springframework.stereotype.Repository;

import sp.in.main.Entity.User;
@Repository
public interface DBoperation {
	
	public User getUserDetails(Long id); 
		
	

}
