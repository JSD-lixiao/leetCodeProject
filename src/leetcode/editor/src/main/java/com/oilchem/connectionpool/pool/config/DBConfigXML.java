package com.oilchem.connectionpool.pool.config;


/**
 * @author lixiao
 * @version 1.0
 * @date 2020/4/29 10:06
 */
public class DBConfigXML {
    public static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    public static final String URL = "jdbc:mysql://db1.oilchem.local:3306/lz_basedata";
    public static final String USERNAME = "oilchem";
    public static final String PASSWORD = "mysteel";
    public static final Integer INIT_COUNT = 10;
    public static final Integer STEP = 2;
    public static final Integer MAX_COUNT = 50;

}
