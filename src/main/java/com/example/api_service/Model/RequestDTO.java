package com.example.api_service.Model;

import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class RequestDTO {

    private String user_ID;
    private String user_name;
    private String user_surname;
    private String user_phone;

}
