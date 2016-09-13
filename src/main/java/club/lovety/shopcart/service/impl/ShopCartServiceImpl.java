package club.lovety.shopcart.service.impl;

import club.lovety.shopcart.dao.IShopCartDao;
import club.lovety.shopcart.po.ShopCartInfo;
import club.lovety.shopcart.service.IShopCartService;
import com.alibaba.fastjson.JSONObject;

import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import javax.annotation.Resource;
import java.util.Date;

/**
 * Created by 念梓  on 2016/8/25.
 * Email:sunmch@163.com
 * TEL:13913534135
 * author: 念梓
 * des:
 */
@Service
public class ShopCartServiceImpl implements IShopCartService {

    @Resource
    private IShopCartDao shopCartDao;

    @Resource
    private IItemDao itemDao;

    @Override
    public ShopCartInfo queryObjectById(String id) {
        return null;
    }

    @Override
    public ShopCartInfo queryObjectById(int id) {
        return null;
    }

    @Override
    public List<ShopCartInfo> queryList() {
        return null;
    }

    @Override
    public void save(ShopCartInfo obj) {
        Assert.notNull(obj,"保存的购物车不能为null");
        obj.setId(UuidUtils.getUpperUuid());
        obj.setCreateTime(new Date());
        obj.setUpdateTime(new Date());
        shopCartDao.save(obj);
    }

    @Override
    public void deleteById(String uid) {

    }

    @Override
    public void deleteById(int uid) {

    }

    @Override
    public void update(ShopCartInfo shopCartInfo) {

    }

    @Override
    public int getTotalCount(ShopCartInfo shopCartInfo) {
        return 0;
    }

    @Override
    public BasePagePO<ShopCartInfo> getBasePagePO(int pageIndex, int pageSize, ShopCartInfo shopCartInfo) {
        return null;
    }

    @Override
    public List<ShopCartInfo> queryListPO(int pageIndex, int pageSize, ShopCartInfo shopCartInfo) {
        return null;
    }

    @Override
    public void receiveMqShopCart(String shopCartJson) {
        ShopCartInfo shopCartInfo = JSONObject.parseObject(shopCartJson,ShopCartInfo.class);
        ShopCartInfo shopCartInfoDb = shopCartDao.queryShopCartByItemId(shopCartInfo);
        //如果购车中已经包含改商品，则进行数据的增加，如果不存在插入购物车表
        if(null == shopCartInfoDb){
            ItemInfo itemInfo = itemDao.queryObjectById(shopCartInfo.getItemId());
            shopCartInfo.setTitle(itemInfo.getTitle());
            shopCartInfo.setPicUrl(itemInfo.getPhonePicUrl());
            shopCartInfo.setNum(1);
            shopCartInfo.setPrice(itemInfo.getPrice());
            this.save(shopCartInfo);
        }else{
            shopCartDao.addShopCartNumByItemId(shopCartInfo);
        }
    }
}
