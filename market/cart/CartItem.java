package com.market.cart;

import com.market.bookitem.Book;

public class CartItem {
	//private String[] itemBook=new String[7];
	private Book itemBook;
	private String bookID;
	private int quantity;
	private int totalPrice;
	
	public CartItem() {
	// TODO Auto-generated method stub
	}
	
	/*public CartItem(String[] book) {
		this.itemBook=book;
		this.bookID=book[0];
		this.quantity=1;
		updateTotalPrice();
	}
	public String[] getItemBook() {
		return itemBook;
	}
	public void setITemBook(String[] itemBook) {
		this.itemBook=itemBook;
	}*/
	
	public CartItem(Book booklist) {
		this.itemBook=booklist;
		this.bookID=booklist.getBookId();
		this.quantity=1;
		updateTotalPrice();
	}
	public Book getItemBook() {
		return itemBook;
	}
	public void setItemBook(Book itemBook) {
		this.itemBook=itemBook;
	}
	public void setTotalPrice(int totalPrice) {
		this.totalPrice=totalPrice;
	}
	
	public String getBookID() {
		return bookID;
	}
	public void setBookID(String bookID) {
		this.bookID=bookID;
		this.updateTotalPrice();
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity=quantity;
		this.updateTotalPrice();
	}
	public int getTotalPrice() {
		return totalPrice;
	}
	public void updateTotalPrice() {
		//totalPrice=Integer.parseInt(this.itemBook[2])*this.quantity;
		totalPrice=this.itemBook.getUnitPrice()*this.quantity;
	}
}