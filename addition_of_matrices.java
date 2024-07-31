package learning;

public class addition_of_matrices {
public static void main(String[] args){
	int [][]mat1={{1,2,3},{4,5,6}};
	int [][]mat2={{3,5,1},{9,7,3}};
	int [][]res={{0,0,0},{0,0,0}};
	for(int i=0;i<mat1.length;i++){
		for(int j=0;j<mat1[i].length;j++)
			res[i][j]=mat1[i][j]+mat2[i][j];
	}
	System.out.println("Addition of two matrices is ");
	for(int i=0;i<mat1.length;i++){
		for(int j=0;j<mat1[i].length;j++)
			System.out.print(res[i][j]+" ");
	System.out.println();
	}
}
}
