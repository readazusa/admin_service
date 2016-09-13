package club.lovety.item.dao.impl;


import club.lovety.base.po.BaseSearchPO;
import club.lovety.item.dao.IItemDao;
import club.lovety.item.po.ItemInfo;
import club.lovety.item.po.ItemVsFilePO;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * net.sunmingchun.www.item.dao.impl
 * Created by smc
 * date on 2016/4/27.
 * Email:sunmch@163.com
 */
@Repository
public class ItemDaoImpl extends SqlSessionDaoSupport  implements IItemDao {


    @Autowired
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    @Override
    public void save(ItemInfo obj) {
        this.getSqlSession().insert("ItemInfo.save",obj);
    }

    @Override
    public void deleteById(String uid) {
        this.getSqlSession().delete("ItemInfo.delete",uid);
    }

    @Override
    public void deleteById(int uid) {

    }
    @Override
    public void update(ItemInfo itemInfo) {
        this.getSqlSession().update("ItemInfo.update",itemInfo);
    }
    @Override
    public ItemInfo queryObjectById(String id) {
        return this.getSqlSession().selectOne("ItemInfo.select",id);
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
    public int queryTotalCount(ItemInfo itemInfo) {
        return this.getSqlSession().selectOne("ItemInfo.queryTotalCount",itemInfo);
    }

    @Override
    public List<ItemInfo> queryPage(BaseSearchPO<ItemInfo> baseSearchPO) {
        return this.getSqlSession().selectList("ItemInfo.queryPage",baseSearchPO);
    }

    @Override
    public int queryTotalCount(BaseSearchPO<ItemInfo> baseSearchPO) {
        return this.getSqlSession().selectOne("ItemInfo.queryPageTotalCount",baseSearchPO);
    }

    @Override
    public int saveItemVsFile(ItemVsFilePO itemVsFilePO) {
        return this.getSqlSession().insert("ItemVsFilePO.save",itemVsFilePO);
    }



    @Override
    public int deleteItemVsFileByItemId(String itemId) {
        return this.getSqlSession().delete("ItemInfo.deleteItemVsFileByItemId",itemId);
    }
}
