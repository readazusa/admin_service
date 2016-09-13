package club.lovety.item.service;


import club.lovety.base.po.BasePagePO;
import club.lovety.base.service.IService;
import club.lovety.item.po.ItemInfo;

/**
 * net.sunmingchun.www.item.service
 * Created by smc
 * date on 2016/4/27.
 * Email:sunmch@163.com
 */
public interface IItemService extends IService<ItemInfo> {



    public BasePagePO<ItemInfo> getBasePagePO(int pageIndex, int pageSize, String searchValue, String orderColumn, String orderValue, int draw);






}
