package org.sample.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class CustomerEntity {
	
	@Id
	private int id;
	
	@Column(name="custid")
	private int custid;
	
	@Column(name="custname")
	private String custname;
	
	@Column(name="custstatus")
	private String custstatus;
	
	

	public CustomerEntity() {
		
	}



	public CustomerEntity(int id, int custid, String custname, String custstatus) {
	
		this.id = id;
		this.custid = custid;
		this.custname = custname;
		this.custstatus = custstatus;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public int getCustid() {
		return custid;
	}



	public void setCustid(int custid) {
		this.custid = custid;
	}



	public String getCustname() {
		return custname;
	}



	public void setCustname(String custname) {
		this.custname = custname;
	}



	public String getCuststatus() {
		return custstatus;
	}



	public void setCuststatus(String custstatus) {
		this.custstatus = custstatus;
	}



	@Override
	public String toString() {
		return "CustomerEntity [id=" + id + ", custid=" + custid + ", custname=" + custname + ", custstatus="
				+ custstatus + "]";
	}
	
	
	
}
