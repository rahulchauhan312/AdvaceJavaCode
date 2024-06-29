package com.jspider.jdbc_project_with_architecture.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;

import com.jspider.jdbc_project_with_architecture.connection.ProductConnection;
import com.jspider.jdbc_project_with_architecture.dto.Product;

public class ProductDao {
	Connection connection = ProductConnection.getProductConnection();

	public Product saveProductDao(Product p) {
		String insertQuery = "insert into Product(id,name,price,color,mfd,expd) value(?,?,?,?,?,?)";
		try {
			PreparedStatement prepared = connection.prepareStatement(insertQuery);
			prepared.setInt(1, p.getId());
			prepared.setString(2, p.getName());
			prepared.setDouble(3, p.getPrice());
			prepared.setString(4, p.getColor());
			prepared.setObject(5, p.getMfd());
			prepared.setObject(6, p.getExpd());
			prepared.execute();
			return p;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}

	public Product[] getProductByManufacturingfDateDao(String manufacturingDate) {
		String selectQuery = "SELECT * FROM product WHERE mfd=?";
		try {
			PreparedStatement prepared = connection.prepareStatement(selectQuery);
			prepared.setObject(1, LocalDate.parse(manufacturingDate));

			ResultSet rs = prepared.executeQuery();

			// Product product[] = null;
			Product[] product = new Product[10];
			int i = 0;
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				double price = rs.getDouble("price");
				String color = rs.getString("color");
				LocalDate mfd = rs.getDate("mfd").toLocalDate();
				LocalDate expd = rs.getDate("expd").toLocalDate();

				product[i] = new Product(id, name, price, color, mfd, expd);
				i++;
			}
			return product;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}

	public Product[] getProductByColor(String color) {
		String query = "select * from product where color=?";
		try {
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setString(1, color);
			ResultSet rs = ps.executeQuery();
			Product[] product = new Product[10];
			int i = 0;
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				double price = rs.getDouble("price");
				String color1 = rs.getString("color");
				LocalDate mfd = rs.getDate("mfd").toLocalDate();
				LocalDate expd = rs.getDate("expd").toLocalDate();

				product[i] = new Product(id, name, price, color1, mfd, expd);
				i++;
			}
			return product;

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}

	public int updateProductByColor(double price, String color) {
		Product[] p1 = getProductByColor(color);
		String updateQuery = "update product set price=? where color=?";
		PreparedStatement ps = null;
		int a = 0;
		for (Product product : p1) {
			if (product == null) {
				break;
			}
			product.setPrice(product.getPrice() + price);
			try {
				ps = connection.prepareStatement(updateQuery);
				ps.setDouble(1, product.getPrice());
				ps.setString(2, product.getColor());
				a = ps.executeUpdate();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		return a;

	}

	/**
	 * Delete Method to Delete Product
	 */
	public int deleteProductByIdDao(int productId) {
		String deleteQuery = "delete product where id=?";
		try {
			PreparedStatement ps = connection.prepareStatement(deleteQuery);
			ps.setInt(1, productId);
			ps.executeUpdate();
			return productId;

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return 0;
		}

	}

	/**
	 * Update product color by price
	 */
	public int updateProductColorByPrice(double price, String color) {
		try {
			
			String updateQuery = "update product set color=? where price=?";
			PreparedStatement ps = connection.prepareStatement(updateQuery);
			ps.setString(1, color);
			ps.setDouble(2, price);
		    return ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return 0;
		}
	}
}