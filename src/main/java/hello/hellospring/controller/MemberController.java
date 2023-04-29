package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {

    private final MemberService memberService;

    /*
    * 생성자에 @Autowired가 있으면 스프링이 스프링컨테이너에있는 MemberService를 가지고와서 연결 시켜준다.
    *
    * 생성자 injection
    * */
    @Autowired
    public MemberController(MemberService memberService){
        this.memberService = memberService;
    }
}
