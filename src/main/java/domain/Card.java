package domain;

import java.util.Date;

public class Card {
	
	private int id;
	
	private String ownerName;
	
	private String type;
	
	private String cardNumber;
	
	private String cvcNumber;
	
	private String expriedDate;

	public Card() {
		
	}
	public Card(String ownerName, String type, String cardNumber, String String, String expriedDate) {
		super();
		this.ownerName = ownerName;
		this.type = type;
		this.cardNumber = cardNumber;
		this.cvcNumber = cvcNumber;
		this.expriedDate = expriedDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getCvcNumber() {
		return cvcNumber;
	}

	public void setCvcNumber(String cvcNumber) {
		this.cvcNumber = cvcNumber;
	}

	public String getExpriedDate() {
		return expriedDate;
	}

	public void setExpriedDate(String expriedDate) {
		this.expriedDate = expriedDate;
	}
	@Override
	public String toString() {
		return "Card [id=" + id + ", ownerName=" + ownerName + ", type=" + type + ", cardNumber=" + cardNumber
				+ ", cvcNumber=" + cvcNumber + ", expriedDate=" + expriedDate + "]";
	}
	
	
}
