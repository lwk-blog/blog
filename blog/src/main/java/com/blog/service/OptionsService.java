package com.blog.service;

import com.blog.entity.Options;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by dell on 2020/11/27.
 */
public interface OptionsService {
    /**
     * 获得基本信息
     *
     * @return 系统设置
     */
    Options getOptions();

    /**
     * 新建基本信息
     *
     * @param options 系统设置
     */
    void insertOptions(Options options);

    /**
     * 更新基本信息
     *
     * @param options 系统设置
     */
    void updateOptions(Options options);
}