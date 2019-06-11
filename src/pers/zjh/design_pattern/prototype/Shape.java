package pers.zjh.design_pattern.prototype;

/**
 * 实现了Cloneable 接口的抽象类
 *
 * @author jinghui.zhu@luckincoffee.com
 * @date 2019/5/29 16:04
 */
public abstract class Shape implements Cloneable {

    private String id;
    protected String type;

    abstract void draw();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public Object clone(){
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return clone;
    }
}
