package com.saitej.springboot.validationexceptionhandling.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRequest {

    @NotBlank
    @NotNull(message = "Username shouldn't be Null")
    private String name;
    @Email(message = "Invalid Email address")
    private String email;
    @Pattern(regexp = "^\\d{10}$",message = "Invalid Mobile Number")
    private String mobile;
    private String gender;
    @Min(18)
    @Max(60)
    private int age;
    @NotBlank
    @NotNull
    private String nationality;
}
