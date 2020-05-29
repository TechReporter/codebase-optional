/**
 * 
 */
package concurrency;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Supplier;

/**
 * @author 212720190
 * @date Apr 8, 2019
 */
public class CompletableFutureWithSupplier {

	public static void main(String[] args) {


		ExecutorService executor = Executors.newSingleThreadExecutor();
		Supplier<String> supplyTask = CompletableFutureWithSupplier::getTask;
		CompletableFuture<String> comfuture = CompletableFuture.supplyAsync(supplyTask, executor);
		String str = comfuture.join();
		System.out.println(str);
		executor.shutdown();
	}

	private static String getTask() {
		return "Tanmoy dasgupta "+Thread.currentThread().getName();
	}
}
