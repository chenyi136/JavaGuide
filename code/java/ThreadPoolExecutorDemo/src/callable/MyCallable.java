package callable;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {

    @Override
    public String call() throws Exception {
        Thread.sleep(1000);
        //返回执行当前 Callable 的线程名字
        System.out.println(Thread.getAllStackTraces());
        return Thread.currentThread().getName();
    }
}
