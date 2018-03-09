
public class Numbers {
	public static boolean isGoofy(int num){
		int number = num;
		int thousand = 0;
		int hundred = 0;
		int ten = 0;
		int one = 0;
		int sum = 0;
		while (number!=0){
			if (number - 1000 >0){
				number-=1000;
				thousand+=1;
			}
			else if (number - 100 >0){
				number-=100;
				hundred+=1;
			}
			else if (number - 10 >0){
				number-=10;
				ten+=1;
			}
			else if (number - 1 >0){
				number-=1;
				one+=1;
			}
		}
		if (thousand > 0 && num%thousand == 0){
			sum +=thousand;
		}
		if (hundred > 0 && num%hundred == 0){
			sum +=hundred;
		}
		if (ten > 0 && num%ten == 0){
			sum +=hundred;
		}
		if (one > 0 && num%one == 0){
			sum +=one;
		}
		if (sum%2 == 1){
			return true;
			
		}
		return false;
	}
	public static int[] getSomeGoofyNumbers(int count){
		int[] thing = new int[count];
		int q = 0;
		for (int i = 0; i < count;i++){
			int q1 = q;
			int thousand = 0;
			int hundred = 0;
			int ten = 0;
			int one = 0;
			int sum = 0;
			boolean goof = false;
			do{
				if (q1 - 1000 >0){
					q1-=1000;
					thousand+=1;
				}
				else if (q1 - 100 >0){
					q1-=100;
					hundred+=1;
				}
				else if (q1 - 10 >0){
					q1-=10;
					ten+=1;
				}
				else if (q1 - 1 >0){
					q1-=1;
					one+=1;
				}
				if (thousand > 0 && q%thousand == 0){
					sum +=thousand;
				}
				if (hundred > 0 && q%hundred == 0){
					sum +=hundred;
				}
				if (ten > 0 && q%ten == 0){
					sum +=hundred;
				}
				if (one > 0 && q%one == 0){
					sum +=one;
				}
				if (sum%2 == 1){
					goof = true;
					q++;
				}
				else{
					q++;
				}
			}while(goof!=true);
			thing[i] = q;
			
		}
		for(int i = 0; i < thing.length; i++){
			System.out.println(thing[i]);
		}
		return thing;
	}
	public static void main (String[] args){
		Numbers n1 = new Numbers();
		
	
		n1.getSomeGoofyNumbers(3);
		
		
	}
}
