package com.jianxilin.ssm.enums;

/**
 * 员工
 * @author JianxiLin
 *
 */
public enum ComployeeStateEnum {
    /**
     *
     */
    SUCCESS(1, "成功"),
    END(0, "结束");
    /**
     * 状态码
     */
    private int state;
    /**
     * 状态消息
     */
    private String stateInfo;

    private ComployeeStateEnum(int state, String stateInfo) {
        this.state = state;
        this.stateInfo = stateInfo;
    }

    public int getState() {
        return state;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public static ComployeeStateEnum stateOf(int index) {
        for (ComployeeStateEnum state : values()) {
            if (state.getState() == index) {
                return state;
            }
        }
        return null;
    }

}
