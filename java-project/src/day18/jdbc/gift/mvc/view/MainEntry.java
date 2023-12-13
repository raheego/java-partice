package day18.jdbc.gift.mvc.view;

import java.sql.SQLException;

import day18.jdbc.gift.mvc.controller.GiftController;

public class MainEntry {
	public static void main(String[] args) throws SQLException {
		GiftController.connect(); //DB연결
		GiftController.menu(); //메뉴 호출
	}
}
