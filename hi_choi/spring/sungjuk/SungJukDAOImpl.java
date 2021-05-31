package hi_choi.spring.sungjuk;

//SungJukDAO 인터페이스의 메서드를 구체화하는 클래스
public class SungJukDAOImpl implements SungJukDAO {

	@Override
	public void insertSungJuk(SungJuk sj) {
		System.out.println("성적 추가됨!");

	}

}
