


// DONE !  
// This part is finished, try to run it . 



import  java.util.*;
public class PointCPTestDesign {

	public static void test () {
		

		Random random = new Random();

		char[] charCP = new char[] {'C','P'};

		// ========================================================================Design 1 Starts  ==================

		PointCP[] ListCP1 = new PointCP[100];  // create 100 Design 1  in a list 

		for (int i = 0 ; i < 100 ;i++){

			ListCP1[i] = new PointCP(charCP[random.nextInt(2)], random.nextInt(100), random.nextInt(100)); // wrong 

		} // randomly assign elements in Design1 list  
		
		double beginDesgin1 = System.nanoTime();  // recoreding begin time 

		for (int i = 0 ; i < 100 ; i++){


		for (int j = 0 ; j < 1000; j++){

			ListCP1[i].convertStorageToPolar();
			ListCP1[i].convertStorageToCartesian();
		}

	}	// for each Design1 in list, run methods 1000 times 

		double endDesgin1 = System.nanoTime(); // record time ends 

		double testTimeDesign1 = (endDesgin1 - beginDesgin1) /1000000 ;  // convert nano to milli

		System.out.println ("Design 1 cost "+ Double.toString(testTimeDesign1) + " milliseconds"); // print result

		//System.out.println ((endDesgin1 - beginDesgin1)/1000000 ); // nano to milli 

		// =======================================================Design 2 Starts (Similar to Design 1 )================

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

		double testTimeDesign2 = (endDesgin2 - beginDesgin2) /1000000 ; 

		System.out.println ("Design 2 cost "+ Double.toString(testTimeDesign2) + " milliseconds");
		//System.out.println((endDesgin2- beginDesgin2)/1000000);

		// ===============================================================Design 3 Starts (Similar to Design 1 )======================

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

		double testTimeDesign3 = (endDesgin3 - beginDesgin3) /1000000 ; 

		System.out.println ("Design 3 cost "+ Double.toString(testTimeDesign3) + " milliseconds");

		//System.out.println( (endDesgin3 - beginDesgin3)/1000000 );

		// ======================================================================Design 5 Starts ==========================

		PointCPDesign5[] ListCP5 = new PointCPDesign5 [100];

		for (int i = 0 ; i < 100 ; i++){

			int type = random.nextInt(2);

			if (type == 0 ){

				ListCP5[i] = new PointCPC('C', random.nextInt(100), random.nextInt(100)) ;
			}else {

				ListCP5[i] = new PointCPolar ('P', random.nextInt(100),random.nextInt(100));
			}

		}  // randomly create elemnts depending on users' input



		double beginDesgin5 = System.nanoTime();

		for (int i = 0 ; i<100; i++){

			for (int j =0 ; j<1000; j++){


					ListCP5[i].convertStorageToPolar();
					ListCP5[i].convertStorageToCartesian();
				
			}
		} 


		double endDesgin5 = System.nanoTime();
		double testTimeDesign5 = (endDesgin5 - beginDesgin5) /1000000 ; 

		System.out.println ("Design 5 cost "+ Double.toString(testTimeDesign5) + " milliseconds");

		//System.out.println((endDesgin5 - beginDesgin5)/1000000 )





	}

	public static void main(String[] args) {
		test();
	}
	

}
