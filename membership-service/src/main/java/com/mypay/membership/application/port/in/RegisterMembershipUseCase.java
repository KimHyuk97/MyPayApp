package com.mypay.membership.application.port.in;

/**
 * packageName    : com.mypay.membership.application.port.in
 * fileName       : RegisterMembershipUseCase
 * author         : Hyuk Kim
 * date           : 2023-12-17
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-12-17        Hyuk Kim       최초 생성
 */
public interface RegisterMembershipUseCase {

    void registerMembership(RegisterMembershipCommand command);
}
