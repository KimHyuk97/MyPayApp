package com.mypay.membership.application.port.out;

import com.mypay.membership.adapter.out.persistence.MembershipJpaEntity;
import com.mypay.membership.domain.Membership;

/**
 * packageName    : com.mypay.membership.application.port.out
 * fileName       : RegisterMembershipPort
 * author         : Hyuk Kim
 * date           : 2023-12-17
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-12-17        Hyuk Kim       최초 생성
 */
public interface ModifyMembershipPort {

    MembershipJpaEntity modifyMembership(
            Membership.MembershipId membershipId,
            Membership.MembershipName membershipName,
            Membership.MembershipEmail membershipEmail,
            Membership.MembershipAddress membershipAddress,
            Membership.MembershipIsValid membershipIsValid,
            Membership.MembershipIsCorp membershipIsCorp
    );
}
