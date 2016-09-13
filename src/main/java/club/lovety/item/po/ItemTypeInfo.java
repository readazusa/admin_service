package club.lovety.item.po;

import club.lovety.base.po.BasePO;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;


import java.util.Date;

/**
 * club.lovety.portal.entity
 * Created by smc
 * date on 2016/4/26.
 * Email:sunmch@163.com
 */
public class ItemTypeInfo extends BasePO {

    private String uid;

    private String name;

    private int deep;

    private String sort;  //排序

    private Date createTime;

    private Date updateTime;


    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public int getDeep() {
        return deep;
    }

    public void setDeep(int deep) {
        this.deep = deep;
    }


    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
