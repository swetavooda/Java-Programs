import java.util.*;
class Graph{
    int num;
    List<Integer> alist[];
    Graph(int r){
        num=r;
     alist=new ArrayList[num];   
    for(int i=0;i<num;i=i+1){
        alist[i]=new ArrayList<Integer>();
    }
    }
    void addedge(int x,int y){
        alist[x].add(y);
        
    }
    void dfs(int r){
        Stack<Integer> s=new Stack();
        boolean vis[]=new boolean[num];
        s.push(r);
        while(!s.empty()){
            int a=s.peek();
            s.pop();
            if(!vis[a]){
                System.out.print(a+" ");
                vis[a]=true;
            }
            for(Integer i:alist[a]){
                if(!vis[i]){
                    s.push(i);
                }
            }
        }
    }
    
    
    
}
class DFS1{
    public static void main(String[] args){
        System.out.println("Enter number of Nodes");
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        Graph g=new Graph(n);
        System.out.println("Enter edges from source to destination");
       for(int i=0;i<n;i=i+1){
           int num1=in.nextInt();
           int num2=in.nextInt();
           g.addedge(num1,num2);
       }
       System.out.println("Following is the Depth First Traversal ");
       g.dfs(0);
    }
}
