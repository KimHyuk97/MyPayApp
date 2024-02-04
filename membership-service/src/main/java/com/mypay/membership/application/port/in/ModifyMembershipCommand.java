package com.mypay.membership.application.port.in;

import com.mypay.common.SelfValidating;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;

/**
 * packageName    : com.mypay.membership.application.port.in
 * fileName       : ModifyMembershipCommand
 * author         : Hyuk Kim
 * date           : 2024-02-04
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-04        Hyuk Kim       최초 생성
 */
@Getter
@Builder
@EqualsAndHashCode(callSuper = false)
public class ModifyMembershipCommand extends SelfValidating<ModifyMembershipCommand> {

    @NotNull
    private final Long memberShipId;

    @NotBlank
    private final String name;

    @NotBlank
    private final String email;

    @NotBlank
    private final String address;

    @NotNull
    private final boolean isValid;

    public ModifyMembershipCommand(Long memberShipId, String name, String email, String address, boolean isValid) {
        this.memberShipId = memberShipId;
        this.name = name;
        this.email = email;
        this.address = address;
        this.isValid = isValid;

        this.validateSelf();
    }
}
