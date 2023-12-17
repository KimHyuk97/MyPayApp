package com.mypay.membership.adapter.out.persistence;

import com.mypay.membership.domain.Membership;
import org.springframework.stereotype.Component;

/**
 * packageName    : com.mypay.membership.adapter.out.persistence
 * fileName       : MembershipMapper
 * author         : Hyuk Kim
 * date           : 2023-12-17
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-12-17        Hyuk Kim       최초 생성
 */
@Component
public class MembershipMapper {

    Membership mapToDomainEntity(MembershipJpaEntity membership) {
        return Membership.generateMember(
                new Membership.MembershipId(membership.getMembershipId()+""),
                new Membership.MembershipName(membership.getName()),
                new Membership.MembershipEmail(membership.getEmail()),
                new Membership.MembershipAddress(membership.getAddress()),
                new Membership.MembershipIsValid(membership.isValid()),
                new Membership.MembershipIsCorp(membership.isValid())
        );
    }
}
