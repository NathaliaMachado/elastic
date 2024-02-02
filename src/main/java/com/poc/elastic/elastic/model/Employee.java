package com.poc.elastic.elastic.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

//import javax.persistence.Entity;

@Data
//@Entity
@AllArgsConstructor
@NoArgsConstructor
@Document(indexName = "employee")
public class Employee {

    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String department;
}
