/* 사용자가 /test 페이지를 요청하면 요청 받아서 처리
GET 요청이면 단순히 해당 페이지를 보여줌 POST 요청이면 사용자가 입력한 데이터를 모델(Model)에 담아 다른 페이지로 전달
* */


package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @GetMapping("/test")
    public String test() {

        return "test";
    }

    @GetMapping("/newPage")
    public String newPage() {


        return "newPage";
    }

    @GetMapping("/rgtData")
    public String rgtData(@RequestParam String userName, Model model) {

        model.addAttribute("userName", userName);

        return "newPage";
    }

    @PostMapping("/newPagePost")
    public String newPagePost(@RequestParam("userName") String userName,
                              @RequestParam("address") String address,
                              @RequestParam("userId") String userId,
                              Model model) {
        model.addAttribute("userId", userId);
        model.addAttribute("userName", userName);
        model.addAttribute("address", address);

        return "newPage";
    }
}


/* package com.example.demo.controller;     -> MainController 가 com.example.demo.controller 패키지 안에 속해 있다는 선언

import org.springframework.stereotype.Controller;        -> 컨트롤러 기능을 쓰기 위한 라이브러리를 불러오는 부분    -- 이 클래스가 컨트롤러라는 걸 알림
import org.springframework.ui.Model;         -- 백엔드 데이터(Model)를 프론트(HTML)로 넘김
import org.springframework.web.bind.annotation.GetMapping;            --특정 URL 요청을 처리하도록 매핑
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;            -- 요청으로 들어온 데이터를 변수로 받아옴

@Controller
public class MainController {           -> 이 클래스가 Spring MVC 의 컨트롤러 역할 하는걸 알림 , 브라우저 요청을 받아서 알맞은 HTML 을 리턴

    @GetMapping("/test")
    public String test() {

        return "test";
    }                                       -> 사용자가 /test 주소로 접속하면 test.html 파일 보여줌

    @GetMapping("/newPage")
    public String newPage() {


        return "newPage";
    }                                          -> 사용자가 /newPage 주소로 접속하면 newPage.html 파일 보여줌

    @GetMapping("/rgtData")
    public String rgtData(@RequestParam String userName, Model model) {

        model.addAttribute("userName", userName);

        return "newPage";
    }                                        -> 사용자가 /rgtData 주소로 접속하면서 userName 값을 보내면, 그 값을 모델에 담아서 newPage.html 로 전달

    @PostMapping("/newPagePost")
    public String newPagePost(@RequestParam("userName") String userName,
                              @RequestParam("address") String address,
                              @RequestParam("userId") String userId,
                              Model model) {
        model.addAttribute("userId", userId);
        model.addAttribute("userName", userName);          -> newPage.html 이랑 연결되는 부분       , 백엔드에서 데이터를 담아 프론트로 넘겨줌 HTML 에서는 ${userName}으로 받아서 화면에 표시
        model.addAttribute("address", address);

        return "newPage";
    }                       -> 폼 같은 POST 요청으로 userName, address, userId 값을 전달받아 newPage.html 에 출력    ,HTML 에서 입력한 데이터를 서버에서 받아서 다시 화면에 보여즘
}
*
* */