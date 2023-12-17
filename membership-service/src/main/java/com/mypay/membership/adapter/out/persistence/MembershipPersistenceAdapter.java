package com.mypay.membership.adapter.out.persistence;

import com.mypay.membership.application.port.out.FindMembershipPort;
import com.mypay.membership.application.port.out.RegisterMembershipPort;
import com.mypay.membership.domain.Membership;
import common.PersistenceAdapter;
import lombok.RequiredArgsConstructor;

/**
 * packageName    : com.mypay.membership.adapter.out.persistence
 * fileName       : MembershipPersistenceAdapter
 * author         : Hyuk Kim
 * date           : 2023-12-17
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-12-17        Hyuk Kim       최초 생성
 */
@PersistenceAdapter
@RequiredArgsConstructor
public class MembershipPersistenceAdapter implements RegisterMembershipPort, FindMembershipPort {

    private final MembershipMapper membershipMapper;

    private final MembershipRepository membershipRepository;

    @Override
    public void createMembership(Membership.MembershipName membershipName, Membership.MembershipEmail membershipEmail, Membership.MembershipAddress membershipAddress, Membership.MembershipIsValid membershipIsValid, Membership.MembershipIsCorp membershipIsCorp) {
        membershipRepository.save(
                new MembershipJpaEntity(
                        membershipName.getName(),
                        membershipEmail.getEmail(),
                        membershipAddress.getAddress(),
                        membershipIsValid.isValid()
                )
        );
    }

    @Override
    public Membership findMembership(Membership.MembershipId command) {
        MembershipJpaEntity findMember = membershipRepository.findById(command.getId())
                .orElseThrow(() -> new RuntimeException("not find member"));

        return membershipMapper.mapToDomainEntity(findMember);
    }
}
