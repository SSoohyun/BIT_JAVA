package hw1109;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

interface Employee {
	void showName(); // 이름 출력

	int getPay(); // 급여 반환

	void showSalaryInfo(); // 이름 : 급여 출력
}

abstract class Worker implements Employee {
	protected String name;

	public Worker(String name) {
		super();
		this.name = name;
	}

	public void showName() {
		System.out.println(name);
	}
}

class PernamentWorker extends Worker {
	public int salary;

	public PernamentWorker(String name, int salary) {
		super(name);
		this.salary = salary;
	}

	@Override
	public int getPay() {
		return salary;
	}

	@Override
	public void showSalaryInfo() {
		super.showName();
		System.out.printf("%s의 급여는 %d원\n", name, salary);
	}
}

class TemporaryWorker extends Worker {
	public int payPerHour;
	public int workTime;

	public TemporaryWorker(String name, int workTime, int payPerHour) {
		super(name);
		this.workTime = workTime;
		this.payPerHour = payPerHour;
	}

	@Override
	public int getPay() {
		return workTime * payPerHour;
	}

	@Override
	public void showSalaryInfo() {
		super.showName();
		System.out.printf("%s의 근무시간은 %d, 시간당 수당은 %d원, 급여는 %d원\n", name, workTime, payPerHour, getPay());
	}
}

class SalesWorker extends PernamentWorker {
	public int salesAmount;
	public double bonusRatio;

	public SalesWorker(String name, int salary, int salesAmount, double bonusRatio) {
		super(name, salary);
		this.salesAmount = salesAmount;
		this.bonusRatio = bonusRatio * 0.01;
	}

	@Override
	public int getPay() {
		return (int) (salary + salesAmount * bonusRatio);
	}

	@Override
	public void showSalaryInfo() {
		super.showName();
		System.out.printf("%s의 급여는 %d원, 판매량은 %d, 커미션은 %.2f, 총 급여는 %d원\n", name, salary, salesAmount, bonusRatio,
				getPay());
	}
}

class ManagerService {
	private List<Worker> workers;

	public ManagerService() {
		super();
		workers = new ArrayList<Worker>(); // 리스트 생성
	}

	public void addWorker(Worker worker) {
		workers.add(worker); // 사원을 리스트에 추가
	}

	public void showAllSalaryInfo() {
		for (Worker w : workers) {
			w.showSalaryInfo();
		}
	}

	public void showSalaryInfo(String name) {
		boolean flag = true;
		for (Worker w : workers) {
			if (w.name.equals(name)) {
				flag = false;
				w.showSalaryInfo();
			}
		}

		if (flag) {
			System.out.println("존재하지 않는 사원입니다.");
		}
	}

	public void showTotalSalary() {
		int pay = 0;
		for (Worker w : workers) {
			pay += w.getPay();
		}
		System.out.printf("전 사원의 급여 총 액은 %d원임\n", pay);
	}
}

public class EmployeeEx {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int menu = 0; // 메뉴 번호

		ManagerService ms = new ManagerService(); // 사원 정보를 저장할 리스트

		BREAK: // 프로그램 종료 시 무한루프를 탈출
		while (true) {
			System.out.println("1.사원 추가 | 2.급여 조회 | 3.모든 사원 급여정보 조회 | 4.급여 총액 | 5.프로그램 종료 >> ");
			System.out.print("메뉴를 선택하세요 >> ");
			menu = scan.nextInt();

			// 메뉴 선택에 따라
			switch (menu) {
			case 1: // 사원 정보 추가
				System.out.print("고용 형태를 선택하세요(1. 일반 정규직 | 2. 영업 정규직 | 3. 아르바이트) >> ");
				int em = scan.nextInt(); // 고용 형태

				// 저장
				switch (em) {
				case 1:
					System.out.print("이름, 급여 순으로 입력하세요 >> ");
					ms.addWorker(new PernamentWorker(scan.next(), scan.nextInt()));
					break;
				case 2:
					System.out.print("이름, 급여, 판매량, 커미션 순으로 입력하세요 >> ");
					ms.addWorker(new SalesWorker(scan.next(), scan.nextInt(), scan.nextInt(), scan.nextDouble()));
					break;
				case 3:
					System.out.print("이름, 근무시간, 시간당 수당 순으로 입력하세요 >> ");
					ms.addWorker(new TemporaryWorker(scan.next(), scan.nextInt(), scan.nextInt()));
					break;
				}

				break;
			case 2: // 해당 사원 급여 조회
				System.out.print("조회할 사원의 이름을 입력하세요 >> ");
				String name = scan.next();
				// 출력
				ms.showSalaryInfo(name);
				break;
			case 3: // 모든 사원 급여 정보 조회
				// 전체 출력
				ms.showAllSalaryInfo();
				break;
			case 4: // 전 사원의 급여 총액
				// 총액 출력
				ms.showTotalSalary();
				break;
			case 5: // 프로그램 종료
				System.out.println("프로그램이 종료되었습니다.");
				break BREAK; // 루프 탈출
			}
		}
	}

}