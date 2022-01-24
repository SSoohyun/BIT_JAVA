package hw1109;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

interface Employee {
	void showName(); // �̸� ���

	int getPay(); // �޿� ��ȯ

	void showSalaryInfo(); // �̸� : �޿� ���
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
		System.out.printf("%s�� �޿��� %d��\n", name, salary);
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
		System.out.printf("%s�� �ٹ��ð��� %d, �ð��� ������ %d��, �޿��� %d��\n", name, workTime, payPerHour, getPay());
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
		System.out.printf("%s�� �޿��� %d��, �Ǹŷ��� %d, Ŀ�̼��� %.2f, �� �޿��� %d��\n", name, salary, salesAmount, bonusRatio,
				getPay());
	}
}

class ManagerService {
	private List<Worker> workers;

	public ManagerService() {
		super();
		workers = new ArrayList<Worker>(); // ����Ʈ ����
	}

	public void addWorker(Worker worker) {
		workers.add(worker); // ����� ����Ʈ�� �߰�
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
			System.out.println("�������� �ʴ� ����Դϴ�.");
		}
	}

	public void showTotalSalary() {
		int pay = 0;
		for (Worker w : workers) {
			pay += w.getPay();
		}
		System.out.printf("�� ����� �޿� �� ���� %d����\n", pay);
	}
}

public class EmployeeEx {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int menu = 0; // �޴� ��ȣ

		ManagerService ms = new ManagerService(); // ��� ������ ������ ����Ʈ

		BREAK: // ���α׷� ���� �� ���ѷ����� Ż��
		while (true) {
			System.out.println("1.��� �߰� | 2.�޿� ��ȸ | 3.��� ��� �޿����� ��ȸ | 4.�޿� �Ѿ� | 5.���α׷� ���� >> ");
			System.out.print("�޴��� �����ϼ��� >> ");
			menu = scan.nextInt();

			// �޴� ���ÿ� ����
			switch (menu) {
			case 1: // ��� ���� �߰�
				System.out.print("��� ���¸� �����ϼ���(1. �Ϲ� ������ | 2. ���� ������ | 3. �Ƹ�����Ʈ) >> ");
				int em = scan.nextInt(); // ��� ����

				// ����
				switch (em) {
				case 1:
					System.out.print("�̸�, �޿� ������ �Է��ϼ��� >> ");
					ms.addWorker(new PernamentWorker(scan.next(), scan.nextInt()));
					break;
				case 2:
					System.out.print("�̸�, �޿�, �Ǹŷ�, Ŀ�̼� ������ �Է��ϼ��� >> ");
					ms.addWorker(new SalesWorker(scan.next(), scan.nextInt(), scan.nextInt(), scan.nextDouble()));
					break;
				case 3:
					System.out.print("�̸�, �ٹ��ð�, �ð��� ���� ������ �Է��ϼ��� >> ");
					ms.addWorker(new TemporaryWorker(scan.next(), scan.nextInt(), scan.nextInt()));
					break;
				}

				break;
			case 2: // �ش� ��� �޿� ��ȸ
				System.out.print("��ȸ�� ����� �̸��� �Է��ϼ��� >> ");
				String name = scan.next();
				// ���
				ms.showSalaryInfo(name);
				break;
			case 3: // ��� ��� �޿� ���� ��ȸ
				// ��ü ���
				ms.showAllSalaryInfo();
				break;
			case 4: // �� ����� �޿� �Ѿ�
				// �Ѿ� ���
				ms.showTotalSalary();
				break;
			case 5: // ���α׷� ����
				System.out.println("���α׷��� ����Ǿ����ϴ�.");
				break BREAK; // ���� Ż��
			}
		}
	}

}