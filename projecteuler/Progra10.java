class Progra10{
	public static boolean isPrime(int n){
			int i;
			for(i=2;i<=Math.sqrt(n);i++)
				if(n % i == 0)		
					return false;
					
				
				return true;
				

	}
	

	

			
	public static void main(String[] args){
		System.out.println(isPrime(34));
	}
}