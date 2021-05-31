package hi_choi.spring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hi_choi.spring.sungjuk.SungJuk;
import hi_choi.spring.sungjuk.SungJukDAO;
import hi_choi.spring.sungjuk.SungJukService;

//SungJukService 인터페이스의 메서드를 구체화하는 클래스
@Service("sjsrv")
public class SungJukServiceImpl implements SungJukService {

	@Autowired
	private SungJukDAO sdao;
	


	@Override
	public void newSungJuk() {
		
		SungJuk sj = new SungJuk("혜교",99,96,76);
		
		System.out.println("성적 생성됨!");
		
		// SungJukDAO로 생성한 객체 전달
		// 이후, 이 전달된 값은 SungJukDAOImpl에서 사용됨
		sdao.insertSungJuk(sj);
		
	}
	
	
	

}
