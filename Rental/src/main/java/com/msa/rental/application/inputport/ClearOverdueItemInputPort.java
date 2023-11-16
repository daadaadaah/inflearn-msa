package com.msa.rental.application.inputport;

import com.msa.rental.application.outputport.RentalCardOutputPort;
import com.msa.rental.application.usecase.ClearOverdueItemUsecase;
import com.msa.rental.domain.model.RentalCard;
import com.msa.rental.framework.web.dto.ClearOverdueInfoDTO;
import com.msa.rental.framework.web.dto.RentalResultOutputDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class ClearOverdueItemInputPort implements ClearOverdueItemUsecase {
    final RentalCardOutputPort rentalCardOutputPort;

    @Override
    public RentalResultOutputDTO clearOverdue(ClearOverdueInfoDTO clearOverdueInfoDTO) throws Exception {
        RentalCard loadRentalCard = rentalCardOutputPort.loadRentalCard(clearOverdueInfoDTO.UserId)
                                        .orElseThrow(() -> new IllegalArgumentException("해당 카드가 존재하지 않습니다."));
        return RentalResultOutputDTO .mapToDTO(loadRentalCard);
    }
}
