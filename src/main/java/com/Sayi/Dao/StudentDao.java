package com.Sayi.Dao;

import com.Sayi.Entity.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentDao {

    private static Map<Integer, Student> students;
    static {
        students = new HashMap<Integer, Student>(){
            {
                put(1, new Student(1, "Murali", "Comp"));
                put(2, new Student(2, "Abhi", "Science"));
                put(3, new Student(3, "Sridevi", "Maths"));
                put(4, new Student(4, "Gang", "Telugu"));
            }
        };
    }

    public Collection<Student> getAllStudents() {
        return this.students.values();
    }

    public Student getStudentById(int id){
        return this.students.get(id);
    }

    public Student deleteStudentById(int id) {
        return this.students.remove(id);
    }
}
