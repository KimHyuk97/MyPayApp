package com.mypay.membership.application.port.in;

import com.mypay.membership.domain.Membership;

/**
 * packageName    : com.mypay.membership.application.port.in
 * fileName       : FindMembershipUseCase
 * author         : Hyuk Kim
 * date           : 2023-12-17
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-12-17        Hyuk Kim       최초 생성
 */
public interface FindMembershipUseCase {
    Membership findMembership(FindMembershipCommand findMembershipCommand);
}
