package com.mypay.membership.adapter.in.web;

import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * packageName    : com.mypay.membership.adapter.in.web
 * fileName       : ModifyMembershipRequest
 * author         : Hyuk Kim
 * date           : 2024-02-04
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-04        Hyuk Kim       최초 생성
 */
@Getter
@NoArgsConstructor
public class ModifyMembershipRequest {

    private Long membershipId;
    private String name;
    private String address;
    private String email;
    private boolean isValid;
    private boolean isCorp;
}
