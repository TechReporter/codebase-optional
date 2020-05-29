/**
 * 
 */
package concurrency;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

/**
 * @author 212720190
 * @date Nov 3, 2019
 */
public class ChainingTask {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService executor = Executors.newSingleThreadExecutor();
		ExecutorService executor1 = Executors.newFixedThreadPool(10);

		//thenApplyAsync for different thread inside same thread pool.
		CompletableFuture.supplyAsync(ChainingTask::idList)
		.thenApplyAsync(ChainingTask::matchUser)
		.thenAcceptAsync(ee->ee.forEach(System.out::println), executor);

		Thread.sleep(1000);



		/*----------another way -----------*/

		Function<List<Integer>, CompletableFuture<List<User>>> userData = 
				ids -> {
					List<User> users = allUser();
					Supplier<List<User>> userDetails = ()-> {
						System.out.println("userDetails :: "+Thread.currentThread().getName());
						return users.stream()
								.filter(ee->ids.contains(ee.getId()))
								.collect(Collectors.toList());	
					};	
					return CompletableFuture.supplyAsync(userDetails, executor1);
				};

				Consumer<List<User>> logUser = user -> {
					System.out.println("logUser :: "+Thread.currentThread().getName());
					user.forEach(System.out::println);
				};

				CompletableFuture<List<Integer>> idListsFuture = CompletableFuture
						.supplyAsync(ChainingTask::idList);
				idListsFuture.thenComposeAsync(userData, executor)
				.thenAcceptAsync(logUser,executor);

				Thread.sleep(1000);
				executor.shutdown();
				executor1.shutdown();

				/*----------another way -----------*/



	}

	private static List<Integer> idList() {
		return Arrays.asList(1,2,3,6);
	}

	private static List<User> allUser() {
		return Arrays.asList(new User(1, "tanmoy"),
				new User(2, "mani"),new User(3, "raghab"),
				new User(4, "sanjoy"),
				new User(6, "subho"));
	}

	private static List<User> matchUser(List<Integer> ids) {
		List<User> users = allUser();
		System.out.println(Thread.currentThread().getName());
		return users.stream()
				.filter(ee->ids.contains(ee.getId()))
				.collect(Collectors.toList());
	}
}
