package pers.zjh.thread.multi_thread.request;

/**
 * {todo}
 *
 * @author 朱景辉
 * @createTime 2021/4/12 8:12
 */
public class App {

    static IRequestProcessor requestProcessor;

    public void setUp() {
        PrintProcessor printProcessor = new PrintProcessor();
        printProcessor.start();
        SaveProcessor saveProcessor = new SaveProcessor(printProcessor);
        saveProcessor.start();
        requestProcessor = new PreProcessor(saveProcessor);
        ((PreProcessor)requestProcessor).start();
    }

    public static void main(String[] args) {
        App app = new App();
        app.setUp();
        Request request = new Request();
        request.setName("蓝月亮");
        requestProcessor.process(request);
    }
}
