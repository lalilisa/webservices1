package service;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import config.DatabaseConnection;
import domain.Card;

public class CardService extends DatabaseConnection{

	
	public Card addCard(Card card) throws ClassNotFoundException, SQLException {
		Connection connection= initializeDatabase();
		 PreparedStatement st = connection
                 .prepareStatement("insert into card_service (owner_name, type, card_number, cvc_number, expried_date) values(?,?,?,?,?)",Statement.RETURN_GENERATED_KEYS);
		 st.setString(1, card.getOwnerName());
		 st.setString(2, card.getType());
		 st.setString(3, card.getCardNumber());
		 st.setString(4, card.getCvcNumber());
		 st.setString(5, card.getExpriedDate());
		 st.executeUpdate();
		 ResultSet rs = st.getGeneratedKeys();
		 Card newCard=new Card();
		 if (rs.next()) {
		   int newId = rs.getInt(1);
		   newCard = getByIdCard(newId);
		 }
         st.close();
         connection.close();
		return newCard;
	}
	public Card getByIdCard(int id) throws ClassNotFoundException, SQLException {
		Connection connection= initializeDatabase();
		 PreparedStatement st = connection
                .prepareStatement("select * from card_service where card_service.id=?");
		 st.setInt(1, id);
		 ResultSet resultSet=st.executeQuery();
		 Card card=new Card();
		 while(resultSet.next()) {
			 card.setId(id);
			 card.setCardNumber(resultSet.getString("card_number"));
			 card.setCvcNumber(resultSet.getString("cvc_number"));
			 card.setExpriedDate(resultSet.getString("expried_date"));
			 card.setType(resultSet.getString("type"));
			 card.setOwnerName(resultSet.getString("owner_name"));
		 }
		return card;
		
	}
}
