package com.example.javaspring.controller;

import com.example.javaspring.model.SearchParam;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")//메소드가 아닌 클래스는 매핑(ex./api)이 동일해도 상관없다.
public class PostController {
    //POST가 발생하는 경우 : HTML의 <Form> 사용,ajax 검색  == 검색파라미터가 많다
    //http post body -> data
    //json, xml, multipart-form / text-plain형태로 받음
    @PostMapping(value = "/postMethod")//기본적으로 json형태로 받으나, 따로 형태를 지정해주기위해서  PostMapping 안에 produces = {"data type"} 와같이 매개변수로 넣어줘야한다
    //@RequestMapping(method = RequestMethod.POST, path = "/postMethod") 와 동일
    public SearchParam postMethod(@RequestBody SearchParam searchParam){
        return searchParam;
    }

    @PutMapping("/putMethod")
    public void put(){

    }
    @PatchMapping("/patchMethod")
    public void patch(){

    }
    //REST 의 개념
    //HTTP 프로토콜에 있는 Method를 활용한 아키텍쳐 스타일
    //HTTP Method 를 통해서 Resource를 처리한다
    //CRUD 를 통한 Resource 조작을 할떄 사용한다
    //  HTTP Metod     |         동작          |      URL 형태
    //     GET         |  조회(SELECT*READ)    |  /user/{id}
    //     POST        |  생성(CREATE)         |  /user
    //     PUT/PATCH   |  수정(UPDATE) *CREATE |  /user
    //     DELETE      |  삭제(DELETE)         |  /user/{1}

}
