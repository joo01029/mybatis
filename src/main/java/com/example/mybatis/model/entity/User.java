package com.example.mybatis.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

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

//	@OneToMany(mappedBy = "user")
//	private List<Board> boards;

	public User(){

	}
	public User(String name, String part){
		this.name = name;
		this.part = part;
	}
}
