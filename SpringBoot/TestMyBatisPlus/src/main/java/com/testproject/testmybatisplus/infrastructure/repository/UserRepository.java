package com.testproject.testmybatisplus.infrastructure.repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.testproject.testmybatisplus.infrastructure.repository.po.UserPO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserRepository extends BaseMapper<UserPO> {

    @Select(" select * from user_info ")
    List<UserPO> selectAll();

}
