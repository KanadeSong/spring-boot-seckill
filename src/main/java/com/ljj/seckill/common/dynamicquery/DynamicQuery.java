package com.ljj.seckill.common.dynamicquery;

import java.util.List;

/**
 * @CLassName DynamicQuery
 * @Description 扩展SpringDataJpa, 支持动态jpql/nativesql查询并支持分页查询
 * @Author LeeJack
 * @Date 2019/4/30/030 18:25
 * @Version 1.0
 */
public interface DynamicQuery {

    public void save(Object entity);

    public void update(Object entity);

    public <T> void delete(Class<T> entityClass, Object entityid);

    public <T> void delete(Class<T> entityClass,Object[] entityids);

    /**
     *
     * @Description: 查询对象列表，返回List
     * @Param [nativeSql, params]
     * @return java.util.List<T>
     * @author LeeJack
     * @Date 18:28 2019/4/30/030
     */
    <T> List<T> nativeQueryList(String nativeSql,Object... params);

    /**
     *
     * @Description: 查询对象列表，返回List<Map<key,value>>
     * @Param [nativeSql, params]
     * @return java.util.List<T>
     * @author LeeJack
     * @Date 18:30 2019/4/30/030
     */
    <T> List<T> nativeQueryListMap(String nativeSql,Object... params);

    /**
     *
     * @Description: 查询对象列表，返回List<组合对象>
     * @Param [resultClass, nativeSql, params]
     * @return java.util.List<T>
     * @author LeeJack
     * @Date 18:31 2019/4/30/030
     */
    <T> List<T> nativeQueryListModel(Class<T> resultClass, String nativeSql, Object... params);

    /**
     * @Description: 执行nativeSql统计查询
     * @Param [nativeSql, params]
     * @return java.lang.Object
     * @author LeeJack
     * @Date 18:32 2019/4/30/030
     */
    Object nativeQueryObject(String nativeSql, Object... params);

    /**
     * @Description: 执行nativeSql统计查询
     * @Param [nativeSql, params]
     * @return java.lang.Object[]
     * @author LeeJack
     * @Date 18:33 2019/4/30/030
     */
    Object[] nativeQueryArray(String nativeSql, Object... params);

    /**
     * @Description: 执行nativeSql的update,delete操作
     * @Param [nativeSql, params]
     * @return int
     * @author LeeJack
     * @Date 18:33 2019/4/30/030
     */
    int nativeExecuteUpdate(String nativeSql, Object... params);

}
