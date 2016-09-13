package club.lovety.item.service.impl;


import club.lovety.base.po.BasePagePO;
import club.lovety.base.po.BaseSearchPO;
import club.lovety.item.dao.IItemDao;
import club.lovety.item.po.ItemInfo;
import club.lovety.item.service.IItemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * net.sunmingchun.www.item.service.impl
 * Created by smc
 * date on 2016/4/27.
 * Email:sunmch@163.com
 */
@Service
public class ItemServiceImpl implements IItemService {

    private static final Logger log = LoggerFactory.getLogger(ItemServiceImpl.class);

    @Resource
    private IItemDao itemDao;

    @Override
    public ItemInfo queryObjectById(String id) {
        return itemDao.queryObjectById(id);
    }

    @Override
    public ItemInfo queryObjectById(int id) {
        return null;
    }

    @Override
    public List<ItemInfo> queryList() {
        return null;
    }

    @Override
    @Transactional
    public void save(ItemInfo obj) {

    }

    @Override
    public void deleteById(String uid) {
        itemDao.deleteById(uid);
    }

    @Override
    public void deleteById(int uid) {

    }

    @Override
    public void update(ItemInfo itemInfo) {
        String fileIds = itemInfo.getFileIds();
        itemDao.update(itemInfo);
        itemDao.deleteItemVsFileByItemId(itemInfo.getUid());

    }

    @Override
    public int getTotalCount(ItemInfo itemInfo) {
        return itemDao.queryTotalCount(itemInfo);
    }

    @Override
    public BasePagePO<ItemInfo> getBasePagePO(int pageIndex, int pageSize, ItemInfo itemInfo) {
        BasePagePO<ItemInfo> basePagePO = new BasePagePO<>();
        int total = itemDao.queryTotalCount(itemInfo);
        BaseSearchPO<ItemInfo> baseSearchPO = new BaseSearchPO<>();
        baseSearchPO.setObj(itemInfo);
        baseSearchPO.setPageIndex((pageIndex-1)*pageSize);
        baseSearchPO.setPageSize(pageSize);
        List<ItemInfo> itemInfoList = itemDao.queryPage(baseSearchPO);
        basePagePO.setPageSize(pageSize);
        basePagePO.setCurrentPage(pageIndex);
        basePagePO.setData(itemInfoList);
        basePagePO.setRecordsTotal(total);
        int totalPage = basePagePO.getTotalPage();
        log.debug("totalpage:{}",totalPage);
        return basePagePO;
    }

    @Override
    public List<ItemInfo> queryListPO(int pageIndex, int pageSize, ItemInfo itemInfo) {



        return null;
    }


    @Override
    public BasePagePO<ItemInfo> getBasePagePO(int pageIndex, int pageSize, String searchValue, String orderColumn, String orderValue, int draw) {
        ItemInfo itemInfo = new ItemInfo();
        itemInfo.setSearch(searchValue);
        BaseSearchPO<ItemInfo> baseSearchPO = new BaseSearchPO<>();
        baseSearchPO.setObj(itemInfo);
        baseSearchPO.setPageSize(pageSize);
        baseSearchPO.setPageIndex(pageIndex);
        baseSearchPO.setOrderName(orderColumn);
        baseSearchPO.setOrderValue(orderValue);
        /*
         *上面是构造查询条件
         *
         * 下面是返回查询结构
         */
        List<ItemInfo> itemInfos = itemDao.queryPage(baseSearchPO);
        int totalCount = this.getTotalCount(itemInfo);
        BasePagePO<ItemInfo> basePagePO = new BasePagePO<>();
        basePagePO.setData(itemInfos);
        basePagePO.setDraw(draw);
        basePagePO.setRecordsTotal(totalCount);
        basePagePO.setRecordsFiltered(totalCount);
        return basePagePO;
    }


}
