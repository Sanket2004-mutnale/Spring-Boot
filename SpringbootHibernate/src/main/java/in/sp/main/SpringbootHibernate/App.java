package in.sp.main.SpringbootHibernate;




import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import in.sp.main.Entity.User;





public class App 
{
    public static void main( String[] args )
    
    {
//       User user=new User();
//       user.setId(2);
//       user.setName("sanket");
//       user.setEmail("sanket123@gmail.com");
//       user.setGender("male");
//       user.setCity("pune");
//       
//       User user2=new User();
//       user2.setId(2);
//       user2.setName("Yash");
//       user2.setEmail("Yash@gmail.com");
//       user2.setGender("Male");
//       user2.setCity("pune");
//       
//       User user3=new User();
//     
//       user3.setName("Yash");
//       user3.setEmail("Yash@gmail.com");
//       user3.setGender("Male");
//       user3.setCity("Kolhapur");
       
       
    	Configuration cfg =  new Configuration();
        cfg.configure("/in/sp/main/Config/hibernate.cfg.xml");
        
        SessionFactory sessionfactory=cfg.buildSessionFactory()  ;
        Session session= sessionfactory.openSession() ;
        Transaction transaction=session.beginTransaction() ;
  
        
//     ---------------Insertion Method-----------        
//        try {
//        	 session.persist(user3);
//             transaction.commit(); 
//        }
//        catch(Exception e) {
//           transaction.rollback();
//        	e.printStackTrace();
//        }
    
//     -----------Select Method ----------------
//        try {
//        	User user =session.get(User.class, 3);
//        	System.out.println(user.getId());
//        	System.out.println(user.getName());
//        	System.out.println(user.getEmail());
//        	System.out.println(user.getGender());
//        	System.out.println(user.getCity());
//        	
//        	
//        }
//        catch(Exception e) {
//        	e.printStackTrace();
//        	
//        }
        
//   ----------------update opration------------
        
//        try {
//        	User user = session.get(User.class, 2);
//        	user.setEmail("m@gmail.com");
//        	session.update(user);
//        	transaction.commit();
//        	System.out.println("successful");
//        	
//        }
//        catch(Exception e){
//        	e.printStackTrace();
//        	System.out.println(" not successful");
//        }
//        
  
        
        //------------------Delete operation---------
        try {
        	User user = session.get(User.class, 3L);
        	
        	session.delete(user);
        	transaction.commit();
        	System.out.println("successful");
        	
        }
        catch(Exception e){
        	e.printStackTrace();
        	System.out.println(" not successful");
        }
    }
}
