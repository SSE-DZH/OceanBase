package com.zhiend.oceanbase.service;

import com.zhiend.oceanbase.entity.Users;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zhiend.oceanbase.result.Result;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Zhiend
 * @since 2024-09-30
 */
public interface IUsersService extends IService<Users> {
    // 新增user
    void addUser(Users users);
}
