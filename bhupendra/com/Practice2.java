package bhupendra.com;

class Practice2 {
	public static void main(String[] args) {
		for(int i=0;i<=100;i++) {
			int temp=0;
			for(int j=2;j<i;j++) {
				if(j%i==0) {
					temp++;
				}
			}
			if(temp==0) {
				System.out.println("prime"+i);
			}
		}
		
	}
}

			


