package unit15;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		List<Board> list = new ArrayList<>();
		
		list.add(new Board("제목1", "내용1", "글쓴이1"));
		list.add(new Board("제목2", "내용2", "글쓴이2"));
		list.add(new Board("제목3", "내용3", "글쓴이3"));
		list.add(new Board("제목4", "내용4", "글쓴이4"));
		list.add(new Board("제목5", "내용5", "글쓴이5"));
		
		int size = list.size();
		System.out.println("총 객체 수:"+size); // 총 객체 수 : 5
		System.out.println(); // 띄어쓰기
		
		Board board = list.get(2);
		System.out.println(board.getSubject()+"\t"+board.getContent()+"\t"+board.getWriter());
		System.out.println(); // 012 < 3번째꺼 출력
		
		for(int i = 0; i<list.size(); i++) //0부터 4까지 다출력
		{
			Board b = list.get(i);
			System.out.println(b.getSubject() + "\t" + b.getContent() + "\t"+ b.getWriter());
		}
		System.out.println();
		
		list.remove(2); // 3번째4번째꺼 삭제
		list.remove(2);
		
		for(Board b: list) { //출력 
			System.out.println(b.getSubject()+"\t"+b.getContent()+"\t"+b.getWriter());
		}
	}

}
