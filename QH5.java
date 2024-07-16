//  Write a java program to exchange the value of 4 variables W,G,K,A such that the value of 
//  W will move to A, A to K, K to G and finally G to W. Exchange using with and without 
//  using extra variables.


public class QH5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int W=10,G=20,K=30,A=40;
		System.out.println("Before swapping the value of W,G,k and A are"+W+","+G+","+K+","+A);
		W=W+G;
		G=W-G;
		W=W-G;
		G=G+K;
		K=G-K;
		G=G-K;
		K=K+A;
		A=K-A;
		K=K-A;
		System.out.println("After swapping the value of W,G,k and A are"+W+","+G+","+K+","+A);
		

	}

}
