package com.mypay.membership.adapter.in.web;

import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * packageName    : com.mypay.membership.adapter.in.web
 * fileName       : RegisterMembershipRequest
 * author         : Hyuk Kim
 * date           : 2023-12-17
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-12-17        Hyuk Kim       최초 생성
 */
@Getter
@NoArgsConstructor
public class RegisterMembershipRequest {

    private String name;
    private String address;
    private String email;
    private boolean isCorp;
}
