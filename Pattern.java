public class Pattern {
	public static void main(String[] args){
		/*for (int i= 97; i<=99; i ++){
			char c = (char)i;
			System.out.printf("%s %s\n",c, c);*/
		int num =1;
		for (num=1;num<6;num++){
			switch (num){
			case 1: System.out.printf("  %s\n",(char)97);
			break;
			case 2: System.out.printf(" %s%s%s\n",(char)97,(char)98,(char)97);
			break;
			case 3: System.out.printf("%s%s%s%s%s\n",(char)97,(char)98,(char)99,(char)98,(char)97);
			break;
			case 4: System.out.printf(" %s%s%s\n",(char)97,(char)98,(char)97);
			break;
			case 5: System.out.printf("  %s\n",(char)97);
			break;
			default: break;
			}
		}
		
				
		
	}

}
