package vn.com.vti.springexam.entity;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class MemberCustomized {
	private String memberId;
	private String lastName;
	private String firstName;
	private Date birthday;
	private String jobTypeName;
}
