import java.util.Scanner;

public class Day_01_4 {
	
	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("이름을 입력하세요");
//		
//		String name = sc.next();
//		
//		System.out.println("나이를 입력하세요");
//
//		int age = sc.nextInt();
//		
//		
//		System.out.println("이름 : " + name);
//		System.out.println("나이 : " + age);
//		
//		
		
		//국민연금 0.3% / 고용보험 : 0.5% / 의료보험  : 2% / 산재보험 : 1.2%;
		//각 세금의 금액
		//총 세금의 합계액
		//실 수령액
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("희망 연봉을 입력하세요");
		
		int annual = sc.nextInt();
		
		int kukmin = (int) ((annual / 100) * 0.3);
		int goyoung = (int)((annual / 100) * 0.5);
		int hospital = (int)((annual / 100) * 2);
		int sanjae = (int)((annual / 100) * 1.2);
		
		int total = (int) (kukmin + goyoung + hospital + sanjae);
		
		int result = (int) (annual - total);
		
		System.out.println("국민연금 : " + kukmin + "원");
		System.out.println("고용보험 : " + goyoung + "원");
		System.out.println("의료보험 : " + hospital + "원");
		System.out.println("산재보험 : " + sanjae + "원");
		System.out.println("총 세금의 합계액 : " + total + "원");
		System.out.println("실 수령액 : " + result + "원");
		
		
	}

}
