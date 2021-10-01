package com.wanyu.seckill.db.dao;

import com.wanyu.seckill.db.po.Order;

public interface OrderDao {

    void insertOrder(Order: order);

    Order queryOrder(String OrderNo);

    void updateOrder(Order: order);

}
