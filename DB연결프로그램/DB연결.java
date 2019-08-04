package DB연결프로그램;

import java.sql.*;

import javax.swing.JOptionPane;

public class DB연결 {

	public static void main(String[] args) throws Exception {
		//1. 커넥터 설정
		Class.forName("com.mysql.jdbc.Driver");//DB를 연동 커넥터		
		System.out.println("1. 커넥터 설정 OK...");
		//2. DB연결
		String url = "jdbc:mysql://localhost:3366/shop";
		String username = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("2.DB연동성공");
		//3. SQL문 결정
		String id = JOptionPane.showInputDialog("아이디입력");
		String pw = JOptionPane.showInputDialog("비밀번호입력");
		String name = JOptionPane.showInputDialog("이름입력");
		String tel = JOptionPane.showInputDialog("전화번호입력");
		String sql ="insert into member values(?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1,	id);
		ps.setString(2,	pw);
		ps.setString(3,	name);
		ps.setString(4,	tel);
		System.out.println("3.SQL문 설정 성공");
		//4. SQL문 실행 요청
		ps.executeUpdate();
		System.out.println("4.SQL문 실행 요청 성공");
	}

}
