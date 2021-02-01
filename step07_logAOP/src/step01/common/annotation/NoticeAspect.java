package step01.common.annotation;

import org.springframework.stereotype.Component;

@Component
public class NoticeAspect {
	
	public static void noticBuyStart() {
		System.out.println("[공통 1] 구매를 시작 하실 건가요?");
	}
	
	public static void noticBuyEnd() {
		System.out.println("[공통 2] 구매를 완료 하셨습니다");
	}
	
	public void noticReturnValue(Object value) {
		System.out.println("통일된 방식으로 리턴 처리로직 : " + value.toString());
	}
	
	private void noticException(Exception e) {
		System.out.println(e.getMessage());
	}
}