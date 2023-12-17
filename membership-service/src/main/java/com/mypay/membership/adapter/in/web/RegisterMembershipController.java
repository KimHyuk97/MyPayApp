package com.mypay.membership.adapter.in.web;

import common.WebAdapter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
@WebAdapter
@RestController
@RequiredArgsConstructor
public class RegisterMembershipController {

    @PostMapping("/membership/register")
    void registerMemberShip(@RequestBody RegisterMembershipRequest request) {
        System.out.println("registerMemberShip : "+ request);
    }

}
