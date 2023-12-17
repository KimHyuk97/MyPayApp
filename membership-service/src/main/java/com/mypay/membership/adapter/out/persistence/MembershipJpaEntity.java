package com.mypay.membership.adapter.out.persistence;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * packageName    : com.mypay.membership.adapter.out.persistence
 * fileName       : MembershipJpaEntity
 * author         : Hyuk Kim
 * date           : 2023-12-17
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-12-17        Hyuk Kim       최초 생성
 */
@Getter
@Entity
@NoArgsConstructor
@Table(name = "membership")
public class MembershipJpaEntity {

    @Id
    @GeneratedValue
    private Long membershipId;

    private String name;

    private String address;

    private String email;

    private boolean isValid;


    public MembershipJpaEntity(String name, String address, String email, boolean isValid) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.isValid = isValid;
    }

    @Override
    public String toString() {
        return "MembershipJpaEntity{" +
                "membershipId=" + membershipId +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", isValid=" + isValid +
                '}';
    }
}
