package com.hzt.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import lombok.Data;

@Data
public class BasePojo {
    @TableId(type = IdType.AUTO)
    //设置id自增长
    private Long id;
    
}
