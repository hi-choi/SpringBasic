package hi_choi.spring.annotation;

import org.springframework.stereotype.Repository;

import hi_choi.spring.sungjuk.SungJuk;
import hi_choi.spring.sungjuk.SungJukDAO;

//SungJukDAO 인터페이스의 메서드를 구체화하는 클래스
@Repository("sdao")
public class SungJukDAOImpl implements SungJukDAO {

	@Override
	public void insertSungJuk(SungJuk sj) {
		System.out.println("성적 추가됨!");

	}

}
