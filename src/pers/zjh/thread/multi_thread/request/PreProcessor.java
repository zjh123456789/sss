package pers.zjh.thread.multi_thread.request;

import java.util.concurrent.LinkedBlockingQueue;

/**
 * {todo}
 *
 * @author 朱景辉
 * @createTime 2021/4/12 8:06
 */
public class PreProcessor extends Thread implements IRequestProcessor {

    // 阻塞队列
    LinkedBlockingQueue<Request> requests = new LinkedBlockingQueue<>();

    private IRequestProcessor nextProcessor;

    private volatile boolean isFinish = false;

    public PreProcessor(IRequestProcessor nextProcessor) {
        this.nextProcessor = nextProcessor;
    }

    @Override
    public void run() {
        while (!isFinish) {
            try {
                Request request = requests.take();// 阻塞式获取数据
                System.out.println("preProcessor: " + request);
                nextProcessor.process(request);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void shutdown() {
        isFinish = true;
    }

    @Override
    public void process(Request request) {
        requests.add(request);
    }
}
