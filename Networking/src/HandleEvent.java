import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;



public class HandleEvent implements ActionListener{

JTextField id, name, price, quantity;
JButton add, update, delete, search;
public static Connection con;
public static PreparedStatement statement;

public HandleEvent(JTextField id, JTextField name, JTextField price,
		JTextField quantity, JButton add, JButton update, JButton delete,
		JButton search) {
	this.id=id;
	this.name=name;
	this.price=price;
	this.quantity=quantity;
	this.add = add;
	this.update = update;
	this.delete = delete;
	this.search = search;
	
}
@Override
public void actionPerformed(ActionEvent e) {
	if(e.getSource()==add) {
		connect();
		String productID = id.getText();
		String productName = name.getText();
		String productPrice = price.getText();
		String productQty = quantity.getText();
		try {
			statement = con.prepareStatement("insert into products(productID, productName, productPrice, productQty)values(?,?,?,?)");
		
			int proID = Integer.parseInt(productID);
			statement.setInt(1, proID);
			statement.setString(2, productName);
			int proPrice = Integer.parseInt(productPrice);
			statement.setInt(3, proPrice);
			int proQuantity = Integer.parseInt(productQty);
			statement.setInt(4, proQuantity);
			statement.executeUpdate();
			
			JOptionPane.showInternalMessageDialog(null, "Successfully Added", "Record Added", JOptionPane.INFORMATION_MESSAGE);
			
			id.setText("");
			name.setText("");
			price.setText("");
			quantity.setText("");
			
			con.close();
		} catch(SQLException ex) {
			ex.printStackTrace();
			
		}
	}
	
	if(e.getSource()==update) {
		connect();
		String productID = id.getText();
		String productName = name.getText();
		String productPrice = price.getText();
		String productQty = quantity.getText();
		try {
			statement = con.prepareStatement("update products set productID=?, productName=?, productPrice=?, productQty=? where productID=?");
			int proID = Integer.parseInt(productID);
			statement.setInt(1, proID);
			statement.setString(2, productName);
			int proPrice = Integer.parseInt(productPrice);
			statement.setInt(3, proPrice);
			int proQuantity = Integer.parseInt(productQty);
			statement.setInt(4, proQuantity);
			statement.setInt(5, proID);
			statement.executeUpdate();
			
			JOptionPane.showInternalMessageDialog(null, "Successfully Added", "Record Added", JOptionPane.INFORMATION_MESSAGE);
			
			id.setText("");
			name.setText("");
			price.setText("");
			quantity.setText("");
			
			con.close();
			
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		
	}
	if(e.getSource()== delete) {
		connect();
		String productID=id.getText();
		try {
			statement = con.prepareStatement("delete from products where productID=?");
			int proID = Integer.parseInt(productID);
			statement.setInt(1, proID);
			statement.executeUpdate();
			
			JOptionPane.showInternalMessageDialog(null, "Successfully deleted", "Record Deleted", JOptionPane.INFORMATION_MESSAGE);
			id.setText("");
			name.setText("");
			price.setText("");
			quantity.setText("");
			
			con.close();
			
		} catch (SQLException ex) {
			
		
			ex.printStackTrace();
		
		}
	}
	
	if(e.getSource()==search) {
		connect();
		String productID = id.getText();
		
		try {
			statement = con.prepareStatement("select productName, productPrice, productQty from products where productID=?");
			int proID = Integer.parseInt(productID);
			statement.setInt(1, proID);
			ResultSet rs = statement.executeQuery();
			
			if(rs.next()==true) {
				String proName = rs.getString(1);
				String proPrice = rs.getString(2);
				String proQty = rs.getString(3);
				
				name.setText(proName);
				price.setText(proPrice);
				quantity.setText(proQty);
			} else {
				name.setText("");
				price.setText("");
				quantity.setText("");
				JOptionPane.showMessageDialog(null, "Invalid product ID", "Error", JOptionPane.ERROR_MESSAGE);
			}
			con.close();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		
	}
	
	
}
public void connect() {
	String URL = "jdbc:mysql://localhost:3308/productdata";
	String username = "root";
	String password = "Z@v010ka";
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection(URL, username, password);
		System.out.println("Connecting to Database...");
	} catch (SQLException e) {
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
}

}