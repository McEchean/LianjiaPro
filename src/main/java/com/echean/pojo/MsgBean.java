package com.echean.pojo;

import java.util.HashMap;

public class MsgBean {
    private int status;
    private String msg;
    private HashMap<String, Object> extend = new HashMap();
    public static MsgBean success(){
        MsgBean msgBean = new MsgBean();
        msgBean.setStatus(200);
        msgBean.setMsg("true");
        return msgBean;
    }

    public static MsgBean faild(){
        MsgBean msgBean = new MsgBean();
        msgBean.setStatus(100);
        msgBean.setMsg("false");
        return msgBean;
    }

    public MsgBean add(String key,Object value) {
        this.getExtend().put(key,value);
        return this;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public HashMap<String, Object> getExtend() {
        return extend;
    }

    public void setExtend(HashMap<String, Object> extend) {
        this.extend = extend;
    }
}
