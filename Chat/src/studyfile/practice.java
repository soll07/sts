package studyfile;

public class practice {

	public static void main(String[] args) {
		boolean run = true;	//while문 실행변 
		int count=0;	//count 0으로 설정
		
		while(run) {
			++count;
			int random = (int) (Math.random()*7)+1;	//1~7까지 랜덤 값 추
			if(random == 7) {
				System.out.println(random + "번이 나왔습니다.");
				System.out.println("반복횟수:" + count);
				run = false;	//while 구문 종
			} else {
				System.out.println(random + "번이 나왔습니다.");
			}
		}
	}

}
