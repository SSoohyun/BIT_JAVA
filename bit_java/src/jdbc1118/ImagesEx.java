package jdbc1118;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Blob;

public class ImagesEx {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/scottdb?useSSL=false", "scott", "tiger"); // 연결

			// db 저장
//			String sql = "insert into images values(?, ?)";
//			PreparedStatement ps = conn.prepareStatement(sql);
//			ps.setString(1, "conan");
//			FileInputStream fin = new FileInputStream("c:/temp/conan.jpg");
//			ps.setBinaryStream(2, fin, fin.available());
//			int i = ps.executeUpdate();
//			System.out.println(i + "개의 레코드가 삽입됨");
//			
			// 복사
			PreparedStatement ps = conn.prepareStatement("select * from images");
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				Blob b = (Blob) rs.getBlob(2);
				byte barr[] = b.getBytes(1, (int)b.length());
				FileOutputStream fout = new FileOutputStream("c:/temp/conan1.jpg");
				fout.write(barr);
				fout.close();
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
