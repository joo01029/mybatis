package com.example.mybatis.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table
@Getter
@Setter
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column
	private String name;

	@Column
	private String part;

	public User(){

	}
	public User(String name, String part){
		this.name = name;
		this.part = part;
	}
}
