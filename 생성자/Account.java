package ������;

public class Account {
		String no; // ���¹�ȣ
		String name; // ������
		int total; // �Աݾ�
		public Account(String no, String name, int total) {
			this.no = no;
			this.name = name;
			this.total = total;
		}
		
		@Override
		public String toString() {
		// TODO Auto-generated method stub
		return no + "  " + name + "  " + total;
		}
		
	}
