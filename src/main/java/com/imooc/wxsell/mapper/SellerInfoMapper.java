package com.imooc.wxsell.mapper;

import com.imooc.wxsell.config.MyMapper;
import com.imooc.wxsell.dataobject.SellerInfo;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.Date;
import java.util.List;

@Mapper
public interface SellerInfoMapper extends MyMapper<SellerInfo> {


}
