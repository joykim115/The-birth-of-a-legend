package ����ó��;

public class ���� {
	
	//����ó��
	public void zero() {
		try {
			System.out.println(4/0);	
		} catch (Exception e) {
			System.out.println("����ó��");	
			// TODO: handle exception
		}
	}
	
	//ó���� array�� �θ� ������ ���ѱ�
	public void array() throws Exception{
		int[] num = {1,2};
		num[2] = 3;
	}

}
