package String;

public class LearningString {

	public static void main(String[] args) {
		
		String text="ANNGHAATYA";
		int count=0;
		int j=0;
		int []position=new int[10];
		char []ch=text.toCharArray();
		
		for(int i=0; i<ch.length-1;i++){
			count++;
			position[j]=i;
			j++;
			
		}

	}

}
