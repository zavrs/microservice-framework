package com.tuacy.mybatis.interceptor.mapper;

import com.tuacy.mybatis.interceptor.entity.vo.UserInfoVo;
import com.tuacy.mybatis.interceptor.interceptor.page.PageView;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 用户管理mapper
 */
@Repository
public interface UserManageMapper {

    List<UserInfoVo> getAllUserListPage(@Param("pageView") PageView pageView);

//    List<UserInfoVo> getAllUserListPage_COUNT(@Param("pageView") PageView pageView);

}
