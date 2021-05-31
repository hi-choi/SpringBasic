package hi_choi.spring.annotation;
import org.springframework.stereotype.Component;
import hi_choi.spring.beans.HelloSpring5Bean03;

@Component("kor")
public class HelloSpring5Bean07Kor implements HelloSpring5Bean03 {
	
	@Override
	public void sayHello(String msg) {
		System.out.println("안녕하세요," +msg);
	}

}
