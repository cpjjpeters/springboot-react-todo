package be.ipeters.springboot_react.modal;

/* carlpeters created on 16/07/2024 inside the package - be.ipeters.springboot_react.modal */
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApiResponse {

    private String message;
    private Boolean Status;
}