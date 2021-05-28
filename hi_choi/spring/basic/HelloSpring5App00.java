package hi_choi.spring.basic;

public class HelloSpring5App00 {

	// 첫번째 사례
	// 간단한 인삿말을 출력하는 프로그램 작성
	// 메세지를 출력하는 sayHello메서드를 만들어 그것을 호출
	
	// 인삿말을 출력하는 메서드가 현재 클래스안에 있기 때문에
	// 프로그램 확장성 측면에서 봤을때 제약이 존재
	
	// 즉, 유지보수의 어려움이 발생
    // 또한, 개발자가 여러명인 경우 업무분담의 어려움도 존재
    // 해결 : 인삿말 출력 기능을 담당하는 클래스를 따로 작성
	
	//00은 모노리스 방식으로 개발 01은 독립적인 클래스를 만들어 따로 저장

	public static void main(String[] args) {
		HelloSpring5App00 app00 = new HelloSpring5App00();
		app00.sayHello("스프링5!!");
		app00.sayHello("Spring5!!");
		app00.sayHello("スプリング5!!");

	}
	
	private void sayHello(String msg) {
		System.out.println("안녕하세요"+ msg);
	}
}
