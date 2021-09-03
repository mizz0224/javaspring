package com.example.javaspring.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data//아래와 같이 get set 메소드 생성
@AllArgsConstructor//한번에 모든 인자를 정의해줄수있는 클래스 생성자(SearchParam)를 만들어줌!
@NoArgsConstructor
public class SearchParam {


    private String account;
    private String email;
    private int page;
//
//    public String getAccount() {
//        return account;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public int getPage() {
//        return page;
//    }
//
//    public void setAccount(String account) {
//        this.account = account;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public void setPage(int page) {
//        this.page = page;
//    }

}
