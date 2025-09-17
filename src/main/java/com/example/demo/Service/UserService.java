package com.example.demo.Service;


import com.example.demo.Mapper.UserMapper;
import com.example.demo.domain.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public int setSignUp(UserVO userVo) {

        return userMapper.setSignUp(userVo);
    }
}
