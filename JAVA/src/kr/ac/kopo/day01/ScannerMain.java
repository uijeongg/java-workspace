package kr.ac.kopo.day01;


import java.util.Scanner; //���⼭ Scanner�� ������ �ͼ� ����ҰŴ�

public class ScannerMain {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //�����ڷ����̴ϱ� �빮�ڽ���, �׸��� new�� ���� �����
		
		
		
		
		System.out.print("������ �ϳ� �Է��ϼ��� : ");
		int a = sc.nextInt(); //Ű����� �Է¹��� ������ ����ϰ� ���� �� ����ϴ� �޼ҵ�
		
		System.out.println("a : " + a);
		System.out.print("���ڿ��� �Է� : ");
		String str = sc.nextLine(); // ����
		str = sc.nextLine(); // �Է¹��� ���ڿ�
		
		System.out.println("str : " + str);
		//next�� ���� ���� �ϳ��ϳ��� �ν���
		//�׷��� ���ڿ��� Hello World�� ġ�� Hello�� �ν�
		
		System.out.println("���ڿ��� �Է� : ");
		String str1 = sc.nextLine();
		System.out.println("str : " + str1);
		//nextLine���� ���ڿ��ν� �� 
		//�׷��� ���ڿ��� Hello World�� ġ�� Hello World ��� �ν�
		
		
		System.out.println("���ڿ��� �Է� : ");
		char ch = sc.nextLine().charAt(0);   //�� �޼ҵ� ����� �׳� �ϱ�
		System.out.println("ch : " + ch);
		
		
		sc.close();
		
		
		
				
		
	}

}

//��ĳ�ʸ����̶�� ����Ʈ��� ���� �ȳ������� ���ϴ� ������ư�� on
//�ֳĸ� �Է°��� ġ���ߴµ� ���� �װ� �������ϱ� ��ٸ��� �ִ°��� int a = sc.nextInt();
//System.out.print("������ �ϳ� �Է��ϼ��� : "); �׷��� �Է°� �ޱ� ���� �̷��� �� �ϳ� ����� ����
//sc.nextInt(); ó�� sc.next~(); �� �ִµ� sc.nextCha();�� ����