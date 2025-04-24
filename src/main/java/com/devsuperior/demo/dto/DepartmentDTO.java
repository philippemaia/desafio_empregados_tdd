package com.devsuperior.demo.dto;

import com.devsuperior.demo.entities.Department;

public class DepartmentDTO {

    private String name;

    public DepartmentDTO(){

    }

    public DepartmentDTO(String name) {
        this.name = name;
    }

    public DepartmentDTO(Department entity) {
        this.name = entity.getName();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
