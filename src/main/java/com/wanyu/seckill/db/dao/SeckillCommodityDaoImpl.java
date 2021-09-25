package com.wanyu.seckill.db.dao;

import com.wanyu.seckill.db.mappers.SeckillCommodityMapper;
import com.wanyu.seckill.db.po.SeckillCommodity;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class SeckillCommodityDaoImpl implements com.wanyu.seckill.db.dao.SeckillCommodityDao {

    @Resource
    private SeckillCommodityMapper seckillCommodityMapper;

    @Override
    public SeckillCommodity querySeckillCommodityById(long commodityId) {
        return seckillCommodityMapper.selectByPrimaryKey(commodityId);
    }
}
