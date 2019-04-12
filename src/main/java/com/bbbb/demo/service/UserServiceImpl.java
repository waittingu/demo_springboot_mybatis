package com.bbbb.demo.service;

import com.bbbb.demo.bean.User;
import com.bbbb.demo.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.jws.WebService;
import java.util.List;

//@WebService(serviceName = "UserService", //与接口中指定的name一直
//        targetNamespace = "http://service.demo.bbbb.com/", // 与接口中的命名空间一致,一般是接口的包名倒
//        endpointInterface = "com.bbbb.demo.service.UserService"//接口地址
//
//)
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public String getString() {
        return "path";
    }


//    @Override
//    public String sayHello(String name) {
//        return "hello  "+name ;
//    }
    @Override
    public void addUser(User user) {

        try{
            userDao.addUser(user);
            System.out.println("添加成功");
        }catch(Exception e){
            e.printStackTrace();
        }

    }

    @Override
    public boolean updateUser(User user) {
        boolean flag=false;
        try{
            userDao.updateUser(user);

            flag=true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean deleteUser(int id) {
        boolean flag=false;
        try{
            userDao.deleteUser(id);
            flag=true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public User findUserByName(String userName) {
        return userDao.findByName(userName);
    }


    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }
}
