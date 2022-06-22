package com.naver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

class NaverException extends Exception {

	private static final long serialVersionUID = 1L;

	public NaverException(String message) {
		super(message);
	}

}

public class NaverImpl implements Naver {

	List<NaverVO> list = new ArrayList<>();
	NaverVO vo;

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	private int input(int n) throws NaverException {

		int input = 0;
		try {
			try {

				input = Integer.parseInt(br.readLine());

			} catch (Exception e) {
				throw new NaverException("�߸� �Է� : ���ڸ� �Է����ּ���");
			}

			if (input < 1 || input > n) {
				throw new NaverException("�߸� �Է� : ������ ���ڸ� �Է����ּ���");
			}

		} catch (Exception e) {
			System.out.println(e.toString());
		}

		return input;
	}

	@Override
	public void printMain() throws IOException, NaverException {

		System.out.print("1.ȸ������ 2.ȸ��Ż�� 3.ȸ����ü��� 4.���̵�˻� 5.��й�ȣ���� 6.���� ");
		int n = input(5);

		switch (n) {
		case 1:
			SignUp();
			break;
		case 2:
			delect();
			break;
		case 3:
			print();
			break;
		case 4:
			findId();
			break;
		case 5:
			updatePw();
			break;
		case 6:
			System.out.println("�ý��� ����");
			System.exit(0);
		}

	}

	@Override
	public void SignUp() throws IOException, NaverException {

		vo = new NaverVO();

		chackId();
		chackPw();
		chackName();
		chackGender();
		chackBirth();
		chackEmail();
		chacktel();

		list.add(vo);

	}

	@Override
	public void chackId() throws IOException {

		boolean result = false;
		String id = null;

		do {

			int num = 0, eng = 0;

			System.out.print("���̵�? ");
			id = br.readLine();

			try {

				if (id.length() < 8 || id.length() > 15) {
					throw new NaverException("���̵�� 8~15�� �̳�");
				}

				for (int i = 0; i < id.length(); i++) {
					char ch = id.charAt(i);

					if (ch >= '0' && ch <= '9') {
						num++;
					} else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
						eng++;
					}
				}

				if (num < 1 || eng < 1) {
					throw new NaverException("������ ���� ȥ��");
				}

				result = true;

			} catch (Exception e) {
				System.out.println(e.toString());
			}

		} while (!result);

