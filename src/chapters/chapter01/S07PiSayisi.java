package chapters.chapter01;

public class S07PiSayisi {
	public static void main(String[] args)
	{
		int i;
		int n=20000 , k=6 , l=7;
		double piSayisi1=0 , piSayisi2=0 ;
		for(i=1;i<=n;i++)
		{
			if(i%2==0)
				piSayisi1-=1.0/(2*i-1);
			else
				piSayisi1+=1.0/(2*i-1);
		}
		for(i=1;i<=k;i++)
		{
			if(i%2==0)
				piSayisi2-=1.0/(2*i-1);
			else
				piSayisi2+=1.0/(2*i-1);
		}
		for(i=1;i<=l;i++)
		{
			if(i%2==0)
				piSayisi2-=1.0/(2*i-1);
			else
				piSayisi2+=1.0/(2*i-1);
		}
		System.out.println("pi sayısı " + 4*piSayisi1 +" dir");
		System.out.println("ancak formülde ki İlk 6 ifade için pi sayısı " + 4*piSayisi2 +" dir");
		System.out.println("ancak formülde ki İlk 7 ifade için pi sayısı " + 4*piSayisi2 +" dir");

	}
	

}
