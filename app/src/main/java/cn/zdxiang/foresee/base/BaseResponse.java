package cn.zdxiang.foresee.base;

//{
//        "validateMessagesShowId": "_validatorMessage",
//        "status": true,
//        "httpstatus": 200,
//        "data": {
//        "otherMsg": "",
//        "loginCheck": "Y"
//        },
//        "messages": [],
//        "validateMessages": {}
//        }

import java.util.List;

/**
 * @author jm
 * @date 16-12-6.下午3:03
 * @description 12306的实体基类
 */

public class BaseResponse<T> {

    private String validateMessagesShowId;

    private boolean status;

    private int httpstatus;

    private T data;


    private List<String> messages;

    /**
     * 当status为false的时候，会返回。目前发现的一般是12306的查票API修改了地址。
     * {
     * "status": false,
     * "c_url": "leftTicket/queryZ",
     * "c_name": "CLeftTicketUrl"
     * }
     */
    private String c_url;


    /**
     * 当status为false的时候，会返回。目前发现的一般是12306的查票API修改了地址。
     * {
     * "status": false,
     * "c_url": "leftTicket/queryZ",
     * "c_name": "CLeftTicketUrl"
     * }
     */
    private String c_name;
//
//    private String validateMessages;


    public String getValidateMessagesShowId() {
        return validateMessagesShowId;
    }

    public void setValidateMessagesShowId(String validateMessagesShowId) {
        this.validateMessagesShowId = validateMessagesShowId;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getHttpstatus() {
        return httpstatus;
    }

    public void setHttpstatus(int httpstatus) {
        this.httpstatus = httpstatus;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public List<String> getMessages() {
        return messages;
    }

    /**
     * 获取返回的消息
     *
     * @return the first message
     */
    public String getMessage() {
        if (messages != null && messages.size() > 0) {
            return messages.get(0);
        } else {
            return "";
        }
    }

    public void setMessages(List<String> messages) {
        this.messages = messages;
    }

    public String getC_url() {
        return c_url;
    }

    public void setC_url(String c_url) {
        this.c_url = c_url;
    }

    public String getC_name() {
        return c_name;
    }

    public void setC_name(String c_name) {
        this.c_name = c_name;
    }

    /**
     * judge the response is ok
     *
     * @param response the entity extends BaseResponse
     * @return boolean
     */
    public static boolean judgeResponse(BaseResponse response) {
//        Log.d("judgeResponse", "response.getData()1===>" + (response.getData() == null));
//        Log.d("judgeResponse", "response.getData()2===>" + (response.getData().toString().equals("")));
//        Log.d("judgeResponse", "response.getData()3===>" + response.getData().toString());
        return response != null && response.isStatus() && response.getData() != null;
    }

}

