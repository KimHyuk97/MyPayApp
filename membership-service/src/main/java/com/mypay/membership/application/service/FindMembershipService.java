package com.mypay.membership.application.service;

import com.mypay.membership.application.port.in.FindMembershipCommand;
import com.mypay.membership.application.port.in.FindMembershipUseCase;
import com.mypay.membership.application.port.out.FindMembershipPort;
import com.mypay.membership.domain.Membership;
import common.UseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;

/**
 * packageName    : com.mypay.membership.application.service
 * fileName       : FindMembershipService
 * author         : Hyuk Kim
 * date           : 2023-12-17
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-12-17        Hyuk Kim       최초 생성
 */
@UseCase
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class FindMembershipService implements FindMembershipUseCase {

    private final FindMembershipPort findMembershipPort;

    @Override
    public Membership findMembership(FindMembershipCommand command) {

        return findMembershipPort.findMembership(new Membership.MembershipId(command.getMemberShipId()));
    }
}
