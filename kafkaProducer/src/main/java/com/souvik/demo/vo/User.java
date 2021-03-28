package com.souvik.demo.vo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {

	private String name;
	private String dept;
	private Long salary;
}
