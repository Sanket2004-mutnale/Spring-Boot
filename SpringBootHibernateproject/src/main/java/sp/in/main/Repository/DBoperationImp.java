package sp.in.main.Repository;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import sp.in.main.Entity.User;
import sp.in.main.Resource.hibernate;
@Repository
public class DBoperationImp  implements DBoperation {

	@Override
	public User getUserDetails(Long id) {
		User user =null;
		try (Session session=hibernate.getSessionFactory().openSession();
				)
		{
			user=session.get(User.class, 1L);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return user;
	}
	
	

}
