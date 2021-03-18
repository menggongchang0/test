package com.utilController.service;

import com.utilController.entity.SysJob;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author WCH
 * @since 2021-03-17
 */
public interface ISysJobService extends IService<SysJob> {

    Map<String, Object> u_serach();
}
