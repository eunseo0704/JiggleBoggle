package com.example.demo.Mapper;

import com.example.demo.domain.UserVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    public int setSignUp(UserVO userVo);

}
