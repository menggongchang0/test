package com.utilController.service.impl;

import com.utilController.entity.SysJob;
import com.utilController.dao.SysJobMapper;
import com.utilController.service.ISysJobService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author WCH
 * @since 2021-03-17
 */
@Service
public class SysJobServiceImpl extends ServiceImpl<SysJobMapper, SysJob> implements ISysJobService {
    @Autowired
    private SysJobMapper a;
    @Override
    public Map<String, Object> u_serach() {

        Map<String, Object> map= a.u_serach();
        return map;
    }
}
