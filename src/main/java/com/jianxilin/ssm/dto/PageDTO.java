package com.jianxilin.ssm.dto;

import java.util.List;

/**
 * @author JianxiLin
 * @date 4.29 - 18:08
 */
public class PageDTO<T> {
    /**
     * 业务数据集合 (对应页码的数据集合)
     */
    private List<T> pageItems;
    /**
     * 页码
     */
    private Integer pageNo;
    /**
     * 总数
     */
    private Integer totalNum;
    /**
     * 每页显示的数量
     */
    private Integer showDataNum;


    @Override
    public String toString() {
        return "PageDTO{" +
                "pageItems=" + pageItems +
                ", pageNo=" + pageNo +
                ", totalNum=" + totalNum +
                ", showDataNum=" + showDataNum +
                '}';
    }

    public List<T> getPageItems() {
        return pageItems;
    }

    public void setPageItems(List<T> pageItems) {
        this.pageItems = pageItems;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    public Integer getShowDataNum() {
        return showDataNum;
    }

    public void setShowDataNum(Integer showDataNum) {
        this.showDataNum = showDataNum;
    }

    public PageDTO(List<T> pageItems, Integer pageNo, Integer totalNum, Integer showDataNum) {
        this.pageItems = pageItems;
        this.pageNo = pageNo;
        this.totalNum = totalNum;
        this.showDataNum = showDataNum;
    }
}
