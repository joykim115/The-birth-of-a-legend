package ��������;

public class ���� {
	
	//��������(�۷ι� ����, Global variable)
	//�ڵ� �ʱ�ȭ
	String accountName; // ���¸�
	String name;//����̸�
	int money;//�ʱ��Աݾ�
	
	//��ü ������ �ڵ� ȣ�� �޼ҵ�
	//������
	public ����(String accountName, String name, int money) {
		super();
		this.accountName = accountName;
		this.name = name;
		this.money = money;
		System.out.println(this.money);
		//��������
	}

	@Override
	public String toString() {
		return "���� [accountName=" + accountName + ", name=" + name + ", money=" + money + "]";
	}
	

}
