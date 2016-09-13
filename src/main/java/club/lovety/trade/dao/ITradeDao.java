package club.lovety.trade.dao;


import club.lovety.base.dao.IDao;
import club.lovety.trade.po.OrderInfo;
import club.lovety.trade.po.TradeInfo;

import java.util.List;

/**
 * Created by 念梓  on 2016/8/17.
 * Email:sunmch@163.com
 * TEL:13913534135
 * author: 念梓
 * des:
 */
public interface ITradeDao extends IDao<TradeInfo> {

    public List<OrderInfo> queryOrderListByTradeId(String tradeId);

    public int updateOrder(OrderInfo orderInfo);
}
