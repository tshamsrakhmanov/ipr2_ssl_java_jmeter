package com.example.api_service.Model;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ResponseDTO {
    private Boolean is_clearance_allowed;
    private Boolean is_passed_check;
    private Integer internal_ID;
}
