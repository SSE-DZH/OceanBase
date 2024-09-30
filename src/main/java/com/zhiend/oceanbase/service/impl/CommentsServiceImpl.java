package com.zhiend.oceanbase.service.impl;

import com.zhiend.oceanbase.entity.Comments;
import com.zhiend.oceanbase.mapper.CommentsMapper;
import com.zhiend.oceanbase.service.ICommentsService;
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
public class CommentsServiceImpl extends ServiceImpl<CommentsMapper, Comments> implements ICommentsService {

}
