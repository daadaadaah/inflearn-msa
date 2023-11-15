package com.msa.rental.domain.model.vo;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReturnItem {
    private RentalItem rentalItem;
    private LocalDate returnDate;

    public static ReturnItem createReturnItem(RentalItem rentalItem){
        return new ReturnItem(rentalItem,LocalDate.now());
    }

    public static ReturnItem sample(){
        return ReturnItem.createReturnItem(RentalItem.sample());
    }
}
