package com.mypay.membership.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Value;

/**
 * packageName    : com.mypay.membership.domain
 * fileName       : Membership
 * author         : Hyuk Kim
 * date           : 2023-12-15
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-12-15        Hyuk Kim       최초 생성
 */
@Getter
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public class Membership {

    private final Long membershipId;

    private final String name;

    private final String email;

    private final String address;

    private final boolean isValid;

    private final boolean isCorp;

    public static Membership generateMember (MembershipId membershipId, MembershipName membershipName, MembershipEmail membershipEmail, MembershipAddress membershipAddress, MembershipIsValid membershipIsValid, MembershipIsCorp membershipIsCorp) {
        return new Membership(membershipId.id, membershipName.name, membershipEmail.email, membershipAddress.address, membershipIsValid.isValid, membershipIsCorp.isCorp);
    }

    @Value
    public static class MembershipId {

        Long id;

        public MembershipId (Long id) {
            this.id = id;
        }
    }

    @Value
    public static class MembershipName {

        String name;

        public MembershipName (String name) {
            this.name = name;
        }
    }

    @Value
    public static class MembershipEmail {

        String email;

        public MembershipEmail (String email) {
            this.email = email;
        }
    }

    @Value
    public static class MembershipAddress {

        String address;

        public MembershipAddress (String address) {
            this.address = address;
        }
    }

    @Value
    public static class MembershipIsValid {

        boolean isValid;

        public MembershipIsValid (boolean isValid) {
            this.isValid = isValid;
        }
    }

    @Value
    public static class MembershipIsCorp {

        boolean isCorp;

        public MembershipIsCorp (boolean isCorp) {
            this.isCorp = isCorp;
        }
    }



}
