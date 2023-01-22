package chap_solving5;

public class test1 {

	public static void main(String[] args) {
		/* 길이가 10인 정수형 배열을 선언 및 할당한 뒤
		 * 각 인덱스에 차례대로 1부터 10까지 값을 넣고 출력하세요
		 * */
		
		int[] arr = new int[10];  //크기가 10인 정수형 배열 선언 및 할당
		int value = 0;  //배열에 넣어줄 값
		
		for (int i = 0; i < arr.length; i++){
		//배열의 인덱스 i번이 0부터 배열의 길이보다 작을 때까지
			arr[i] = ++value; //배열의 i번째에 값을 1증가시킨 후 대입
		}

		for (int i : arr){  //i가 배열 값을 순차적으로 불러와 
			System.out.print(i + " ");  //출력
		}

	}

}
