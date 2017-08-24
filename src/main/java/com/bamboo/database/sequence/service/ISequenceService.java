/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bamboo.database.sequence.service;

import java.util.List;

/**
 *
 * @author luotao
 */
public interface ISequenceService {

    /**
     * 取一个序列号
     *
     * @param seqName
     * @return
     */
    public String getSequenceNo(String seqName);

    /**
     * 取一个带有时间前缀的序列号
     *
     * @param seqName
     * @return
     */
    public String getSequenceNoWithTime(String seqName);

    /**
     * 一次取若干个序列号
     *
     * @param seqName 序列名称
     * @param seqCount 序列号个数
     * @param isPrefixTime 是否附加时间前缀
     * @return
     */
    public List<String> getSomeSequenceNo(String seqName, int seqCount, boolean isPrefixTime);

}
