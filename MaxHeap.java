
public class MaxHeap {

	int top=0;
	int child=-1;
	int parent=-1;
	int brr[]={10,1,12,15,45,66,99,36,58,47,24};
	int arr[]=new int[brr.length];
	public MaxHeap(){
		
	}
	public MaxHeap(int arr[]){
		this.arr=arr;
	}
	public void insert(int data){
		arr[top]=data;
		child=top;
		parent=(child-1)/2;
		while(child!=0 && arr[child]>arr[parent]){
			swap(child,parent);
			child=parent;
			parent=(child-1)/2;
		}
		top++;
	}
	public void swap(int x,int y){
		int temp=arr[x];
		arr[x]=arr[y];
		arr[y]=temp;
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
		int maxIndex=100;
		if(r>=top){
			if(l>=top){
				return;
			}
			else{
				maxIndex=l;
			}
		}else{
			if(arr[l]>arr[r]){
				maxIndex=l;
			}else{
				maxIndex=r;
			}
		}
		if(arr[p]<arr[maxIndex]){
			swap(p,maxIndex);
			shiftdown(maxIndex);
		}
	}
	public static void main(String[] args) {
		MaxHeap h=new MaxHeap();
		for(int i=0;i<h.brr.length;i++){
			h.insert(h.brr[i]);
		}
		System.out.println(h.pop());
		System.out.println(h.pop());
		System.out.println(h.pop());

	}

}
