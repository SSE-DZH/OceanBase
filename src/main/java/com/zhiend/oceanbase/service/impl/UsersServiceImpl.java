package com.zhiend.oceanbase.service.impl;

import com.zhiend.oceanbase.entity.Users;
import com.zhiend.oceanbase.mapper.UsersMapper;
import com.zhiend.oceanbase.service.IUsersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Zhiend
 * @since 2024-09-30
 */
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users> implements IUsersService {

}
