package ex1105;

import java.util.Scanner;

class PhysicalInfo {
	String name;
	int height;
	double vision;
	
	public PhysicalInfo(String name, int height, double vision) {
		this.name = name;
		this.height = height;
		this.vision = vision;
	}
}

public class PhysicalInfoEx {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		PhysicalInfo[] pi = new PhysicalInfo[6];
		int[] d = new int[21];
				
		for(int i=0; i<pi.length; i++) {
			pi[i] = new PhysicalInfo(scan.next(), scan.nextInt(), scan.nextDouble());
		}
		
		System.out.printf("평균 키: %.1fcm\n", avgHeight(pi));
		System.out.println("시력 분포");
		
		
		distVision(pi, d); // 해당 시력에 분포하는 사람 수 구하기
		double k=0;
		for(int i=0; i<d.length; i++) {
			System.out.printf("%.1f ~ : %d명\n", k, d[i]);
			k += 0.1;
		}
	}
	
	// 평균 키를 구하여 반환
	public static double avgHeight(PhysicalInfo[] info) {
		double sum = 0;
		for(int i=0; i<info.length; i++) {
			sum += info[i].height;
		}
		
		return sum/info.length;
	}
	
	// dist는 해당 영역에 시력이 분포된 사람의 수를 저장하는 배열
	public static void distVision(PhysicalInfo[] dat, int[] dist) {
	      int cnt = 0;
	      for(int i=0; i<dat.length; i++) {
	         dist[(int)((dat[i].vision)*10)]++; // 해당 시력이 나오면 더해줌
	      }
	   }
	
	// dist는 해당 영역에 시력이 분포된 사람의 수를 저장하는 배열
//	public static void distVision(PhysicalInfo[] dat, int[] dist) {
//		double dd = 0.0;
//		
//		for(int i=0; i<dat.length; i++) {
//			while(dd<=2) {
//				String str = String.valueOf(dd);
//				System.out.println(str.length());
//				String[] s = str.split(".");
//				System.out.println(s[0]);
//				System.out.println(s[1]);
//				
//				int len = s[0].length();
//				int res = (int) Math.pow(10, len);
//				System.out.println(Math.round(Double.parseDouble(s[0])*res/res));
				
//				if(dat[i].vision == (double)dd) {
//					dist[(int)(dd*10)]++;
//				}
//				dd += 0.1;
//			}
		
//			if(dat[i].vision == 0.0) {
//				dist[0]++;
//			} else if(dat[i].vision == 0.1) {
//				dist[1]++;
//			} else if(dat[i].vision == 0.2) {
//				dist[2]++;
//			} else if(dat[i].vision == 0.3) {
//				dist[3]++;
//			} else if(dat[i].vision == 0.4) {
//				dist[4]++;
//			} else if(dat[i].vision == 0.5) {
//				dist[5]++;
//			} else if(dat[i].vision == 0.6) {
//				dist[6]++;
//			} else if(dat[i].vision == 0.7) {
//				dist[7]++;
//			} else if(dat[i].vision == 0.8) {
//				dist[8]++;
//			} else if(dat[i].vision == 0.9) {
//				dist[9]++;
//			} else if(dat[i].vision == 1.0) {
//				dist[10]++;
//			} else if(dat[i].vision == 1.1) {
//				dist[11]++;
//			} else if(dat[i].vision == 1.2) {
//				dist[12]++;
//			} else if(dat[i].vision == 1.3) {
//				dist[13]++;
//			} else if(dat[i].vision == 1.4) {
//				dist[14]++;
//			} else if(dat[i].vision == 1.5) {
//				dist[15]++;
//			} else if(dat[i].vision == 1.6) {
//				dist[16]++;
//			} else if(dat[i].vision == 1.7) {
//				dist[17]++;
//			} else if(dat[i].vision == 1.8) {
//				dist[18]++;
//			} else if(dat[i].vision == 1.9) {
//				dist[19]++;
//			} else {
//				dist[20]++;
//			}
//		}
//		
//	}

}
