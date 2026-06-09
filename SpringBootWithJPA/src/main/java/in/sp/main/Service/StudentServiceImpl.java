package in.sp.main.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.sp.main.Entity.Student;
import in.sp.main.Repository.StudentRepository;
@Service
public class StudentServiceImpl implements StudentService {

	
	@Autowired
	StudentRepository studentrepository;
	@Override
	public boolean addStudentdetails(Student std) {
		boolean status =false;
		try {
			studentrepository.save(std);
			status=true;
		}
		catch(Exception e) {
			status=false;
			e.printStackTrace();
		}
		
		return status;
	}
	@Override
	public List<Student> getStudentDetail() {
		
		return studentrepository.findAll();
	}
	@Override
	public Student getsudentbyid(long id) {
		
	Optional<Student> optionalStudent=	studentrepository.findById(id);
	
	if(optionalStudent.isPresent()) {
		return optionalStudent.get();
	}
		
		return null;
	}
	@Override
	public boolean updateStudent(long id, String Name) {
	    Student std = getsudentbyid(id);
	    if(std!=null) {
	    	std.setName(Name);
	    	studentrepository.save(std);
	    	
	    	return true;
	    }
		return false;
	}
	@Override
	public boolean deleteDeatails(long id) {
		boolean status =false;
		try {
			studentrepository.deleteById(id);
			status=true;
		}catch(Exception e) {
			status =false;
			e.printStackTrace();
		}
		return status;
	}

}
