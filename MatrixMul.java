import java.util.*;
import java.lang.*;


class Matrix{
	int r,c,mat[][];
	public Matrix(int r, int c){
		this.r = r;
		this.c = c;
		this.mat = new int [this.r][this.c];
	}

	public void init_values(){
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the matrix values:");
		for(int i = 0; i < this.r; i++){
			for(int j = 0; j < this.c; j++){
				this.mat[i][j] = scn.nextInt();
			}
		}
	}

	public void show_mat(){
		for(int i = 0; i < this.r; i++){
			for(int j = 0; j < this.c; j++){
				System.out.print(this.mat[i][j]+" ");
			}
			System.out.println();
		}
	}

	public void multiply(Matrix m2){
		Matrix resultant = new Matrix(this.r,m2.c);
		if(this.c == m2.r){
			for(int i = 0; i<this.r; i++){
				for(int j = 0; j < m2.c; j++){
					resultant.mat[i][j] = 0;
					for(int k = 0; k < this.r; k++){
						resultant.mat[i][j] += this.mat[i][k]+m2.mat[k][j];
					}
				}
			}
		resultant.show_mat();
		}
		else{
			System.out.print("\nMultiplication not Possible\n");
		}
	}
}



class MatrixMul{

	public static void main(String[] args) {
		System.out.print("Enter row's and col's for mat1:");
		Scanner scn = new Scanner(System.in);
		Matrix mat1 = new Matrix(scn.nextInt(),scn.nextInt());
		System.out.print("Enter values for mat1:");
		mat1.init_values();
		System.out.print("Enter row's and col's for mat2:");
		Matrix mat2 = new Matrix(scn.nextInt(),scn.nextInt());
		System.out.print("Enter values for mat2:");
		mat2.init_values();
		mat1.multiply(mat2);
	}
}