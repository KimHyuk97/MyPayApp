package com.mypay.membership.application.port.in;

import com.mypay.common.SelfValidating;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;

/**
 * packageName    : com.mypay.membership.application.port.in
 * fileName       : FindMembershipCommand
 * author         : Hyuk Kim
 * date           : 2023-12-17
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-12-17        Hyuk Kim       최초 생성
 */
@Getter
public class FindMembershipCommand extends SelfValidating<FindMembershipCommand> {

    @NotNull
    private final Long memberShipId;

    public FindMembershipCommand(Long memberShipId) {
        this.memberShipId = memberShipId;
        this.validateSelf();
    }
}
