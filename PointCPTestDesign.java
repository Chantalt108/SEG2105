


// need to change the value of random.nextInt 

//  because the domain of Polar and cartesian is different 



import  java.util.*;
public class PointCPTestDesign {

	public static void test () {
		

		Random random = new Random();

		char[] charCP = new char[] {'C','P'};

		// ================================================================================================

		PointCP[] ListCP1 = new PointCP[100];

		for (int i = 0 ; i < 100 ;i++){

			ListCP1[i] = new PointCP(charCP[random.nextInt(2)], random.nextInt(100), random.nextInt(100)); // wrong 

		} 

		double beginDesgin1 = System.nanoTime();

		for (int i = 0 ; i < 100 ; i++){


		for (int j = 0 ; j < 1000; j++){

			ListCP1[i].convertStorageToPolar();
			ListCP1[i].convertStorageToCartesian();
		}

	}

		double endDesgin1 = System.nanoTime();

		//System.out.println ((endDesgin1 - beginDesgin1)/1000000 ); // nano to milli 

		// ================================================================================================================

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

		// ===============================================================================================================

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

		// ===============================================================================================================

		PointCPDesign5[] ListCP5 = new PointCPDesign5 [100];

		for (int i = 0 ; i < 100 ; i++){

			int type = random.nextInt(2);

			if (type == 0 ){

				ListCP5[i] = new PointCPC('C', random.nextInt(100), random.nextInt(100)) ;
			}else {

				ListCP5[i] = new PointCPolar ('P', random.nextInt(100),random.nextInt(100));
			}

		}



		double beginDesgin5 = System.nanoTime();

		for (int i = 0 ; i<100; i++){

			for (int j =0 ; j<1000; j++){

				if (ListCP5[i] instanceof PointCPC){

					ListCP5[i].convertStorageToPolar();
					ListCP5[i].convertStorageToCartesian();

				}else {

					ListCP5[i].convertStorageToPolar();
					ListCP5[i].convertStorageToCartesian();
				}
			}
		}


		double endDesgin5 = System.nanoTime();

		//System.out.println((endDesgin5 - beginDesgin5)/1000000 )





	}

	public static void main(String[] args) {
		test();
	}
	

}