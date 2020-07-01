package com.jianxilin.ssm.enums;

public enum errorCode {

    /**
     *  请求中的参数错误
     */
    PARAM_ERROR("1001","参数不正确"),
    /**
     * 分页页码错误
     */
    OUTOFPAGESIZE_ERROR("1002","页码超出最大页码数"),
    /**
     *  员工不存在
     */
    COMPLOYEENOTEXIT_ERROR("2001","该员工信息不存在"),
    /**
     *  新增的员工已经存在
     */
    COMPLOYEEOFINSERTISEXIT_ERROR("2002","该新增员工已经存在"),

    /**
     *  资产不存在
     */
    ASSETNOTEXIT_ERROR("3001","该资产信息不存在"),
    /**
     *  新增的资产信息已经存在
     */
    ASSETOFINSERTISEXIT_ERROR("3002","该新增资产已经存在"),
    /**
     *  无匹配的内容
     */
    NOMATCHINGCONTENT_ERROR("3003","无匹配的内容"),
    /**
     *  该资产借出记录不存在
     */
    CIRCULATENOTEXIT_ERROR("4001","该资产借出记录不存在"),
    /**
     *  该资产借出记录已经存在
     */
    CIRCULATEISEXIT_ERROR("4002","该资产借出记录已存在");


    private String code;
    private String message;

    errorCode(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
