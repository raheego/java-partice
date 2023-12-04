package day11.collection.list.quiz;

import java.util.Scanner;

class Customers {
	private String name, address, tel;

	//생성자함수
	public Customers() {
		
	}
	public Customers(String name, String address, String tel) {
		this.name = name;
		this.address = address;
		this.tel = tel;
	}
	
	//getter setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	//output
	@Override
	public String toString() {
		return "Customers [name=" + name + ", address=" + address + ", tel=" + tel + "]";
	}
	
	//사용자 정의 함수 
	public void add() {
		
	}
	public void addCustomer() {
		Scanner sc = new Scanner(System.in);
        System.out.println("고객 정보를 입력하세요.");
        System.out.print("이름: ");
        String name = sc.next();
        System.out.print("주소: ");
        String address = sc.next();
        System.out.print("전화번호: ");
        String tel = sc.next();

        Customers customer = new Customers(name, address, tel);
        list.add(customer);
        System.out.println("고객이 추가되었습니다.");
    }
}
