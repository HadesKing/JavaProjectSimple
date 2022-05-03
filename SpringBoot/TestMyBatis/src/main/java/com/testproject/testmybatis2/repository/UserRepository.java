package com.testproject.testmybatis2.repository;

import com.testproject.testmybatis2.repository.po.UserPO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserRepository {

    /**
     * 获取所有用户信息
     *
     * @author liudi
     * @since 2022.05.02
     * @return
     */
    @Select(" select * from user_info ")
    List<UserPO> getAll();

}
