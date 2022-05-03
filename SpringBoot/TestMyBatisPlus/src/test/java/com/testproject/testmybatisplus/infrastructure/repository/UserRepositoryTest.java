package com.testproject.testmybatisplus.infrastructure.repository;

import com.testproject.testmybatisplus.infrastructure.repository.po.UserPO;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import javax.annotation.Resource;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserRepositoryTest {

    @Resource
    private UserRepository userRepository;

    @Test
    void selectAll() {
        List<UserPO> list = userRepository.selectAll();

        Assert.isTrue(list != null && !list.isEmpty(), "没有查询到符合条件的数据");
    }
}