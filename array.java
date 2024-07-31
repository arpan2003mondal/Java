package learning;

public class array {
public static void main(String[] args){
	//int []marks;   //-> declaration and then memory allocation
	//marks=new int[5];
	int []marks=new int[5];  //-> declaration and memory allocation together
	marks[0]=70;  		//-> initialization
	marks[1]=80;
	marks[2]=90;
	marks[3]=78;
	marks[4]=92;
	System.out.println(marks[2]);
	
	int []points={6,8,9,4,5};		//-> declaration,memory allocation and initialization
	System.out.println(points[2]);	
	
	for(int i=0;i<points.length;i++)
		System.out.printf(points[i]+ " ");
	System.out.println("Using for each loop");
	for(int element:marks)                     //    -> new version
	System.out.println(element);
	System.out.println();
	//.......................... Multidimentional array..............................
	int [][]flats=new int[2][3];
	flats[0][0]=100;
	flats[0][1]=101;
	flats[0][2]=102;
	flats[1][0]=200;
	flats[1][1]=201;
	flats[1][2]=202;
	for(int i=0;i<flats.length;i++){
		for(int j=0;j<flats[i].length;j++)
			System.out.printf(flats[i][j]+" ");
		System.out.println();
	}
	
	
	
	
	
	
	
}
}
