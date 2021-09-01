package com.example.javaspring.controller;

import com.example.javaspring.model.SearchParam;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")//localhost:8080/api
public class GetController {
    @RequestMapping(method = RequestMethod.GET, path = "/getMethod")//localhost:8080/api/getMethod
    public String getRequest(){
        return "Hi getMethod";
    }

    @GetMapping("/getParameter")//localhost:8080/api/getParameter?id=1234&password=abcd
    public String getParameter(@RequestParam String id,@RequestParam(name = "password") String pwd){ //이렇게하면 password로 값을 받아오지만, 저장은 pwd로 저장되어 우리는 pwd로 받아온값을 활용할수있다.
        System.out.println("id : "+id);
        System.out.println("password : "+pwd);
        return id+pwd;
    }

    //localhost:8080/api/getMultiParameter?account=abcd&email=study@gmail.com&page=10 와 같이 파라미터가 많을경우 아래와 같이 객체틀 통해서 받아올수있음
//    @GetMapping("/getMultiParameter")
//    public String getMultiParameter(SearchParam searchParam){
//        System.out.println(searchParam.getAccount());
//        System.out.println(searchParam.getEmail());
//        System.out.println(searchParam.getPage());
//
//        return searchParam.getAccount()+searchParam.getEmail()+Integer.toString(searchParam.getPage());
//    }
    //위방식은 단순 String 반환방식 abcdstudy@gmail.com10의 형태로 반환된다
    @GetMapping("/getMultiParameter")
    public SearchParam getMultiParameter(SearchParam searchParam){
        System.out.println(searchParam.getAccount());
        System.out.println(searchParam.getEmail());
        System.out.println(searchParam.getPage());
        return searchParam;
    }
    //위방식은 json 반환방식 {"account":"abcd","email":"study@gmail.com","page":10}의 형태로 반환됨
    //위처럼 HTTP 의 GET 메소드를 사용할경우 -주소창에 파라미터가 노추로기며, 브라우저에서 주소에 대한 캐시가 이루어지므로 정보를 얻을때 사용(EX. 유튜브에서 특정동영상의 13분 20초로 바로 재생하기원할때)

}
