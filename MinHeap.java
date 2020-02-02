
public class MinHeap {
	int top=0;
	int child=-1;
	int parent=-1;
	int brr[]={55,3,6,9,2,1,4,7,5,8};
	int arr[]=new int[brr.length];
	public void insert(int data){
		arr[top]=data;
		child=top;
		parent=(child-1)/2;
		while(child!=0 && arr[child]<arr[parent]){
			swap(child,parent);
			child=parent;
			parent=(child-1)/2;
		}
		top++;
	}
	public int pop(){
		int data=arr[0];
		arr[0]=arr[top-1];
		top--;
		shiftdown(0);
		return data;
	}
	public void shiftdown(int p){
		int l=(2*p)+1;
		int r=l+1;
		int minIndex=-1;
		if(r>=top){
			if(l>=top){
				return;
			}
			else{
				minIndex=l;
			}
		}
		else{
			if(arr[l]<arr[r]){
				minIndex=l;
			}
			else{
				minIndex=r;
			}
		}
		if(arr[p]>arr[minIndex]){
			swap(p,minIndex);
			shiftdown(minIndex);
		}
	}
	public void swap(int x,int y){
		int temp=arr[x];
		arr[x]=arr[y];
		arr[y]=temp;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			MinHeap m=new MinHeap();
			for(int i=0;i<m.brr.length;i++){
				m.insert(m.brr[i]);
			}
			System.out.print(m.pop()+" ");
			
	}

}
