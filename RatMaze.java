import java.util.*;
class Node1{
	int r,c;
	int dist=0;
	Node1(int r,int c,int dist){
		this.r=r;
		this.c=c;
		this.dist=dist;
	}
	
}

public class RatMaze {
	
	
	public static void main(String[] args) {
		int[][] arr={{1,'R',1,1,0},{1,0,0,1,1},{1,1,'C',0,1},{0,0,1,0,1},{0,0,1,1,1}};
		Node1 d=new Node1(0,1,0);
		boolean[][] visit=new boolean[5][5];
//		Queue q= new PriorityQueue();
		
//q.add(new Node1(d.r,d.c,0));

	}

}
