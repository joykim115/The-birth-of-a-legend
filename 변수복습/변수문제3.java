package ��������;

public class ��������3 {

	public static void main(String[] args) {
		int num = 10;
		try {
			System.out.println(10/0);
		} catch (Exception e) {
			//������ �߻��� ������ ó��
			System.out.println("�����߻��ߴ´� ó����");
		}finally {//������ �߻� ������ ������� ������ �����ϰ��� �ϴ� ���
			System.out.println("������ ���½���");
			//�ֿ� ���ó
			//�޸� ������ ���� ���ϰ��� ������ ������ Close!
			//��Ʈ��ũ ������ ����� �ϴ°��!
		}
	}

}
