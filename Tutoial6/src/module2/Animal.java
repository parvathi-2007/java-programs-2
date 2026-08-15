package module2;
class AnimalTest
{
	String species;
	AnimalTest(String species)
	{
		this.species=species;
	
	}
void displaySpecies()
{
	System.out.println("species:"+species);
}
}
class Animal
{
	public static void main(String[] args)
	{
		AnimalTest demo = new AnimalTest(null);
		System.out.println(demo.species);
		
	}
}