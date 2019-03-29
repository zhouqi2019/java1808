package com.qianfeng.fxmall.commons.mybatis;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MyBatisSessionFactoryUtils {

    /**
     * 饿汉单例模式
     */
    public static SqlSessionFactory sqlSessionFactory;
    private static ThreadLocal<SqlSession> threadLocal = new ThreadLocal<>();

    static {
        initSessionFactory();
    }

    private static  void initSessionFactory(){
        try {
            //1.加载配置文件(全局)
            InputStream inputStream = Resources.getResourceAsStream("mybatis.cfg.xml");
            //2.全局唯一
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static SqlSessionFactory getSqlSessionFactory(){
        if(sqlSessionFactory == null){
            initSessionFactory();
        }
        return sqlSessionFactory;
    }
    public static SqlSession getSession(){
        System.out.println(Thread.currentThread().getName());
        SqlSession session = threadLocal.get();
        if(session == null){
            session = sqlSessionFactory.openSession();
            threadLocal.set(session);
        }
        return session;
    }
}
