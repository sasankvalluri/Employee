package com.kony.employee.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "users")
public class Employee {
	    @Column(name="id")
	    private int id;
	  
	    @Column(name="first_name")
	    private String firstName;
	    
	    @Column(name="last_name")
	    private String lastName;
	    
	    @Temporal(TemporalType.DATE)
	    @Column(name="date_of_joining")
	    private Date dateOfJoining;
	    
	    @Temporal(TemporalType.DATE)
	    @Column(name="date_of_exit")
	    private Date dateOfExit;
	    
	    @Column(name="designation")
	    private String designation;

	    public Employee() {
	    }

	    public Employee(int id, String firstName, String lastName,Date dateOfJoining, Date dateOfExit,String designation) {
	        this.id = id;
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.dateOfJoining = dateOfJoining;
	        this.dateOfExit = dateOfExit;
	        this.designation = designation;
	    }
	    
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    public int getId() {
	        return id;
	    }
	    
	    public void setId(Integer id) {
			this.id=id;
		}
	    
		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public Date getDateOfJoining() {
			return dateOfJoining;
		}

		public void setDateOfJoining(Date dateOfJoining) {
			this.dateOfJoining = dateOfJoining;
		}

		public Date getDateOfExit() {
			return dateOfExit;
		}

		public void setDateOfExit(Date dateOfExit) {
			this.dateOfExit = dateOfExit;
		}

		public String getDesignation() {
			return designation;
		}

		public void setDesignation(String designation) {
			this.designation = designation;
		}

		
	    




}

