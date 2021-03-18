package com.utilController.dao;

import com.utilController.entity.SysJob;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author WCH
 * @since 2021-03-17
 */
@Mapper
public interface SysJobMapper extends BaseMapper<SysJob> {


    Map<String, Object> u_serach();
}
