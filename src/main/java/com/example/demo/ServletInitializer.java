package com.example.demo;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(DemoApplication.class);
    }

}

/* 외부 서버에 배포할 때 DemoApplication 을 기준으로 앱 실행 도움
* */


/*package com.example.demo;            -> ServletInitializer 클래스가 com.example.demo 패키지 안에 속해 있다는 선언

import org.springframework.boot.builder.SpringApplicationBuilder;    -- 애플리케이션을 빌드(설정)할 수 있도록 도움
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;      -> 서블릿 환경에서 스프링 부트를 실행하기 위해 필요한 클래스들을 불러오는 부분      , 스프링 부트를 외부 서버(WAS)에서 실행 가능하게 해주는 클래스

public class ServletInitializer extends SpringBootServletInitializer {    -> ServletInitializer 라는 클래스를 만들고, SpringBootServletInitializer 를 상속받는다는 뜻       , 스프링 부트를 “외부 톰캣 서버” 같은 곳에 올려도 실행될 수 있도록 확장

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(DemoApplication.class);
    }         -> 외부 서버에서 실행될 때, 어떤 메인 클래스를 기준으로 앱을 실행할지 설정하는 부분    , DemoApplication.class 를 지정했으니까, 결국 DemoApplication 이 시작점(Main)이라는 걸 알려줌

}        -> ServletInitializer 클래스 끝남

*
* */