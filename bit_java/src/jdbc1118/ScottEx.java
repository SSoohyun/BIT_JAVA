package jdbc1118;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ScottEx {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/scottdb?useSSL=false", "scott", "tiger"); // ¿¬°á
			
			
			// 1
			/*
			String sql = "select deptno from emp group by deptno having avg(sal) >= all (select avg(sal) from emp group by deptno) or avg(sal) <= all(select avg(sal) from emp group by deptno);";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				System.out.printf("%d \n", rs.getInt(1));
			}
			*/
			
			
			// 2
			/*
			String sql = "select job, avg(sal) from emp where job != 'SALESMAN' group by job having sum(sal) >= 3000 order by avg(sal) desc;";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				System.out.printf("%s %.1f\n", rs.getString(1), rs.getDouble(2));
			}
			*/
			
			// 3
			/*
			String sql = "select count(empno) from emp where mgr is not null;";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				System.out.printf("%d \n", rs.getInt(1));
			}
			*/
			
			// 4
			/*
			String sql = "select ename, sal, comm, sal+comm 'ÃÑ¾×' from emp where comm is not null order by 'ÃÑ¾×' desc;";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				System.out.printf("%s %d %d %d\n", rs.getString(1), rs.getInt(2), rs.getInt(3), rs.getInt(4));
			}
			*/
			
			// 5
			/*
			String sql = "select deptno, job, count(empno) from emp group by deptno, job;";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				System.out.printf("%d %s %d\n", rs.getInt(1), rs.getString(2), rs.getInt(3));
			}
			*/
			
			// 6
			/*
			String sql = "select dept.dname from dept left join emp on dept.deptno = emp.deptno group by dept.deptno having count(empno) = 0;";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				System.out.printf("%s \n", rs.getString(1));
			}
			*/
			
			// 7
			/*
			String sql = "select job, count(empno) from emp group by job having count(empno) >= 4;";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				System.out.printf("%s %d\n", rs.getString(1), rs.getInt(2));
			}
			*/
			// 8
			String sql = "select ename from emp where empno between 7400 and 7600;";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				System.out.printf("%s \n", rs.getString(1));
			}
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
	}

}
