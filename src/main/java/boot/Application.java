package boot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    private static final Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {

        logger.trace("TRACE 로그 메시지");
        logger.debug("DEBUG 로그 메시지");
        logger.info("INFO 로그 메시지");
        logger.warn("WARN 로그 메시지");
        logger.error("ERROR 로그 메시지");

        SpringApplication.run(Application.class, args);
    }
}


/* package boot;    -> Application 이 boot 패키지 안에 들어있다는 걸 알려주는 문장 ( 폴더 경로 느낌
* import org.slf4j.Logger;
import org.slf4j.LoggerFactory;  -> 로그를 사용하기 위해 필요한 라이브러리를 불러옴 , 로그는 프로그램이 실행되는 동안의 메시지를 기록하는 기능 (디버깅,오류확인)
* import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;    -> Spring Boot 프로그램 실행, 자동 설정 기능을 쓰기 위한 라이브러리 불러옴
* @SpringBootApplication    -> 이 클래스가 Main 클래스 임을 알려주는 어노테이션  자동 설정, 컴포넌트 스캔 등을 켜주는 역할
* public class Application {    -> Application 이라는 클래스의 시작
* private static final Logger logger = LoggerFactory.getLogger(Application.class);    -> 로그를 찍기 위한 도구를 만든것

    public static void main(String[] args) {  -> 자바 프로그램의 시작점 정의

        logger.trace("TRACE 로그 메시지");      -> 다섯 단계 로그 메시지 출력 코드    -- 가장 상세로그 개발시에만 봄
        logger.debug("DEBUG 로그 메시지");     -- 디버깅
        logger.info("INFO 로그 메시지");       -- 정보성 메시지 (보통 실행 흐름 확인할 때)
        logger.warn("WARN 로그 메시지");         -- 경고 메시지 (큰 문제는 아니지만 주의 필요)
        logger.error("ERROR 로그 메시지");        -- 에러 메시지 (프로그램이 문제를 만났을 때)

        SpringApplication.run(Application.class, args);     -> Spring Boot 애플리케이션을 실행   , 이 순간부터 서버 켜지고 컨트롤러, 서비스 같은 것들 작동하기 시작
    }
}               -> main 메서드와 Application 클래스 끝남

*
*
*     ->>>>> Spring Boot 애플리케이션을 실행시키는 메인 클래스
* */