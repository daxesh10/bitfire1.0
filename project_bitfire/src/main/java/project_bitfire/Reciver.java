package project_bitfire;

import java.io.Serializable;
import javax.persistence.*;


@Embeddable
public class Reciver implements Serializable {

	
	
//	@Id
	@GeneratedValue
	int rec_id;
	
	
	@OneToOne
	@JoinColumns({
		
		@JoinColumn(name="rec_email_id",referencedColumnName="email_id"),
		@JoinColumn(name="rec_user_id",referencedColumnName="user_id")})
	User rec_user_id;
	
	@OneToOne
	@JoinColumns({
		@JoinColumn(name="rec_lable",referencedColumnName="lable")
		,@JoinColumn(name="rec_address_id",referencedColumnName="address_id")
	})
	Address rec_add_id;

	public int getRec_id() {
		return rec_id;
	}

	public void setRec_id(int rec_id) {
		this.rec_id = rec_id;
	}

	public User getRec_user_id() {
		return rec_user_id;
	}

	public void setRec_user_id(User rec_user_id) {
		this.rec_user_id = rec_user_id;
	}

	public Address getRec_add_id() {
		return rec_add_id;
	}

	public void setRec_add_id(Address rec_add_id) {
		this.rec_add_id = rec_add_id;
	}
	
	
	
	
	
	
	
	
}
