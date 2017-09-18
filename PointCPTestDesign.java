


// need to change the value of random.nextInt 

//  because the domain of Polar and cartesian is different 



import  java.util.*;
public class PointCPTestDesign {

	public static void test () {
		

		Random random = new Random();

		char[] charCP = new char[] {'C','P'};

		// =========================================================================Start test Design 1 

		PointCP[] ListCP1 = new PointCP[100];  // create 100 Design 1 type objects

		for (int i = 0 ; i < 100 ;i++){

			ListCP1[i] = new PointCP(charCP[random.nextInt(2)], random.nextInt(100), random.nextInt(100)); // wrong 

		}  // randomly assign value to the PointCP in the list 

		double beginDesgin1 = System.nanoTime(); // record begin time for test design 1 

		for (int i = 0 ; i < 100 ; i++){


		for (int j = 0 ; j < 1000; j++){

			ListCP1[i].convertStorageToPolar();           // call 1000 times methods for each object in list
			ListCP1[i].convertStorageToCartesian();
		}

	}

		double endDesgin1 = System.nanoTime();  // end time 

		//System.out.println ((endDesgin1 - beginDesgin1)/1000000 ); // nano to milli 

		// ===========================================================================Start test Design 2 (similar to Design1)

		PointCPolar[] ListCP2 = new PointCPolar[100];

		for (int i = 0 ; i < 100 ; i++){

			ListCP2[i] = new PointCPolar(charCP[random.nextInt(2)], random.nextInt(100), random.nextInt(100));

		}

		double beginDesgin2 = System.nanoTime();

		for (int i = 0 ; i< 100 ;i ++){

			for (int j = 0 ; j< 1000 ; j++){

				ListCP2[i].convertStorageToPolar();
				ListCP2[i].convertStorageToCartesian();
			}
		}

		double endDesgin2 = System.nanoTime();
		//System.out.println((endDesgin2- beginDesgin2)/1000000);

		// =========================================================================Start test Design 3 (similar to Design1)
		PointCPC[] ListCP3 = new PointCPC [100];

		for (int i = 0 ; i< 100 ; i++) {
			ListCP3 [i]= new PointCPC (charCP[random.nextInt(2)], random.nextInt(100), random.nextInt(100));
		}

		double beginDesgin3 = System.nanoTime();

		for (int i = 0 ; i < 100 ; i ++){

			for (int j = 0 ; j < 1000 ; j++){

				ListCP3[i].convertStorageToPolar();
				ListCP3[i].convertStorageToCartesian();
			}
		}
		double endDesgin3 = System.nanoTime();

		//System.out.println( (endDesgin3 - beginDesgin3)/1000000 );

		// ================================================================================Start design 5 

		PointCPDesign5[] ListCP5 = new PointCPDesign5 [100];

		for (int i = 0 ; i < 100 ; i++){

			int type = random.nextInt(2);

			if (type == 0 ){

				ListCP5[i] = new PointCPC('C', random.nextInt(100), random.nextInt(100)) ;
			}else {

				ListCP5[i] = new PointCPolar ('P', random.nextInt(100),random.nextInt(100));
			}

		}

              // create object of Desgin 2 and Desgin 3 depends on what the random value is 

		double beginDesgin5 = System.nanoTime();

		for (int i = 0 ; i<100; i++){

			for (int j =0 ; j<1000; j++){


					ListCP5[i].convertStorageToPolar();
					ListCP5[i].convertStorageToCartesian();
				
			}
		}

		// i didnt downcast the element here, becasue i was wrong in class, all the method are the same in those designs
		
		
		

		double endDesgin5 = System.nanoTime();

		//System.out.println((endDesgin5 - beginDesgin5)/1000000 )





	}

	public static void main(String[] args) {
		test();
	}
	

}
