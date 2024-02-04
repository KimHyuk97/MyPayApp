package com.mypay.membership.application.service;

import com.mypay.common.UseCase;
import com.mypay.membership.adapter.out.persistence.MembershipJpaEntity;
import com.mypay.membership.adapter.out.persistence.MembershipMapper;
import com.mypay.membership.application.port.in.ModifyMembershipCommand;
import com.mypay.membership.application.port.in.ModifyMembershipUseCase;
import com.mypay.membership.application.port.out.ModifyMembershipPort;
import com.mypay.membership.domain.Membership;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;

/**
 * packageName    : com.mypay.membership.application.service
 * fileName       : ModifyMembershipService
 * author         : Hyuk Kim
 * date           : 2024-02-04
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-04        Hyuk Kim       최초 생성
 */
@UseCase
@Transactional
@RequiredArgsConstructor
public class ModifyMembershipService implements ModifyMembershipUseCase {

    private final ModifyMembershipPort modifyMembershipPort;

    private final MembershipMapper membershipMapper;

    @Override
    public Membership modifyMembership(ModifyMembershipCommand command) {
        MembershipJpaEntity membershipJpaEntity = modifyMembershipPort.modifyMembership(
                new Membership.MembershipId(command.getMemberShipId()),
                new Membership.MembershipName(command.getName()),
                new Membership.MembershipEmail(command.getEmail()),
                new Membership.MembershipAddress(command.getAddress()),
                new Membership.MembershipIsValid(command.isValid()),
                new Membership.MembershipIsCorp(false)
        );

        return membershipMapper.mapToDomainEntity(membershipJpaEntity);
    }
}
