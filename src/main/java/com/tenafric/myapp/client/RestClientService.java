package com.tenafric.myapp.client;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import com.tenafric.myapp.dto.EmployeeDto;

@Service
public class RestClientService {
    private final RestClient restClient;

    public RestClientService() {
        restClient = RestClient.builder()
                .baseUrl("http://localhost:8080")
                .build();
    }

    private void createEmployee() {
        EmployeeDto newEmployee = new EmployeeDto(null, "admin", "admin", "admin@gmail.com");

        EmployeeDto savedEmployee = restClient.post()
                .uri("/posts")
                .contentType(MediaType.APPLICATION_JSON)
                .body(newEmployee)
                .retrieve()
                .body(EmployeeDto.class);

        System.out.println(savedEmployee.toString());
    }

}