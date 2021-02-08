package by.main.agregation.class13;


//. Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
//столицу, количество областей, площадь, областные центры. 

public class Main {

	public static void main(String[] args) {
		City minsk = new City("Минск");
		
		Country belarus = new Country("Беларусь", minsk);
		
		belarus.setRegions(new Region("Минская область", minsk,39854));
		belarus.setRegions(new Region("Брестская область", (new City("Брест")),32786));
		belarus.setRegions(new Region("Витебская область",(new City("Витебск")),40051));
		belarus.setRegions(new Region("Могилёвская область", (new City("Могилёв")),29068));
		belarus.setRegions(new Region("Гродненская область", (new City("Гродно")),25127));
		belarus.setRegions(new Region("Гомельская область", (new City("Гомель")),40372));

		System.out.println("Столица "+belarus.getCapital());
		System.out.println("Количество областей: "+belarus.getRegions().size());
		System.out.println("Площадь: "+ belarus.getSquare());
		
		for(Region x :belarus.getRegions()) {
			System.out.println("Областной центр "+x.getRegionCenter());
		}
		
	}

}
