package methodref;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

interface Formula{
	public void m1();
	
}

class Some{
	public static void m2() {
		System.out.println("from m2");
	}
}

class Other{
	Other() {
		System.out.println("from other cons");
	}
	void m2() {
		System.out.println("from other m2");
	}
	
}

public class TestMethodRefs {
	
	public static void main(String[] args) {
		
		Formula f = Some ::m2;
		f.m1();
		
		f = Other ::new;
		
		List <String> list = Arrays.asList("one","two","three");
		list.stream().forEach(System.out::println);
		List<Integer> intList = Arrays.asList(12,34,56,78);
		Optional <Integer> num = intList.stream().reduce(Math::max);
		System.out.println(num.get());
//		Other o = new Other();
//		
//		Consumer<String> c = Other ::m2;
		
//		Some s = Other ::m2;
		
		
		
		
	}

}
