package ����ó��;

public class ����ó���׽�Ʈ2 {

	public static void main(String[] args) {
		try {
			//������ �߻��� �� ���� �ڵ�
			int[] num = {1,2}; //num���� 0,1�� �ڸ��� ����
			//���α׷����� 0������ �ڸ��� ���� ��
			num[2] =3; //�����߻�
			//num[2]�� 3�� �ڸ��� �Է��ش޶�� �Ҹ���	
		}catch (Exception e) {	
			//���� ó�� ���� �ڵ� 
			e.printStackTrace();//�����ڵ� ���
			System.out.println("�����߻�");
		}
		System.out.println("���� ����ɱ��?");
	}
}
