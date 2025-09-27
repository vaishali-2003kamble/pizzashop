package com.dkte.pizzashop.tester;

import java.sql.SQLException;
import java.util.Scanner;

import com.dkte.pizzashop.dao.CustomerDAO;
import com.dkte.pizzashop.entities.Customer;

public class Test01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Customer customer = new Customer();
		customer.accept(sc);
		try (CustomerDAO customerDAO = new CustomerDAO()) {
			customerDAO.insertCustomer(customer);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
