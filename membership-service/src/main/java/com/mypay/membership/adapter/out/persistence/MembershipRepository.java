package com.mypay.membership.adapter.out.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * packageName    : com.mypay.membership.adapter.out.persistence
 * fileName       : MembershipRepository
 * author         : Hyuk Kim
 * date           : 2023-12-17
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-12-17        Hyuk Kim       최초 생성
 */
public interface MembershipRepository extends JpaRepository<MembershipJpaEntity, Long> {
}
