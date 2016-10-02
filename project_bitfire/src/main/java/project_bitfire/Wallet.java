package project_bitfire;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="wallets")
public class Wallet implements Serializable {

	@Id
	@GeneratedValue
	int wallet_id;
	
	int seed_prototype;
	
	@OneToOne
	@JoinColumns({@JoinColumn(name="user_id",referencedColumnName="user_id")
	,@JoinColumn(name="name",referencedColumnName="name")})		
	User user;

	@OneToMany(fetch=FetchType.LAZY)	
	List<Address> address;

	
	@JoinColumns({
		@JoinColumn(name="address_id",referencedColumnName="address_id"
				,table="addresses",nullable=false),
		@JoinColumn(name="address_key",referencedColumnName="address_value"
				,table="addresses",nullable=false)})
	public List<Address> getAddress() {
		return address;
	}

	
	public void setAddress(List<Address> address) {
		this.address = address;
	}
	
	
	/*
	@OneToMany(fetch=FetchType.LAZY)
		List<Address> address;
	
	
	@JoinColumns({
		@JoinColumn(name="address_id",referencedColumnName="address_id"
				,table="addresses",nullable=false),
		@JoinColumn(name="address_key",referencedColumnName="address_value"
				,table="addresses",nullable=false)
	
		
	})
	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}
*/
	
	public int getWallet_id() {
		return wallet_id;
	}

	public void setWallet_id(int wallet_id) {
		this.wallet_id = wallet_id;
	}

	
	public int getSeed_prototype() {
		return seed_prototype;
	}

	public void setSeed_prototype(int seed_prototype) {
		this.seed_prototype = seed_prototype;
	}

	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
	
	
	
	
	
	
	
}
