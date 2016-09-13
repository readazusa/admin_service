package club.lovety.item.dao;


import club.lovety.base.dao.IDao;
import club.lovety.item.po.ItemInfo;
import club.lovety.item.po.ItemVsFilePO;

/**
 * net.sunmingchun.www.item.dao
 * Created by smc
 * date on 2016/4/27.
 * Email:sunmch@163.com
 */
public interface IItemDao extends IDao<ItemInfo> {

    public int saveItemVsFile(ItemVsFilePO itemVsFilePO);

    public int deleteItemVsFileByItemId(String itemId);
}
