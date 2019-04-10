package com.tuacy.mybatis.interceptor.interceptor.tableshard;

import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.reflection.MetaObject;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 按日分表,根据当前时间
 */
public class DayTableShardStrategy implements ITableShardStrategy {

    @Override
    public String tableShard(MetaObject metaStatementHandler, String tableName, String[] shardParamKey) {
        BoundSql boundSql = (BoundSql) metaStatementHandler.getValue("delegate.boundSql");
        String originSql = boundSql.getSql();
        SimpleDateFormat sdf = new SimpleDateFormat("YYYYMMdd");
        String newTableName = tableName + "_" + sdf.format(new Date());
        return originSql.replaceAll(tableName, newTableName);
    }
}
