package epjbuluran.minicapstone.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserRequest {

    private String email;
    private String password;
}
