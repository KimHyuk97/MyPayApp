package com.mypay.membership.adapter.in.web;

import com.mypay.common.WebAdapter;
import com.mypay.membership.application.port.in.ModifyMembershipCommand;
import com.mypay.membership.application.port.in.ModifyMembershipUseCase;
import com.mypay.membership.domain.Membership;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * packageName    : com.mypay.membership.adapter.in.web
 * fileName       : ModifyMembershipController
 * author         : Hyuk Kim
 * date           : 2024-02-04
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-04        Hyuk Kim       최초 생성
 */
@WebAdapter
@RestController
@RequiredArgsConstructor
public class ModifyMembershipController {

    private final ModifyMembershipUseCase modifyMembershipUseCase;

    @PatchMapping("/membership/modify/{membershipId}")
    ResponseEntity<Membership> modifyMembershipBy(@RequestBody ModifyMembershipRequest request) {

        ModifyMembershipCommand command = ModifyMembershipCommand.builder()
                .memberShipId(request.getMembershipId())
                .name(request.getName())
                .email(request.getEmail())
                .address(request.getAddress())
                .isValid(request.isValid())
                .isValid(request.isCorp())
                .build();
        return ResponseEntity.ok(modifyMembershipUseCase.modifyMembership(command));
    }
}
