package com.mypay.membership.adapter.in.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * packageName    : com.mypay.membershipservice
 * fileName       : RegisterMembershipController
 * author         : Hyuk Kim
 * date           : 2023-12-15
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-12-15        Hyuk Kim       최초 생성
 */
@RestController
public class RegisterMembershipController {

    @GetMapping("/membership")
    public void home () {
        System.out.println("hello membership controller");
    }
}
