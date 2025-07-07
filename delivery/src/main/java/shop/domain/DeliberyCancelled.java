package shop.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import shop.domain.*;
import shop.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class DeliberyCancelled extends AbstractEvent {

    private Long id;
    private String orderid;
    private String customerid;
    private String productid;
    private Integer qty;
    private String address;

    public DeliberyCancelled(Delivery aggregate) {
        super(aggregate);
    }

    public DeliberyCancelled() {
        super();
    }
}
//>>> DDD / Domain Event
