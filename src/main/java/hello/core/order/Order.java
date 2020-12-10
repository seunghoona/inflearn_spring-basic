package hello.core.order;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Order {
    private Long memberId;
    private String itemName;
    private int itemPrice;
    private int discountPrice;


    public int calculatePrice(){
        //실제 상품에서 할인율 적용
        return itemPrice - discountPrice;
    }
}
