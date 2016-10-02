package project_bitfire;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name="users")
public class User implements Serializable {

	
@Id
@GeneratedValue(strategy=GenerationType.SEQUENCE)
int user_id;

String email_id;
String name;
String password;

@OneToOne
@JoinColumn(name="wallet_id")
Wallet wallet_id;


@OneToMany
List<Transaction> tran_list;







@JoinColumns({
	@JoinColumn(name="transaction_id",referencedColumnName="transaction_id")
	,@JoinColumn(name="sender_id",referencedColumnName="sender_id")
	,@JoinColumn(name="recir_id",referencedColumnName="recir_id")
	,@JoinColumn(name="amount",referencedColumnName="amount") })
public List<Transaction> getTran_list() {
	return tran_list;
}


public void setTran_list(List<Transaction> tran_list) {
	this.tran_list = tran_list;
}



public Wallet getWallet_id() {
	return wallet_id;
}
public void setWallet_id(Wallet wallet_id) {
	this.wallet_id = wallet_id;
}


public int getUser_id() {
	return user_id;
}
public void setUser_id(int user_id) {
	this.user_id = user_id;
}
public String getEmail_id() {
	return email_id;
}
public void setEmail_id(String email_id) {
	this.email_id = email_id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
	






}
