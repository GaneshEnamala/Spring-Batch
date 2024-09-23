package springbatch.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "Customer_Info")
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

	@Id
	@Column(name = "Customer_Id")
	private Integer id;
	
	@Column(name = "First_Name")
	private String firstName;
	
	@Column(name = "Last_Name")
	private String lastName;
	
	@Column(name = "Email")
	private String email;
	
	@Column(name = "Gender")
	private String gender;
	
	@Column(name = "Contact_Number")
	private String contactNo;
	
	@Column(name = "Country")
	private String country;
	
	@Column(name = "DOB")
	private String dob;
}
