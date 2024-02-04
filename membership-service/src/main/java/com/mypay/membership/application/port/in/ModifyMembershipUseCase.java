package com.mypay.membership.application.port.in;

import com.mypay.membership.domain.Membership;

/**
 * packageName    : com.mypay.membership.application.port.in
 * fileName       : ModifyMembershipUseCase
 * author         : Hyuk Kim
 * date           : 2024-02-04
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-04        Hyuk Kim       최초 생성
 */
public interface ModifyMembershipUseCase {

    Membership modifyMembership(ModifyMembershipCommand command);
}
