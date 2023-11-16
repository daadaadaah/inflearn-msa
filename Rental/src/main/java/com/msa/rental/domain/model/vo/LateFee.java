package com.msa.rental.domain.model.vo;


import javax.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LateFee {
    private long point;

    public LateFee addPoint(long point){
        return new LateFee(this.point + point);
    }

    public LateFee removePoint(long point) throws Exception {
        if(point > this.point) {
            throw new Exception("보유한 포인트보다 커서 삭제할수 없습니다.");
        }

        return new LateFee(this.point -point);
    }

    public  static LateFee createLateFee(){
        return new LateFee(0);
    }

    public static LateFee sample(){
        return  new LateFee(100);
    }
}
