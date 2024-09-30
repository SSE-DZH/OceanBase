package com.zhiend.oceanbase.controller;


import com.zhiend.oceanbase.entity.Users;
import com.zhiend.oceanbase.result.Result;
import com.zhiend.oceanbase.service.IUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Zhiend
 * @since 2024-09-30
 */
@RestController
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private IUsersService usersService;
    // 新增user
    @PostMapping("/add")
    public Result add(Users users){
        usersService.addUser(users);
        return Result.success();
    }

    @PostMapping("/list")
    public Result list(){
        return Result.success(usersService.list());
    }
}
