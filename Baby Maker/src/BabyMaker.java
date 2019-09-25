import java.util.ArrayList;

public class BabyMaker
	{

		public static void main(String[] args)
			{
				ArrayList<Baby> nursery = new ArrayList<Baby>();
				
				nursery.add(new Baby("male", 5.3, "Luke"));
				nursery.add(new Baby("female", 7.6, "Scarlett"));
				nursery.add(new Baby("female", 6.1, "Rosealli"));
				
				System.out.println(nursery.get(0).getName());
				nursery.get(0).setGender("female");
				System.out.println(nursery.get(0).getGender());
				
				for(Baby b : nursery)
					{
						System.out.println(b.getName());
					}

			}


	}
