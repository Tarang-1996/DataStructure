


	import java.io.*;
	import java.util.*;

	public class Heap {
	        int top=0;
	        int child=-1;
	        int parent=-1;
	        int[] arr=new int[100000];
	    public void insert(int value){
	    	        
	    	arr[top]=value;
			child=top;
			parent=(child-1)/2;
			while(child!=0 && arr[child]<arr[parent]){
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
	        public void delete(int val){
	            for(int j=0;j<top;j++){
	                if(arr[j]==val){
	                    arr[j]=arr[top-1];
	                    top--;
	                    shiftdown(j);
	                    break;
	                }
	            }
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
	                else {
	                    if(arr[l]>arr[r]){
	                        minIndex=r;
	                            }
	                    else{
	                        minIndex=l;
	                    }
	                }
	                if(arr[p]>arr[minIndex]){
	                    swap(p,minIndex);
	                    shiftdown(minIndex);
	                }
	        }


	    public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	    	Heap s=new Heap();
	        Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        for(int i=0;i<n;i++){
	            int item=sc.nextInt();
	            switch(item){
	                case 1:
	                        int val=sc.nextInt();
	                       s.insert(val);
	                        break;
	                case 2:
	                        int k=sc.nextInt();
	                        s.delete(k);
	                        break;
	                case 3:
	                       System.out.println(s.arr[0]);
	                       break;

	            }
	        }

	        
	    }
	}




