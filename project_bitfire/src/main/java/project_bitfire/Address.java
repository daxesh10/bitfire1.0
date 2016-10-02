package project_bitfire;

import java.io.Serializable;
import javax.persistence.*;


@Entity
@Table(name="addresses")
public class Address implements Serializable {

	@Id
	@GeneratedValue
	int address_id;
	
	String lable;
	String address_value;
	
	@ManyToOne
	@JoinColumn(name="wallet_id",referencedColumnName="wallet_id")
	Wallet wallet;
	
	
	
	
	
	
	
	
	
	
	
	/*@ManyToOne	
	@JoinColumns({
		@JoinColumn(name="wallet_id",referencedColumnName="wallet_id",nullable=false),
		@JoinColumn(name="user_id",referencedColumnName="user_id",nullable=false)
	})
	Wallet wallet_id;
	
	
	
	
	public Wallet getWallet_id() {
		return wallet_id;
	}
	
	
	
	public void setWallet_id(Wallet wallet_id) {
		this.wallet_id = wallet_id;
	}
	\
	
	*
	*
	
	*/
	
	
	public int getAddress_id() {
		return address_id;
	}
	public void setAddress_id(int address_id) {
		this.address_id = address_id;
	}
	public String getLable() {
		return lable;
	}
	public void setLable(String lable) {
		this.lable = lable;
	}
	public String getAddress_value() {
		return address_value;
	}
	public void setAddress_value(String address_value) {
		this.address_value = address_value;
	}
	
	
	
	
	
}
