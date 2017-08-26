/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bamboo.module.db.sequence.dao;

import org.apache.ibatis.annotations.Param;

/**
 *
 * @author luotao
 */
public interface SequenceDao {

    public String generateSequenceNo(@Param("sequenceName") String sequenceName);

    public String generateSomeSequenceNo(@Param("sequenceName") String sequenceName, @Param("seqCount") int seqCount);
}
