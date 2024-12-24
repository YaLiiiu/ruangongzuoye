package com.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.model.SuperAdmin;
public interface SuperAdminMapper {
    //添加
    public int insert(SuperAdmin admin);  
    //删除
    public void delete(int id);  
    //根据id获取数据
    public SuperAdmin get(int id);  
    //修改
    public int update(SuperAdmin admin);   
     //列表
    public List<SuperAdmin> list(@Param("where") String where);
    //分页
    public List<SuperAdmin> sealist(@Param("where") String where);
    //统计
    public int total(); 
}