package epjbuluran.minicapstone.dto;

import lombok.Data;

import java.time.ZonedDateTime;

@Data
public class UserDTO {
    private String email;
    private int totalOrders;
    private int successOrders;
    private ZonedDateTime createdDate;
    private ZonedDateTime modifiedDate;
}
