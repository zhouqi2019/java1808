package com.qianfeng.fxmall.user.mapper;

import com.qianfeng.fxmall.user.po.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {

    UserInfo checkUsername(@Param("userName") String userName);
}
