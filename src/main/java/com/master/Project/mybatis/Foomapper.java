package com.master.Project.mybatis;

import org.apache.ibatis.annotations.Mapper;

import java.time.LocalDateTime;

@Mapper
public interface Foomapper {
    LocalDateTime now();
}
