package com.example.dome.Controller;


import com.example.dome.pojo.Student;
import com.example.dome.pojo.StudentExample;
import com.example.dome.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class testController {


    @Autowired
    StudentService studentService;


    @RequestMapping("/test")
    public String test(){
        return "index";
    }

    @RequestMapping("/select")
    @ResponseBody
    public List select(int age){
        StudentExample example = new StudentExample();
        example.createCriteria().andAgeEqualTo(age);

        List<Student> students = studentService.selectByExample(example);
        return students;
    }



    @RequestMapping("/updata")
    @ResponseBody
    public int updata(Student student,int id){
        StudentExample example = new StudentExample();
         example.createCriteria().andIdEqualTo(id);

        int updata = studentService.updata(student, example);

        return updata;
    }
}
