package com.zzy.mapper;

import com.zzy.pojo.UserEntity;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {

    @Select("select * from users")
    @Results( {
            @Result(property = "userName",column = "user_name"),
            @Result(property = "userId",column = "user_id")
    })
    List<UserEntity> getAll();

    @Select("select password from users where user_id = #{user_id}")
    String getPasswordByUserId(@Param("user_id") Long userId);
}
