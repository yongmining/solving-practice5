package chap4_solving;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		/* 어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서
		 * 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다.
		 * 
		 * A를 3만큼 밀면 D가 되고, z를 1만큼 밀면 a가 됩니다.
		 * 또한 공백문자는 변경되지 않습니다.
		 * 
		 * 문자열 1개를 입력 받고, 얼마나 문자를 밀지 알려주는 0보다 큰 정수를 1개 입력 받아
		 * 암호문을 작성하는 프로그램을 만들어보세요
		 * 단, 숫자가 27인 경우는 1칸을 밀게 됩니다. (알파벳은 26글자 이기 때문)
		 * 
		 * -- 입력 예시 --
		 * 문자열을 입력하세요 : a B z
		 * 숫자를 입력하세요 : 4
		 * 
		 * -- 출력 예시 --
		 * e F d
		 * 
		 * -- 입력 예시 --
		 * 문자열을 입력하세요 : a B z
		 * 숫자를 입력하세요 : 27
		 * 
		 * -- 출력 예시 --
		 * b C a
		 * */

		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력하세요 : ");
		String str = sc.nextLine();

		System.out.println("숫자를 입력하세요 : ");
		int num = sc.nextInt() % 26;

		String str2 = "";

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				str2 += " ";
			} else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				str2 += (char) (((str.charAt(i) + num) - 'A') % 26 + 'A');

			} else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				str2 += (char) (((str.charAt(i) + num) - 'a') % 26 + 'a');

			}
		}
		System.out.println(str2);

	}

}
