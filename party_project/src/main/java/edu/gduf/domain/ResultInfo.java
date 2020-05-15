package edu.gduf.domain;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * Demo Class
 *
 * @author 古市
 * @date 2020-04-04 22:28
 **/
public class ResultInfo {

    /**
     * 操作的状态码：
     * 成功为1，失败为0，成功但警告为3
     */
    @JSONField(ordinal = 1)
    private Integer status;

    /**
     * 返回的结果集
     */
    @JSONField(ordinal = 2)
    private Object data;

    /**
     * 返回的相关信息
     */
    @JSONField(ordinal = 3)
    private String message;




    public static ResultInfo successInfo(){
        return successInfo(null, null);
    }

    public static ResultInfo successInfo(String message){
        return successInfo(message, null);
    }

    public static ResultInfo successInfo(String message, Object data){
        return new ResultInfo(1, data, message);
    }


    public static ResultInfo failInfo(){
        return failInfo(null, null);
    }

    public static ResultInfo failInfo(String message){
        return failInfo(message, null);
    }

    public static ResultInfo failInfo(String message, Object data){
        return new ResultInfo(0, data, message);
    }

    public static ResultInfo warnInfo(String message){
        return new ResultInfo(2, null, message);
    }


    public ResultInfo(Integer status, Object data, String message) {
        this.status = status;
        this.data = data;
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
