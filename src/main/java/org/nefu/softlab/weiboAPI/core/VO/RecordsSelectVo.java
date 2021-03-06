package org.nefu.softlab.weiboAPI.core.VO;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Jiaxu_Zou on 2018-4-19
 *
 * "uname" : "梨花带雨",
 "dateFrom" : "2018-5-10",
 "dateTo" : "2018-10-5",
 "pageNum" : 1,
 "pageSize" : 10
 *
 * 用于查询指定微博记录时作为传入的参数
 */
public class RecordsSelectVo implements Serializable{

    private String uname;

    private String dateFrom;

    private String dateTo;

    private Integer pageNum = 1;    // default value is 1

    private Integer pageSize = 10;  // deault value is 10

    private String uid_1;

    private String uid_2;

    public String getUid_1() {
        return uid_1;
    }

    public void setUid_1(String uid_1) {
        this.uid_1 = uid_1;
    }

    public String getUid_2() {
        return uid_2;
    }

    public void setUid_2(String uid_2) {
        this.uid_2 = uid_2;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(String dateFrom) {
        this.dateFrom = dateFrom;
    }

    public String getDateTo() {
        return dateTo;
    }

    public void setDateTo(String dateTo) {
        this.dateTo = dateTo;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    @Override
    public String toString() {
        return "RecordsSelectVo{" +
                "uname='" + uname + '\'' +
                ", dateFrom='" + dateFrom + '\'' +
                ", dateTo='" + dateTo + '\'' +
                ", pageNum=" + pageNum +
                ", pageSize=" + pageSize +
                '}';
    }
}
