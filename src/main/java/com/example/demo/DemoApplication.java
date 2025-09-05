package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}



/* 서버 실행
main() 메서드에서 SpringApplication.run()을 호출하면 스프링 부트가 프로젝트 전체 로드, 컨트롤러와 설정 파일들이 동작할 준비를 마침
*
* */






// Spring Boot 의 메인 실행 클래스

/*package com.example.demo;         -> DemoApplication 클래스가 com.example.demo 패키지 안에 있다는 걸 선언

import org.springframework.boot.SpringApplication;            -- 스프링 앱 실행하는 클래스
import org.springframework.boot.autoconfigure.SpringBootApplication;     -> Spring Boot 애플리케이션 실행에 필요한 라이브러리를 불러오는 부분           -- 스프링 부트 자동 설정, 컴포넌트 스캔 등을 켜주는 어노테이션

@SpringBootApplication               -> 이 클래스가 Spring Boot 애플리케이션의 시작점(Main)이라는 표시
public class DemoApplication {        -> DemoApplication 클래스의 시작

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }                                                          -> 자바 프로그램이 실행될 때 가장 먼저 실행되는 main 메서드

}           -> DemoApplication 클래스의 끝
*
*
* */