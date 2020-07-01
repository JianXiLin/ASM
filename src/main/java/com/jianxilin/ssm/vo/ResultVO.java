package com.jianxilin.ssm.vo;


import com.jianxilin.ssm.enums.errorCode;

public class ResultVO {
    /**
     * 是否成功
     */
    private boolean isSuccess;
    /**
     * 错误码
     */
    private String code;
    /**
     * 错误信息
     */
    private String msg;
    /**
     * 给前端的返回值
     */
    private Object data;

    public static ResultVO success(){
        ResultVO resultVO = new ResultVO();
        resultVO.setSuccess(true);
        return resultVO;
    }
    public static ResultVO success(Object data){
        ResultVO resultVO = new ResultVO();
        resultVO.setSuccess(true);
        resultVO.setData(data);
        return resultVO;
    }
    public static ResultVO fail(errorCode errorCode){
        ResultVO resultVO = new ResultVO();
        resultVO.setSuccess(false);
        resultVO.setCode(errorCode.getCode());
        resultVO.setMsg(errorCode.getMessage());
        return resultVO;
    }
    public static ResultVO fail(errorCode errorCode, Object data){
        ResultVO resultVO = new ResultVO();
        resultVO.setSuccess(false);
        resultVO.setData(data);
        resultVO.setCode(errorCode.getCode());
        resultVO.setMsg(errorCode.getMessage());
        return resultVO;
    }



    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResultVO{" +
                "isSuccess=" + isSuccess +
                ", code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
