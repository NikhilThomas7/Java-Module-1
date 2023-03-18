package javaenums;

public class TestEnum {
	public static void main(String[] args) {
		DayOfWeek today = DayOfWeek.SATURDAY;
		System.out.println("today is" + today.getName());
		
		System.out.println("SELECT WHAT SHOULD YOU DO IN EACH DAY");
		
		switch (today) {
		
		case MONDAY:{
			System.out.println("work hard");
			break;
		}
		case TUESDAY:{
			System.out.println("work some more");
			break;
		}
		case WEDNESDAY:{
			System.out.println("work some SOME more");
			break;
		}
		case THURSDAY:{
			System.out.println("work some SOME SOME more");
			break;
		}
		case FRIDAY:{
			System.out.println("work some SOME SOME SOME more");
			break;
		}
		case SATURDAY:{
			System.out.println("work some SOME SOME SOME SOME more");
			break;
		}
		case SUNDAY:{
			System.out.println("work some SOME SOME SOME SOME SOME more");
			break;
		}
		
		}
	}

}
