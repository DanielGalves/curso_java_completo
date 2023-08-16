package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

	public static void main(String[] args) {
		
		Consumer<String> print = System.out::print;
		Consumer<Integer> println = System.out::println;
		
		Stream<String> linguagens = Stream.of("Java " , "Lua ", "JA\n");
		linguagens.forEach(print);
		
		String[] maisLinguagens = {"Pyton ", "Lisp ", "Perl ", "Go\n"};
		
		Stream.of(maisLinguagens).forEach(print);
		Arrays.stream(maisLinguagens).forEach(print);
		Arrays.stream(maisLinguagens, 1, 3).forEach(print);
		
		List<String> outrasLinguagens = Arrays.asList("C ", "PHP ", "Kotlin\n");
		outrasLinguagens.stream().forEach(print);
		outrasLinguagens.parallelStream().forEach(print);	
		
		//Stream.generate(() -> "a").forEach(print);
		Stream.iterate(0, n -> n + 1).forEach(println);
	}
	
}
