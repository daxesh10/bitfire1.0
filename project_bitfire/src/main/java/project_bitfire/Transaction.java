package project_bitfire;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="transactions")
public class Transaction implements Serializable{

	
	@Id
	@GeneratedValue
	int transaction_id;
	
	@Embedded
//	@AttributeOverride(name="sender_id", column = @Column(name="sender_id"))	
//	@JoinColumn(name="sender_user_id")
	Sender sender_id;
	
	
	@Embedded
//	@AttributeOverride(name="sender_id", column = @Column(name="sender_id"))	
//	@JoinColumn(name="sender_user_id")
	Reciver recir_id;

	
	
	int amount;
	
	String bitcoin_add;
	
	
	
	
	public Reciver getRecir() {
	return recir_id;
}

public void setRecir(Reciver recir_id) {
	this.recir_id = recir_id;
}


	public int getTransaction_id() {
		return transaction_id;
	}

	public void setTransaction_id(int transaction_id) {
		this.transaction_id = transaction_id;
	}

	public Sender getSender_id() {
		return sender_id;
	}

	public void setSender_id(Sender sender_id) {
		this.sender_id = sender_id;
	}


	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getBitcoin_add() {
		return bitcoin_add;
	}

	public void setBitcoin_add(String bitcoin_add) {
		this.bitcoin_add = bitcoin_add;
	}
	
	
	
	
	
	
	
}
