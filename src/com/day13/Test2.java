package com.day13;

interface Test{
	public int total();
	public void write();
}

class TestImpl implements Test{

	private String hak,name;
	private int kor,eng;
	
	public TestImpl(){}
	
	public TestImpl(String hak, String name, int kor, int eng) {
		this.hak = hak;
		this.name = name;
		this.eng = eng;
		this.kor = kor;
	}
	
	public void set(String hak, String name, int kor, int eng) {
		this.hak = hak;
		this.name = name;
		this.eng = eng;
		this.kor = kor;
	}

	@Override
	public int total() {
		return kor + eng;
	}

	@Override
	public void write() {
		System.out.println(hak + ":" + name +":"+total());
	}

	@Override
	public boolean equals(Object ob) { //UPCAST  TestImpl ob1.equals(ob2) TestImpl 
		boolean flag = false;
		
		if(ob instanceof TestImpl) { 
			//ob의 데이터타입이 TestImpl 맞으면 True, 아니면 false
			
			TestImpl t = (TestImpl)ob; //DOWNCAST //t==ob2
			
			if(this.hak.equals(t.hak) && name.equals(t.name)) {
				//ob1의 hak == ob2 hak && ob1 name == ob2 name
				flag = true;
			}
		}
		return flag;
	}
}


public class Test2 {

	public static void main(String[] args) {
		//인터페이스 !=  클래스 
		Test ob1 = new TestImpl("1111","배수지", 80,90);
		TestImpl ob2 = new TestImpl("1111","배수지", 100,100);
		if(ob1.equals(ob2)) //Object -> TestImpl
			//object's equals : Test의 조상이 Object 이므로 사용 가능하다.
			System.out.println("ob1 && ob2 is ==");
		else
			System.out.println("ob1 && ob2 is !="); //boolean equals 제거시 결과 값 
		
		ob1.write();
		ob2.write();
		
	}

}
