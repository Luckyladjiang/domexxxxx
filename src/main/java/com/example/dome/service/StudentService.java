package com.example.dome.service;


import com.example.dome.pojo.Student;
import com.example.dome.pojo.StudentExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface StudentService {

    //增
    int updata(Student record,StudentExample example);

    //删

    //改

    //查
    List<Student> selectByExample(StudentExample example);







}





