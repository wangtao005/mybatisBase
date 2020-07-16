package com.wt.mybatisplus.base.baseService.baseServiceImpl;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wt.mybatisplus.base.baseService.BaseService;

public class BaseServiceImpl<T> extends ServiceImpl< BaseMapper<T>, T> implements BaseService<T> {


}
