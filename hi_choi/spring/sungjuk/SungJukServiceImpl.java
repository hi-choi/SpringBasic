package hi_choi.spring.sungjuk;

//SungJukService 인터페이스의 메서드를 구체화하는 클래스
public class SungJukServiceImpl implements SungJukService {

	private SungJukDAO sdao;
	

	// 데이터 주입 방법 1,2 중 하나를 선택해서 사용
	// 데이터 주입 방법 1 - setter 사용
	// sjdao에 대한 객체를 불러오기 위해 setter 메서드 정의
	// 스프링 컨테이너가 sdao 변수에 객체를 DI해 줌(빌려줌) 
	public void setSdao(SungJukDAO sdao) {
		this.sdao = sdao;
	}
	
	// 데이터 주입 방법 2 - 생성자 사용
	// sjdao에 대한 객체를 불러오기 위해 생성자 메서드 정의
	// 스프링 컨테이너가 sdao 변수에 객체를 DI해 줌(빌려줌) 
	public SungJukServiceImpl(SungJukDAO sdao) {
		this.sdao=sdao;
	}


	@Override
	public void newSungJuk() {
		
		SungJuk sj = new SungJuk("혜교",99,96,76);
		
		System.out.println("성적 생성됨!");
		
		// SungJukDAO로 생성한 객체 전달
		// 이후, 이 전달된 값은 SungJukDAOImpl에서 사용됨
		sdao.insertSungJuk(sj);
		
	}
	
	
	

}
