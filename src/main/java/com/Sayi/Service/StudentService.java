package com.Sayi.Service;

import com.Sayi.Dao.StudentDao;
import com.Sayi.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StudentService {

    @Autowired
    private StudentDao studentDao;

    public Collection<Student> getAllStudents() {
        return studentDao.getAllStudents();
    }

    public Student getStudentById(int id){
        return this.studentDao.getStudentById(id);
    }

    public Student deleteStudentById(int id) {
        return this.studentDao.deleteStudentById(id);
    }
}
