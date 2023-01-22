package chap_solving5;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		/* 길이가 5인 String 배열을 선언하고 
		 * "딸기", "바나나", "복숭아", "키위", "사과" 로 초기화를 하고
		 * 스캐너로 0부터 4까지의 정수를 입력 받아
		 * 해당 정수의 인덱스에 있는 과일을 출력하세요
		 * 
		 * 단, 배열의 인덱스 범위를 벗어나는 경우 "준비된 과일이 없습니다." 를 출력하세요
		 * 
		 * -- 입력 예시 --
		 * 0부터 4까지의 정수를 입력하세요 : 2
		 * 
		 * -- 출력 예시 --
		 * 복숭아
		 * 
		 * -- 입력 예시 --
		 * 0부터 4까지의 정수를 입력하세요 : 5
		 * 
		 * -- 출력 예시 --
		 * 준비된 과일이 없습니다.
		 * */
		
		
		String[] fruit = { "딸기", "바나나", "복숭아", "키위", "사과" };
		//문자열형 배열에 과일이름을 직접 넣어서 배열 생성

		Scanner sc = new Scanner(System.in); //입력받을 준비
		int index;
		while (true) { //무한 반복
			System.out.println("0부터 4까지의 정수를 입력하세요. : ");
			index = sc.nextInt();  //0부터 4까지의 정수 입력
	
			if (index >= fruit.length) {  //만약 입력한 정수가 배열의 인덱스 범위를 벗어나면
				System.out.println("준비된 과일이 없습니다.");  // 없다고 출력
			} else {  //아니면
				break;  //while문 종료
			}
		}
		System.out.println(fruit[index]);  // 배열의 index번째 과일 출력

	}

}
