package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
    }

}

// 스프링 컨텍스트가 정상적으로 로드되는지 확인 , 스프링이 프로젝트 전체를 실행할 준비가 제대로 되었는지 테스트한다는 의미야.
// , 프로젝트가 실행될 준비가 되었는지 확인하는 최소 테스트 역할


// 테스트 코드 파일

/*package com.example.demo;     -> 이 파일이 com.example.demo 패키지 안에 속해 있다는 뜻

import org.junit.jupiter.api.Test;     -> JUnit 라이브러리에서 @Test 애노테이션을 불러온다는 뜻
import org.springframework.boot.test.context.SpringBootTest;        -> 스프링 부트에서 제공하는 @SpringBootTest 애노테이션을 불러온다는 뜻

@SpringBootTest                     -> 스프링 부트를 실행시켜서 테스트 환경을 애플리케이션처럼 띄워놓고 테스트를 실행하겠다는 의미
class DemoApplicationTests {

    @Test            -> 이 메서드가 테스트 메서드라는 표시
    void contextLoads() {           -> 이 메서드는 이름 그대로 스프링 컨텍스트가 잘 로드(실행)되는지 확인하는 테스트
    }

}
*
*
*
* */