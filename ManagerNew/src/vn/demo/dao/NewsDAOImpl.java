package vn.demo.dao;

import java.util.Scanner;

import vn.demo.idao.INewsDAO;

public class NewsDAOImpl implements INewsDAO {
		public static Scanner scanner = new Scanner(System.in);
	@Override
	public void addNews() {
		System.out.println("id: ");
		int id = scanner.nextInt();
		System.out.println("category_id: ");
		int category_id = scanner.nextInt();
		System.out.println("name: ");
		String name = scanner.next();
		System.out.println("description: ");
		String description = scanner.next();
		System.out.println("detail: ");
		String detail = scanner.next();
		System.out.println("image: ");
		String image = scanner.next();
		System.out.println("date: ");
		int date = scanner.nextInt();
		System.out.println("user_id: ");
		int user_id = scanner.nextInt();
	
	}

	@Override
	public void deteleNewsByName() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void findNewsByName() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getNews() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateNewsByName() {
		// TODO Auto-generated method stub
		
	}

}
