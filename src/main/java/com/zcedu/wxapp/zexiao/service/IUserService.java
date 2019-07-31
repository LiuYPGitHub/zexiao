package com.zcedu.wxapp.zexiao.service;

import com.zcedu.wxapp.zexiao.pojo.User;

import java.util.List;

/**
 * 用户 服务层
 */
public interface IUserService {
    /**
     * 查询用户信息
     *
     * @param userId 用户ID
     * @return 用户信息
     */
    User selectUserById(Long userId);

    /**
     * 查询用户列表
     *
     * @param user 用户信息
     * @return 用户集合
     */
    List<User> selectUserList(User user);

    /**
     * 新增用户
     *
     * @param user 用户信息
     * @return 结果
     */
    int insertUser(User user);

    /**
     * 修改用户
     *
     * @param user 用户信息
     * @return 结果
     */
    int updateUser(User user);

    /**
     * 删除用户信息
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    int deleteUserByIds(String ids);
}
