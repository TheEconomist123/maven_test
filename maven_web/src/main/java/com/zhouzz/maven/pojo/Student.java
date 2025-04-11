package com.zhouzz.maven.pojo;

import com.alibaba.druid.pool.DruidDataSource;

import javax.servlet.ServletContext;

/**
 * @author zhouzz
 * @version 1.0
 * @date 2025/4/11 10:04
 */
public class Student {

    public  void sayHello(){

        //druid 在编译范围内是可以用的
         DruidDataSource ds = new DruidDataSource();

         ServletContext context = null;

    }
}
