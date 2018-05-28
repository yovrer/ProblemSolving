import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class main1
{
    long MOD = 1000000007L;
    public class Obj implements Comparable<Obj>{
        public int a;
        public int b;
        
        public Obj(int a_, int b_){
            a = a_;
            b = b_;
        }
        
        public int compareTo(Obj other){
            if (a != other.a){
                return a - other.a;
            }else{
                return b - other.b;
            }
        }
        
    }
	public static void main (String[] args) throws Exception
	{
		// your code goes here
        main1 cf = new main1();
        cf.Solve();
	}
	
	
	public void Solve(){
        MyScanner sc = new MyScanner();
        int n = sc.nextInt();
        int p = sc.nextInt();
        int l = sc.nextInt();
        int r = sc.nextInt();
        
        if (l == 1 && r == n){
            System.out.println(0);
        }else if (l == 1){
            int res = Math.abs(r - p);
            res ++;
            System.out.println(res);
        }else if (r == n){
            int res = Math.abs(l - p);
            res ++;
            System.out.println(res);
        }else{
            int l1 = Math.abs(l - p);
            int l2 = Math.abs(r - p);
            int res = 0;
            if (l1 <= l2){
                res += l1;
                res ++;
                res += Math.abs(r - l);
                res ++;
            }else{
                res += l2;
                res ++;
                res += Math.abs(r - l);
                res ++;
            }
            System.out.println(res);
        }
        
	}
	
    public void BuildTree(int node, int l, int r, int[] tree, int[] arr, int h, int k){
        // System.out.println(node + " " + l + " " + r);
        if (l == r){
            tree[node] = arr[l];
            return;
        }
        
        int mid = l + (r - l) / 2;
        BuildTree(node * 2, l, mid, tree, arr, h + 1, k);
        BuildTree(node * 2 + 1, mid + 1, r, tree, arr, h + 1, k);
        int t = k - h;
        if (t % 2 == 0){
            tree[node] = tree[node * 2] ^ tree[node * 2 + 1];
        }else{
            tree[node] = tree[node * 2] | tree[node * 2 + 1];
        }
    }
    
    public void UpdateTree(int node, int l, int r, int idx, int[] tree, int[] arr, int h, int k, int val){
        // System.out.println(node + " l: " + l + " r: " + r + " idx: " + idx);
        if (l == r){
            tree[node] = val;
            return;
        }
        int mid = l + (r - l)/ 2;
        if (l <= idx && idx <= mid){
            UpdateTree(node * 2, l, mid, idx, tree, arr, h + 1, k, val);
        }else{
            UpdateTree(node * 2 + 1, mid+1, r, idx, tree, arr, h + 1, k, val);
        }
        int t = k - h;
        if (t % 2 == 0){
            tree[node] = tree[node * 2] ^ tree[node * 2 + 1];
        }else{
            tree[node] = tree[node * 2] | tree[node * 2 + 1];
        }
    }
	

	//-----------PrintWriter for faster output---------------------------------
   public static PrintWriter out;
      
   //-----------MyScanner class for faster input----------
   public static class MyScanner {
      BufferedReader br;
      StringTokenizer st;
 
      public MyScanner() {
         br = new BufferedReader(new InputStreamReader(System.in));
      }
 
      String next() {
          while (st == null || !st.hasMoreElements()) {
              try {
                  st = new StringTokenizer(br.readLine());
              } catch (IOException e) {
                  e.printStackTrace();
              }
          }
          return st.nextToken();
      }
 
      int nextInt() {
          return Integer.parseInt(next());
      }
 
      long nextLong() {
          return Long.parseLong(next());
      }
 
      double nextDouble() {
          return Double.parseDouble(next());
      }
 
      String nextLine(){
          String str = "";
      try {
         str = br.readLine();
      } catch (IOException e) {
         e.printStackTrace();
      }
      return str;
      }

   }
}