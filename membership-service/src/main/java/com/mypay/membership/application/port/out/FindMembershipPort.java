package com.mypay.membership.application.port.out;

import com.mypay.membership.domain.Membership;

/**
 * packageName    : com.mypay.membership.application.port.out
 * fileName       : FindMembershipPort
 * author         : Hyuk Kim
 * date           : 2023-12-17
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-12-17        Hyuk Kim       최초 생성
 */
public interface FindMembershipPort {

    Membership findMembership(Membership.MembershipId membershipId);
}
