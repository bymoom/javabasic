package b_operator;

public class ComparisonOperator {

	public static void main(String[] args) {
		/*
		 * << 비교 연산자 >>
		 * - < : 작다
		 * - > : 크다
		 * - <= : 작거나 같다
		 * - >= : 크거나 같다
		 * - == : 같다
		 * - != : 같지 않다
		 */

		boolean b = 10 < 20; //비교연산자의 연산결과는 boolean이다.
		System.out.println(b);
		b = 10 < 20 - 15; //산술연산 후 비교연산을 수행한다.
		System.out.println(b);
		
		b = 10 <= 10.0; //(타입이 같아야 연산 가능, 10을 더블로 형변환해야하는데 생략가능)
		System.out.println(b);
		b = 65 >= 'B';
		System.out.println(b);
		
		b = 10.0f == 10.0; //true
		System.out.println(b);
		b = 10.1f == 10.1; //false (false 7자리, double 15자리까지 정확)
		System.out.println(b);
		System.out.printf("%21.20f%n", 10.1f); //printf 포맷설정
		System.out.printf("%21.20f%n", 10.1);
		//float과 double은 정밀도가 달라 float을 double로 형변환하려면
		//소수점을 정확하게 비교할 수 없다.
		//double을 float으로 형변환해야 정확하게 비교할 수 있다.
		b = 10.1f == (float)10.1;
		System.out.println(b);
		
		
		//대소비교는 boolean을 제외한 기본형 타입만 비교할 수 있지만
		//등가비교는 모든 타입을 비교할 수 있다.
		b = 'A' == 65;
		System.out.println(b);
		b = true != false;
		System.out.println(b);
		
		b = "abc" == "abc"; //같은 스트링 리터럴은 같은 주소를 갖는다.
		System.out.println(b);
		b = "abc" == new String("abc"); //new는 새로운 주소를 생성한다.
		System.out.println(b);
		//참조형 타입은 저장된 메모리 주소를 비교하기 때문에
		//String은 등가비교 연산자로 내용을 비교할 수 없다.
		
		b = "abc".equals(new String("abc"));
		//equals를 사용하면 String의 내용을 비교할 수 있다.
		System.out.println(b);
		b = !"abc".equals("ABC");
		//같지 않다의 결과를 얻기 위해서는 !(NOT)을 앞에 붙여준다.
		
		
	}

}
