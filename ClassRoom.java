public class ClassRoom {

	public static void main(String[] args) {
		String [] wilders = {"Jeannette","Yoyo", "Yuyu", "Robert", "Roberto", "Roberta"};
		for (int i = 0 ; i < wilders.length; i++)
		{
			Wilder wilder = new Wilder(wilders[i],i%2==0?true:false);
			System.out.println(wilder.whoAmI());
		}
	}

}
