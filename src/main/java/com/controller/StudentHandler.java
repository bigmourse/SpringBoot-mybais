package com.controller;

import com.entity.Student;
import com.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentHandler {
//    注入
    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/findAll")
    public List<Student> findAll(){
        int i=0;
        return studentRepository.findAll();

    }
//    @PathVariable("id") Long id接收参数
    @GetMapping("/findById/{id}")
    public  Student findById(@PathVariable("id") Long id){
        return  studentRepository.findById(id);
    }
//    postman传过来的json格式数据，这里需要转化成Student对象。
//      @ResponseBody注解是把Java对象转成json数据返回给客户端
//    @RequestBody注解把请求中json数据转换为java对象
    @PostMapping("/save")
    public  void save(@RequestBody Student student){
        studentRepository.save(student);
    }
    @PutMapping("/update")
    public  void update(@RequestBody Student student){
        studentRepository.update(student);
    }
    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") long id){
        studentRepository.deleteById(id);
    }

}
