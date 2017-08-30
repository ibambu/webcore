/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bamboo.module.demo;

import com.bamboo.module.menu.beans.Menu;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author luotao
 */
public class DemoService {

    /* SPRING 事务处理说明
    TransactionDefinition接口中定义，共有7种选项可用：
        PROPAGATION_REQUIRED：支持当前事务，如果当前没有事务，就新建一个事务。这是最常见的选择。
        方法A调用事务方法B，如果方法A有一个事务，则方法B不会开启新事务，而是加入方法A的事务中执行。否则方法B开启新事务。

        PROPAGATION_SUPPORTS：支持当前事务，如果当前没有事务，就以非事务方式执行。
        方法A调用事务方法B，如果方法A有一个事务，则方法B不会开启新事务，而是加入方法A的事务中执行。否则方法B当作非事务方式执行。

        PROPAGATION_MANDATORY：支持当前事务，如果当前没有事务，就抛出异常。
        方法A调用事务方法B，如果方法A没有一个事务，则方法B不会开启新事务，而是抛出异常。

        PROPAGATION_REQUIRES_NEW：新建事务，如果当前存在事务，把当前事务挂起。
        方法A调用事务方法B，如果方法A有一个事务，则方法A的事务先挂起，方法B开启新事务，方法A的事务等事务B。

        PROPAGATION_NOT_SUPPORTED：以非事务方式执行操作，如果当前存在事务，就把当前事务挂起。
        方法A调用事务方法B，如果方法A有一个事务，则方法A的事务先挂起，方法B以非事务方式执行。

        PROPAGATION_NEVER：以非事务方式执行，如果当前存在事务，则抛出异常。
        PROPAGATION_NESTED：支持当前事务，如果当前事务存在，则执行一个嵌套事务（还不是太明白），如果当前没有事务，就新建一个事务。
    TransactionDefinition中定义的隔离（isolation）级别，有5种：
        1 ISOLATION_DEFAULT 默认的隔离级别
        下面几个都是 JDBC isolation levels 一一对应：
        2 ISOLATION_READ_UNCOMMITTED Connection.TRANSACTION_READ_UNCOMMITTED
        指示防止发生脏读的常量；不可重复读和虚读有可能发生。
        3 ISOLATION_READ_COMMITTED Connection.TRANSACTION_READ_COMMITTED
        指示可以发生脏读 (dirty read)、不可重复读和虚读 (phantom read) 的常量。
        4 ISOLATION_REPEATABLE_READ Connection.TRANSACTION_REPEATABLE_READ
        指示防止发生脏读和不可重复读的常量；虚读有可能发生。
        5 ISOLATION_SERIALIZABLE Connection.TRANSACTION_SERIALIZABLE
        指示防止发生脏读、不可重复读和虚读的常量。
        注：
        脏读 dirty reads：当事务读取还未被提交的数据时，就会发生这种事件。举例来说：Transaction 1 修改了一行数据，然后 Transaction 2 在 Transaction 1 还未提交修改操作之前读取了被修改的行。如果 Transaction 1 回滚了修改操作，那么 Transaction 2 读取的数据就可以看作是从未存在过的。
        不可重复的读 non-repeatable reads：当事务两次读取同一行数据，但每次得到的数据都不一样时，就会发生这种事件。举例来说：Transaction 1 读取一行数据，然后 Transaction 2 修改或删除该行并提交修改操作。当 Transaction 1 试图重新读取该行时，它就会得到不同的数据值（如果该行被更新）或发现该行不再存在（如果该行被删除）。
        虚读 phantom read：如果符合搜索条件的一行数据在后面的读取操作中出现，但该行数据却不属于最初的数据，就会发生这种事件。举例来说：Transaction 1 读取满足某种搜索条件的一些行，然后 Transaction 2 插入了符合 Transaction 1 的搜索条件的一个新行。如果 Transaction 1 重新执行产生原来那些行的查询，就会得到不同的行。
    事务的超时性、回滚和只读
        超时：
        @Transactional(timeout=30) //默认是30秒
        异常回滚：
        指定单一异常类：@Transactional(rollbackFor=RuntimeException.class)
        指定多个异常类：@Transactional(rollbackFor={RuntimeException.class, Exception.class})
        该属性用于设置需要进行回滚的异常类数组，当方法中抛出指定异常数组中的异常时，则进行事务回滚。
        正常的情况下也可以回滚：
        TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
        只读：
        @Transactional(readOnly=true)
        该属性用于设置当前事务是否为只读事务，设置为true表示只读，false则表示可读写，默认值为false。 
     */
    /**
     *
     * @param record
     * @return
     * @throws Exception
     */
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = {RuntimeException.class, Exception.class})
    public int insert(Menu record) throws Exception {
        int retcode = 0;

        return retcode;
    }
}
