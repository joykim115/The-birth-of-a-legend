package ����;

public class Me {
/* �ּ��ٴ¹�: ��û ��� ���� �ݵ�� ���� ǥ�� �������
 * �ۼ��� : ������
 * ��¥:2019. 07. 13
 * ��������: �л�
 */
// �ּ��ٴ¹� ���پ� �ϴ°�
	public static void main(String[] args) {
		byte age; //���� =>�޸� ���� Ȯ��(byte 127����)
		age = 100; //= => �Ҵ翬����, ���Կ�����
		int money = 10;
		double weight = 100;
        float eye = 1.3f;
        /*�÷��� �ڿ� f�� �ٿ���� 1.30~���� 
             ���ν��� �޸� ������ ���� ����*/
        char gender = '��';
        String name = "ȫ�浿";
        boolean lunch = true;//false        
        System.out.println("�� �̸���:"+name);
		System.out.println("�� ����: "+age);
		//�տ� ����("") �߰��ϰ� + ���̸� �����
		System.out.println("�� ����:"+money);
		System.out.println("�� �����Դ�:"+weight);
		System.out.println("�� �÷���:"+eye);
		System.out.println("�� ������:" + gender);
		System.out.println("������ ���ְ� ��̳���:"+lunch);
	}
}
