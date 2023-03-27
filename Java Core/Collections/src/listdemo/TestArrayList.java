package listdemo;
import java.util.ArrayList;
import java.util.Iterator;

public class TestArrayList {

	public static void main(String[] args) {
		
		ArrayList flowers = new ArrayList();
		flowers.add(new Integer("1"));
		flowers.add(new java.util.Date());
		flowers.add(new java.util.Scanner(System.in));
		flowers.add(new Double("10.10"));
		flowers.add("tulips");
		flowers.add("rose");
		flowers.add("jasmine");
		flowers.add("lilly");
		flowers.add("cosmos");
		flowers.add(1);
		
		Object obj = flowers.get(3);
		if(obj instanceof Integer) {
			Integer in =(Integer) obj;
			System.out.println(in);
		}
		else if(obj instanceof Double) {
			Double d =(Double) obj;
			System.out.println(d.MAX_VALUE);
		}
		else if(obj instanceof  String) {
			String str = (String) obj;
			System.out.println(str.toUpperCase());
			
		}
		
//		Double str =(Double) flowers.get(3);
//		System.out.println(str);
		
//		System.out.println(flowers);
//		System.out.println(flowers.size());
//		System.out.println(flowers.get(2));
//		System.out.println(flowers.contains("Lilly"));
//		flowers.remove(1);
//		flowers.add(1,"sunflower");
//		
		
//		for(Object obj : flowers) {
//			System.out.println(obj);
//			
//			Iterator iter = flowers.iterator();
//			
//			while(iter.hasNext()) {
//				System.out.println(iter.next());
//			}
//			for (int i =0;i<flowers.size();i++) {
//				System.out.println(flowers.get(i));
//			}
//		}
		

	}

}
