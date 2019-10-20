package com.example.dome.serviceImpl;


import com.example.dome.dao.StudentMapper;
import com.example.dome.pojo.Student;
import com.example.dome.pojo.StudentExample;
import com.example.dome.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {



    @Autowired
    StudentMapper studentMapper;


    //更新
    @Override
    public int updata(Student student, StudentExample example) {
        int i = studentMapper.updateByExampleSelective(student, example);
        return i;
    }

    //查询
    @Override
    public List<Student> selectByExample(StudentExample example) {
        List<Student> students = studentMapper.selectByExample(example);
        return students;
    }




}
