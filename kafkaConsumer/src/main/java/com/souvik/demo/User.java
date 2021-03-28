package com.souvik.demo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {

	private String name;
	private String dept;
	private Long salary;
}
