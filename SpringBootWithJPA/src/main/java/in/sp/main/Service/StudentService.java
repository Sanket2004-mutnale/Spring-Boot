package in.sp.main.Service;

import java.util.List;

import in.sp.main.Entity.Student;

public interface StudentService {
	
	public boolean addStudentdetails(Student std);
	public List<Student> getStudentDetail();
	public Student getsudentbyid(long id);
	public boolean updateStudent(long id, String Name);
	
	public boolean deleteDeatails(long id);

}
