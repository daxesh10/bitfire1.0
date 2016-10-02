package project_bitfire;

import java.io.Serializable;
import javax.persistence.*;

@Embeddable
public class Sender implements Serializable {

	//@Id
	@GeneratedValue
	int sender_id;
	
	
	@OneToOne
	@JoinColumns({
		
		@JoinColumn(name="sender_email_id",referencedColumnName="email_id"),
		@JoinColumn(name="sender_user_id",referencedColumnName="user_id")})
	User sender_user_id;
	
	@OneToOne
	@JoinColumns({
		@JoinColumn(name="sender_lable",referencedColumnName="lable")
		,@JoinColumn(name="sender_address_id",referencedColumnName="address_id")
	})
	Address sender_add_id;

	
	
	
	
	
	public int getSender_id() {
		return sender_id;
	}

	public void setSender_id(int sender_id) {
		this.sender_id = sender_id;
	}

	public User getSender_user_id() {
		return sender_user_id;
	}

	public void setSender_user_id(User sender_user_id) {
		this.sender_user_id = sender_user_id;
	}

	public Address getSender_add_id() {
		return sender_add_id;
	}

	public void setSender_add_id(Address sender_add_id) {
		this.sender_add_id = sender_add_id;
	}
	
	




	
	
	
	
	
		
	
	
	
	
}
