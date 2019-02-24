package cn.itsource.aigou.util;

public class AjaxResult {
    private Boolean success = true;
    private String msg = "操作成功";
    private Object object;
    //设置set方法，则不需要下边的构造方法
    /*public AjaxResult(String msg) {
        this.success = false;
        this.msg = "操作失败";
    }
    public AjaxResult() {
    }*/

    /**
     *  获得市里的方法
     * @return
     */
    public static AjaxResult getInstance(){
        return new AjaxResult();
    }

    public Boolean getSuccess() {
        return success;
    }

    public AjaxResult setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public AjaxResult setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public Object getObject() {
        return object;
    }

    public Object setObject(Object object) {
        this.object = object;
        return this;
    }
}
