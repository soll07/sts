package studyfile;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;

class Calculator extends Frame{
	private Label dispL, inputL;  //dispL와 input 이라는 레이블 필드 생성
	private Button[] button;	//18개의 버튼 배열 생성
	
	public Calculator() {
		super("미니계산");
		
		Panel whole = new Panel();	//마지막에 모든 판넬을 합칠 최종 판	
		
		Panel p1 = new Panel();
		Panel p2 = new Panel();
		Panel p3 = new Panel();
		Panel p4 = new Panel();
		Panel p5 = new Panel();
		Panel p6 = new Panel();
		Panel p7 = new Panel();
		
		//--------버튼 만들
		String[] buttonName = {"7","8","9","/","4","5","6","*","1","2","3","-",".","0","=","+","CE","C"};
		button = new Button[18];
		for(int i=0; i<18; i++) {
			button[i]=new Button(buttonName[i]);
		}
		//------라벨
		dispL = new Label();
		dispL.setBackground(new Color(139,158,226));	//라벨의 색을 바꿔주는 메소드 실
		inputL = new Label();
		inputL.setBackground(new Color(139,158,226));
		
		
		//------패널
		whole.setLayout(new GridLayout(7,1,5,5));	//옆
		p1.setLayout(new GridLayout(1,1,5,5));	//판p1에 1줄, 1칸짜리 레이아웃을 가진 그리드 레이아웃 생
		p1.add(dispL);	//판넬 1에 dispL라벵을 넣어
		p2.setLayout(new GridLayout(1,1,5,5));
		p2.add(inputL);
		p3.setLayout(new GridLayout(1,2));	//맨 위엔 남는 버튼이 2개만 있기때문에 1줄 2칸으로 값을 잡아준다.
		p3.add(button[16]);
		p3.add(button[17]);
		p4.setLayout(new GridLayout(1,4));
		for(int i=0; i<4; i++) {
			p4.add(button[i]);
		}
		p5.setLayout(new GridLayout(1,4));
		for(int i=4; i<8; i++) {
			p5.add(button[i]);
		}
		p6.setLayout(new GridLayout(1,4));
		for(int i=8; i<12; i++) {
			p6.add(button[i]);
		}
		p7.setLayout(new GridLayout(1,4));
		for(int i=12; i<16; i++) {
			p7.add(button[i]);
		}
		
		whole.add(p1);
		whole.add(p2);
		whole.add(p3);
		whole.add(p4);
		whole.add(p5);
		whole.add(p6);
		whole.add(p7);
		add("Center", whole);
		
		setBounds(900,180,300,500);		//생성할 윈도우창의 위치값과 크
		setBackground(new Color(105,132,224));	//윈도우 창의 배경
		setVisible(true);	//윈도우 창을 볼 수 있게 해
		
	}

	public static void main(String[] args) {
		Calculator c = new Calculator();

	}

}
