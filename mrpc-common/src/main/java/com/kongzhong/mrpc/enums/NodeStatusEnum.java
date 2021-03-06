package com.kongzhong.mrpc.enums;

/**
 * 服务节点存活状态
 *
 * @author biezhi
 * 29/06/2017
 */
public enum NodeStatusEnum {

    ONLINE("存活"),
    OFFLINE("离线"),
    CONNECTING("连接中");

    private final String state;

    NodeStatusEnum(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
