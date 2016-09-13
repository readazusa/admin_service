package club.lovety.shopcart.service;


import club.lovety.base.service.IService;
import club.lovety.shopcart.po.ShopCartInfo;

/**
 * Created by 念梓  on 2016/8/25.
 * Email:sunmch@163.com
 * TEL:13913534135
 * author: 念梓
 * des:
 */
public interface IShopCartService extends IService<ShopCartInfo> {

    public void receiveMqShopCart(String shopCartJson);


}
