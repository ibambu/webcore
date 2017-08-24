/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bamboo.database.sequence.service.impl;

import com.bamboo.database.sequence.dao.SequenceDao;
import com.bamboo.database.sequence.service.ISequenceService;
import com.bamboo.util.DateUtils;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Resource;

/**
 *
 * @author luotao
 */
public class SequenceService implements ISequenceService {

    @Resource
    private SequenceDao sequenceDao;

    /**
     * 取一个序列号
     *
     * @param seqName
     * @return
     */
    @Override
    public String getSequence(String seqName) {
        return sequenceDao.generateSequenceNo(seqName);
    }

    /**
     * 一次取若干个序列号
     *
     * @param seqName 序列名称
     * @param seqCount 序列号个数
     * @param isPrefixTime 是否附加时间前缀
     * @return
     */
    @Override
    public List<String> getSomeSequence(String seqName, int seqCount, boolean isPrefixTime) {
        int currentSeq = Integer.parseInt(sequenceDao.generateSomeSequenceNo(seqName, seqCount));
        List<String> seqlist = new ArrayList();

        for (int i = 0; i < seqCount; i++) {
            String seq = isPrefixTime ? DateUtils.getDateTime() + (String.valueOf(currentSeq--)) : String.valueOf(currentSeq--);
            seqlist.add(seq);
        }
        return seqlist;
    }

    /**
     * 取一个带有时间前缀的序列号
     *
     * @param seqName
     * @return
     */
    @Override
    public String getSequenceWithTime(String seqName) {
        return DateUtils.getDateTime() + sequenceDao.generateSequenceNo(seqName);
    }

}
