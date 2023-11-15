package com.msa.rental.domain.model.vo;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RentalItem {

    private Item item;
    private LocalDate rentDate;
    private boolean overdued;
    private LocalDate overdueDate; //반납예정일

    public static RentalItem createRentalItem(Item item) {
        return new
            RentalItem(item, LocalDate.now(), false, LocalDate.now().plusDays(14));
    }

    public static RentalItem sample() {
        return RentalItem.createRentalItem(Item.Sample());
    }
}