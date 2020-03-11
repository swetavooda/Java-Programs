/*Write a Java program to print BFS traversal from a given source vertex. 
BFS(int s) traverses vertices reachable from s(start from s=1).
Sample Testcase:
Enter number of Nodes                                                                                                   
4                                                                                                                       
Enter edges from source to destination                                                                                  
0 1                                                                                                                     
0 2                                                                                                                     
1 2                                                                                                                     
2 3                                                                                                                     
Following is Breadth First Traversal (starting from vertex 1)                                                           
1 2 3                                                                                                                   
           

*/

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
    void bfs(int r){
        LinkedList<Integer> q=new LinkedList();
        boolean vis[]=new boolean[num];
        q.add(r);
        while(!q.isEmpty()){
            int a=q.peek();
            q.poll();
            if(!vis[a]){
                System.out.print(a+" ");
                vis[a]=true;
            }
            for(Integer i:alist[a]){
                if(!vis[i]){
                    q.add(i);
                }
            }
        }
    }
    
    
    
}
class BFS{
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
       System.out.println("Following is Breadth First Traversal (starting from vertex 1)");
       g.bfs(1);
    }
}
