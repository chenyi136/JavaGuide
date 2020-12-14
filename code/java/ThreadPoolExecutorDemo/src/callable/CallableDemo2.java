package callable;

import java.util.concurrent.Callable;

public class CallableDemo2 implements Callable {

    @Override
    public Object call() throws Exception {
        return "ok-1";
    }
}
