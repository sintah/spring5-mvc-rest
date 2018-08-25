package ru.dobrotrener.spring5mvcrest.api.v1.model;

import lombok.Data;

@Data
public class CustomerDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private String customerUrl;

    public String getCustomerUrl() {
        return "/api/v1/customers/" + id;
    }
}
