package com.bbbb.demo.service;

import com.bbbb.demo.bean.User;
import org.apache.ibatis.annotations.Delete;
import org.springframework.stereotype.Service;


import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

//@WebService(name = "UserService",targetNamespace = "http://service.demo.bbbb.com/")
@Path("/userService")
public interface UserService {
    /**
     * @Path:访问当前服务接口方法的路径 /userService/user
     * @POST：处理请求的类型 - 对应insert
     * @Consumes:服务器支持请求的数据格式类型
     * @Produces：服务器支持返回的数据格式类型
     *
     */
    @Path("/p1")
    @GET
    //@Consumes({"application/xml", "application/json"})
    public String getString();

    /**
     * 新增用户
     * @param user
     * @return
     */
    @Path("/user")
    @POST
    @Consumes(MediaType.APPLICATION_XML)
    //@Produces({"application/xml", "application/json"})
    void addUser(User user);

    /**
     * 修改用户
     * @param user
     * @return
     */
    @Path("/user")
    @PUT
    @Consumes(MediaType.APPLICATION_XML)
    boolean updateUser(User user);


    /**
     * 删除用户
     * @param id
     * @return
     */
    @Path("/user")
    @DELETE
    @Consumes({"application/xml", "application/text"})
    @Produces({"application/xml", "application/text"})
    boolean deleteUser(int id);

    /**
     * 根据用户名字查询用户信息
     * @param userName
     */
    @Path("/user")
    @GET
    //@Consumes({"application/xml", "application/json"})
    @Produces(MediaType.APPLICATION_XML)
    User findUserByName(@QueryParam("userName")  String userName);

    /**
     * 查询所有
     * @return
     */
    @Path("/userAll")
    @GET
    //@Consumes({"application/xml", "application/json"})
    @Produces({"application/xml", "application/json"})
    List<User> findAll();

}