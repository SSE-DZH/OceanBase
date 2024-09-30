package com.zhiend.oceanbase.service.impl;

import com.zhiend.oceanbase.entity.Posts;
import com.zhiend.oceanbase.mapper.PostsMapper;
import com.zhiend.oceanbase.service.IPostsService;
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
public class PostsServiceImpl extends ServiceImpl<PostsMapper, Posts> implements IPostsService {

}
