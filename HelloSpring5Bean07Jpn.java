package hi_choi.spring.annotation;
import org.springframework.stereotype.Component;
import hi_choi.spring.beans.HelloSpring5Bean03;

@Component("jpn")
public class HelloSpring5Bean07Jpn implements HelloSpring5Bean03 {
	
	@Override
	public void sayHello(String msg) {
		System.out.println("こんにちは," +msg);
	}

}
