package hospital_emmergency_nofif_system;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        //FixedThread Pool
        ExecutorService executor = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 20; i++) {
            executor.execute(() -> {
                System.out.println("Fixed: Sending alert " +  Thread.currentThread().getName() );

            });
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        executor.shutdown();

        //cacheThreadPool
        ExecutorService executor2 = Executors.newCachedThreadPool();
        for (int i = 0; i < 20; i++) {
            executor2.execute(() -> {
                System.out.println("Cached: Sending alert "  +  Thread.currentThread().getName() );
            });
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
