package com.testproject.testmybatisplus.controller;

import com.testproject.testmybatisplus.infrastructure.repository.UserRepository;
import com.testproject.testmybatisplus.infrastructure.repository.po.UserPO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
import java.util.List;

/**
 * User Controller
 *
 * @author liudi
 * @since 2022.05.02
 */
@RestController
@RequestMapping("/api/user")
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository){
        this.userRepository = userRepository;
    }


    @GetMapping("list")
    public List<UserPO> list() {

        List<UserPO> list = new LinkedList<>();
        list = userRepository.selectAll();
        return list;
    }

}
