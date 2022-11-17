package controller;

import database.DbConnection;
import models.Student;

public class StudentController {
    DbConnection dbConnection;
    public int insertStudent(Student student){
        String insertQuery = String.format("insert into tbl_student(std_id,std_name,std_contact,std_age,std_address)values(%d,'%s','%s',%d,'%s')", student.getStd_id(),student.getStd_name(),student.getStd_contact(),student.getStd_age(),student.getStd_address());
        System.out.println(insertQuery);
        dbConnection=new DbConnection();
        int result = dbConnection.manipulate(insertQuery);
        return result;
    }
}
