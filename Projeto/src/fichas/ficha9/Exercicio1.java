package fichas.ficha9;

	import java.util.HashMap;
	import java.util.Map;

public class Exercicio1
{
    public static void main(String[] args)
    {
		Map<Integer, Integer> map = new HashMap<>();

		map.put(1, 11);
		map.put(2, 22);
		map.put(3, 33);
		map.put(4, 44);

		System.out.println("Valores: " + map.values());
    }
}