package com.atguigu.mongodb.repository;

import com.atguigu.mongodb.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @Description:
 * @Author: zhangqi
 * @CreateTime: 2021/6/718:01
 * @Company: MGL
 */
@Repository
public interface UserRepository extends MongoRepository<User, String> {

}