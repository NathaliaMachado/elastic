package com.poc.elastic.elastic.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(indexName = "employee")
public class Employee {

    @Id
    private String id;
    @Field(type = FieldType.Text, name = "firstName")
    private String firstName;
    @Field(type = FieldType.Text, name = "lastName")
    private String lastName;
    @Field(type = FieldType.Text, name = "department")
    private String department;
}
