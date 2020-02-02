import java.util.Scanner;


public class NQueenProblem {
	public boolean fillQueen(int[][] board,int n,int c){
		if(c==n){
			return true;
		}
		for(int r=0;r<n;r++){
			if(isValid(board,r,c)){
				board[r][c]=1;
				if(fillQueen(board,n,c+1)){
					return true;
				}
				board[r][c]=0;
			}
		}
		return false;
	}
	public boolean isValid(int[][] board, int r,int c){
		for(int j=c-1;j>=0;j--){
			if(board[r][j]==1){
				return false;
			}
		}
		for(int i=r-1;i>=0;i--){
			for(int j=c-1;j>=0;j--){
				if(board[i][j]==1){
					return false;
				}
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NQueenProblem n=new NQueenProblem();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Chess Board Size");
		int row=sc.nextInt();
		int col=sc.nextInt();
		int arr[][]=new int[row][col];
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				arr[i][j]=0;
			}
		}
		if(n.fillQueen(arr,col,0)){
			for(int i=0;i<row;i++){
				for(int j=0;j<col;j++){
				System.out.print(arr[i][j]+" ");	
				}
				System.out.println();
			}
		}
	}

}
