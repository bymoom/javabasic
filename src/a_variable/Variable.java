package a_variable;

public class Variable {

	public static void main(String[] args) {
		/*
		 * << 변수 >>
		 * - 하나의 데이터를 저장할 수 있는 메모리상의 공간
		 * 
		 * << 사용 가능한 기본형 데이터의 종류 >>
		 * - 정수 : byte, short, int, long (네가지가 표현할 수 있는 숫자 크기가 다름)
		 * - 실수 : float, double (둘다 큰 숫자를 표현할 수 있으나 정확도가 다름-double이 더 정확)
		 * - 문자 : char (한가지 문자만 표현 가능)
		 * - 논리 : boolean (참과 거짓)
		 * 
		 * - byte는 8개의 bit로 이루어져 있다.
		 * - 데이터를 사용하기 위해서는 어떤 종류의 데이터를 사용할 것인지,
		 * 	  그것의 이름이 무엇인지 알려줘야 한다.
		 * - 명명규칙은 자바의 정석 25~26쪽 참조
		 */
		
		//변수 선언 방법 : 데이터 타입 + 변수 이름
		byte abc;
		char moonja;
		
		//모든 기본형 타입을 사용해서 8개의 변수를 선언해주세요.
		byte _byte;
		short _short;
		int _int;
		long _long;
		float _float;
		double _double;
		char _char;
		boolean _boolean;
		
		//선언한 이후 변수를 사용할 때는 변수의 이름으로 사용한다.
//		System.out.println(_byte);
		//변수에 값을 저장하지 않으면 변수의 값을 참조할 수 없다.
		
		//=(대입 연산자) : 대입 연산자 오른쪽의 값을 왼쪽(변수)에 저장한다.
		_byte = 127; //타입에 맞는 값을 저장해야 한다.
		_short = 30000;
		_int = 20;
		_long = 900L; //long 접미사 : L
		_float = 3.14f; //float 접미사 : f
		_double = 3.14; //double 접미사 : d(생략가능)
		_char = '가'; //하나의 문자만 표현 가능
		_boolean = true;
		//초기화 : 변수에 처음으로 값을 저장하는 것.
		
		System.out.println(_int);
		//ctrl + F11 : 프로그램 실행
		//F11 : 디버그 모드(내가 원하는 위치에서 한줄한줄)로 실행
		
		_int = 30;
		System.out.println(_int);
		_int = 30 + 40;
		System.out.println(_int);
		_int = _short;
		
		//위에서 초기화한 변수에 새로운 값을 저장하고 출력해주세요.
		_byte = 10;
		System.out.println(_byte);
		_short = 20;
		System.out.println(_short);
		_int = 30;
		System.out.println(_int);
		_long = 40L;
		System.out.println(_long);
		_float = 3.14f;
		System.out.println(_float);
		_double = 3.14;
		System.out.println(_double);
		_char = '나';
		System.out.println(_char);
		_boolean = false;
		System.out.println(_boolean);

		//String : 여러개의 문자를 편리하게 사용하기 위한 클래스
		//문자열 : ""(큰따옴표)로 감싸진 글자
		String _String = new String("abcd");
		System.out.println(_String);
		_String = "1234";
		System.out.println(_String);
		
		/*
		 * << 리터럴의 종류 >>
		 * 숫자 : 0, 10, -5, 3.14
		 * 문자 : '가', 'a', '0'(따옴표로 묶여있으면 숫자가 문자가됨), ' '(공백도 문자)
		 * 문자열 : "가나다", "abc", "123", " ", ""(공백없어도 문자열)
		 * 그외 : true, false, null(값이 없다)
		 * 
		 * << 참조형 타입 >>
		 * - 기본형 타입을 제외한 모든 데이터 타입(배열, 클래스)
		 * - ex) String, ABC, Variable
		 * - 값이 변수에 저장되지 않고 따로 저장되며, 그 주소가 변수에 저장된다.
		 * - 변수의 크기는 4byte 이다.
		 */
		
		//기본값 : 전역변수(메서드 밖에 선언되어 있는 변수<->지역변수)에 아무것도 저장하지 않았을때 저장되어 있는 값
		_byte = 0;
		_short = 0;
		_int = 0;
		_long = 0L;
		_float = 0.0f;
		_double = 0.0;
		_char = '\u0000'; //' '(공백=0000)
		_boolean = false;
		_String = null; //(참조형타입의 기본값 null)
		
		//경우에 따라 변수에 타입이 다른 값을 저장하기도 한다.
		_byte = 127;
		_int = 128;
		_byte = (byte)_int; //형변환 : 데이터 타입을 변환하는 것 (바꾸고 싶은 타입 입력)
		System.out.println(_byte); //128 -> -128 (오버플로우 현상)
		
		_byte = -128;
		_int = -129;
		_byte = (byte)_int;
		System.out.println(_byte); //-129 -> 127 (언더플로우)
		//표현범위가 큰 타입에서 작은 타입으로 형변환 할 경우 데이터가 손실될 수 있다.
		
		//double 타입에서 int 타입으로 형변환해서 출력해주세요.
		_double = 12.345;
		_int = 123;
		_int = (int)_double;
		System.out.println(_int); //int는 소수점을 표현할 수 없으므로 소수점이 손실된다.
		
		//표현범위가 작은 타입에서 큰 타입으로 형변환 할 경우 데이터가 손실될 염려가 없다.
		//그러므로 형변환을 생략할 수 있다.
		_int = _byte;
		_long = _int;
		_double = _int;
		_double = _float;
		
		/*
		 * << 상수 >>
		 * - 값을 한번 저장하면 변경할 수 없는 저장공간
		 * - final int MAX_NUMBER = 10(최대값); final + 변수 + 상수이름(대문자로);
		 * - 리터럴에 의미를 부여하기 위해 사용한다.
		 */
		final int MAX_NUMBER; //선언
		MAX_NUMBER = 10; //초기화
//		MAX_NUMBER = 100; //값을 바꾸려하니 컴파일 에러 발생
		
		
	}
}
