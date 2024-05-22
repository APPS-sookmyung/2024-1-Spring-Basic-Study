package hello.core.scan.filter;

import java.lang.annotation.*;

@Target(ElementType.TYPE) // TYPE이라고 하면 클래스 레벨에 붙음, 메타 어노테이션 (어노테이션에 붙는 어노테이션) 사용할 어노테이션을 적용할 대상을 지정하는데 사용함
@Retention(RetentionPolicy.RUNTIME) // 특정 어노테이션의 지속 시간을 결정함. RUNTIME은 클래스 파일까지 존재하며, 실행 시 사용한다. 지속 시간이 가장 길다.
@Documented
//어노테이션에 대한 정보가 javadoc으로 작성한 문서에 포함되도록 하는 어노테이션 설정이다.
//javadoc는 자바에서 지정한 형태의 주석들을 인식하여 html을 통해 api 문서 형태로 만들어주는 도구이다.
public @interface MyIncludeComponent {
}
