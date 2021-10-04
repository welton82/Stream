package Application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(3,4,5,7,9);
        System.out.println("<<--------USANDO LIST.STREAM-------------------->>");
        Stream<Integer> st1 = list.stream();
        System.out.println(Arrays.toString(st1.toArray()));
        Stream<Integer> st2 = list.stream().map(p -> p*10);

        System.out.println(Arrays.toString(st2.toArray()));
        System.out.println("<<--------USANDO STREAM OF-------------------->>");

        Stream<String> st3 = Stream.of("Maria", "Naty", "Alex");
        System.out.println(Arrays.toString(st3.toArray()));

        System.out.println("<<--------USANDO FUNÇAO DE ITERAÇÃO-------------------->>");
        //neste caso somará de 2 em 2 até o limite do .limit(?)
        Stream<Integer> st4 = Stream.iterate(2, x ->x+2);

        System.out.println(Arrays.toString(st4.limit(10).toArray()));

        System.out.println("<<--------USANDO SEQUÊNCIA DE FIBONACCI-------------------->>");
        //SEQUENCIA DE FIBONACCI USANDO 'stream'
        Stream<Long> fibo = Stream.iterate(new Long[]{0L, 1L}, p -> new Long[] {p[1], p[0]+p[1]}).map(p ->  p[0]);
        System.out.println(Arrays.toString(fibo.limit(30).toArray()));
    }
}
