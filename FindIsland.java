//there is a 2 dimensional matrix filled with 0 and 1 1 is considered as island and 0 is considered as sea. we need to find the island. It is an application of DFS.
public class FindIsland {
	public boolean isValid(int a[][],int r,int c, boolean[][] v){
		if(r<0 || c<0 || r>=a.length || c>=a[0].length || a[r][c]==0 || v[r][c]==true){
			return false;
		}
		return true;
	}
	public void DFS(int[][] arr,int d,int f,boolean[][] visit){
		if(!isValid(arr,d,f,visit)){
			return;
		}
		visit[d][f]=true;
		DFS(arr,d-1,f,visit);
		DFS(arr,d,f-1,visit);
		DFS(arr,d+1,f,visit);
		DFS(arr,d,f+1,visit);
		
	}
	public static void main(String[] args) {
		int[][] arr={{1,0,1,1},{1,1,0,1},{0,0,0,0},{1,0,1,1},{1,0,1,0}};
		boolean[][] visit=new boolean[5][4];
		int count=0;
		FindIsland fi=new FindIsland();
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[0].length;j++){
				if(arr[i][j]==1 && !visit[i][j]){
					count++;
					fi.DFS(arr,i,j,visit);
				}
			}
		}
		
		System.out.println(count);
	}
}