		vo.setId(id);

	}

	@Override
	public void chackPw() throws IOException, NaverException {

		boolean result = false;
		String pw = null;

		do {
			try {

				System.out.print("��й�ȣ? ");
				pw = br.readLine();
				System.out.print("��й�ȣ Ȯ��? ");

				if (!pw.equals(br.readLine())) {
					throw new NaverException("��й�ȣ�� �ٸ�");
				}

				result = true;

			} catch (Exception e) {
				System.out.println(e.toString());
			}

		} while (!result);

		vo.setPw(pw);

	}

	@Override
	public void chackName() throws IOException {

		boolean result = false;
		String name = null;

		do {
			try {
				System.out.print("�̸�? ");
				name = br.readLine();

				for (int i = 0; i < name.length(); i++) {
					char ch = name.charAt(i);
					if ((ch < 'a' || ch > 'z') && (ch < 'A' || ch > 'Z')) {
						throw new Exception("�̸��� �����ڸ� ����");
					}
				}

				result = true;

			} catch (Exception e) {
				System.out.println(e.toString());
			}

		} while (!result);

		vo.setName(name);

	}

	@Override
	public void chackGender() throws IOException, NaverException {

		boolean result = false;

		int num = 0;
		do {
			try {
				System.out.print("����[1.���� 2.����]?");
				String str = br.readLine();

				try {
					num = Integer.parseInt(str);
				} catch (Exception e) {
					throw new NaverException("���ڷ� �Է�");
				}

				if (num < 1 || num > 2) {
					throw new NaverException("1�Ǵ� 2�� �Է�");
				}

				result = true;

			} catch (Exception e) {
				System.out.println(e.toString());
			}

		} while (!result);

		if (num == 1) {
			vo.setGender("����");
		} else if (num == 2) {
			vo.setGender("����");
		}

	}

	@Override
	public void chackBirth() throws IOException, NaverException {

		boolean result = false;
		String birth;

		do {

			System.out.print("����[yyyymmdd]?");
			birth = br.readLine();

			try {
				try {
					@SuppressWarnings("unused")
					int n = Integer.parseInt(birth);
				} catch (Exception e) {
					throw new NaverException("���ڷ� �Է�");
				}

				if (birth.length() != 8) {
					throw new NaverException("��������� 8���ڷ� �Է�(yyyymmdd)");
				}

				Calendar cal = Calendar.getInstance();
				int year, month, day;
				year = Integer.parseInt(birth.substring(0, 4));
				month = Integer.parseInt(birth.substring(4, 6));
				day = Integer.parseInt(birth.substring(6));
				cal.set(year, month - 1, Calendar.DATE);

				if (year < 1900) {
					throw new NaverException("1900�⵵ �̻�");
				}

				if (month < 1 || month > 12) {
					throw new NaverException("���� �߸��Է�");
				}

				if (day < 1 || day > cal.getActualMaximum(Calendar.DATE)) {
					throw new NaverException("���� �߸��Է�");
				}

				result = true;

			} catch (Exception e) {
				System.out.println(e.toString());
			}

		} while (!result);

		vo.setBirth(Integer.parseInt(birth));

	}

	@Override
	public void chackEmail() throws IOException, NaverException {

		boolean result = false;
		String email = null;

		do {
			System.out.print("�̸���?[xxx@xxx.xxx] ");
			email = br.readLine();
			try {

				if (email.indexOf("@") < 0) {
					throw new NaverException("�̸��� ������ ���� ����");
				}

				if (email.indexOf(".") < 0 || email.indexOf(".") < email.indexOf("@")) {
					throw new NaverException("�̸��� ������ ���� ����");
				}

				result = true;

			} catch (Exception e) {
				System.out.println(e.toString());
			}

		} while (!result);

		vo.setEmail(email);

	}

	@Override
	public void chacktel() throws IOException, NaverException {

		boolean result = false;
		int tel = 0;

		do {
			try {
				System.out.print("��ȸ��ȣ?[xxxxxxxx] ");
				String str = br.readLine();

				if (str.length() != 8) {
					throw new NaverException("8�ڷ� �Է�");
				}

				try {
					tel = Integer.parseInt(str);
				} catch (Exception e) {
					throw new NaverException("���ڷ� �Է����ּ���");
				}

				result = true;

			} catch (Exception e) {
				System.out.println(e.toString());
			}

		} while (!result);

		vo.setTel(tel);

	}

	@Override
	public void delect() throws IOException {

		boolean result = false;

		try {
			chackId();
			String id = vo.getId();
			chackPw();
			String pw = vo.getPw();

			Iterator<NaverVO> it = list.iterator();
			while (it.hasNext()) {
				vo = it.next();

				if (id.equals(vo.getId()) && pw.equals(vo.getPw())) {
					list.remove(vo);
					System.out.println("���� �Ϸ�");
				}
			}

			result = true;

		} catch (NaverException e) {
			System.out.println(e.toString());
		}

		if (!result) {
			System.out.println("��ġ�ϴ� ����������");
		}
		
	}

	@Override
	public void print() {

		Iterator<NaverVO> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next().toString());
		}

	}

	@Override
	public void findId() throws IOException, NaverException {

		boolean result = false;

		try {
			chackName();
			String name = vo.getName();
			chacktel();
			int tel = vo.getTel();

			Iterator<NaverVO> it = list.iterator();
			while (it.hasNext()) {
				vo = it.next();

				if (name.equals(vo.getName()) && tel == vo.getTel()) {
					System.out.println(vo.toString());
					result = true;
				}
			}

		} catch (Exception e) {
			System.out.println(e.toString());
		}

		if (!result) {
			System.out.println("��ġ�ϴ� ������ ����");
		}

	}

	@Override
	public void updatePw() {
	}

}
