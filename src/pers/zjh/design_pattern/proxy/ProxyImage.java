package pers.zjh.design_pattern.proxy;

/**
 * ${todo}
 *
 * @author jinghui.zhu@luckincoffee.com
 * @date 2019/5/27 18:37
 */
public class ProxyImage implements Image {

    private RealImage realImage;
    private String fileName;

    @Override
    public void display() {
        if (realImage == null){
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }
}
