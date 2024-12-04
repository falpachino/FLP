class Book {
	private String title;
	private String author;
	private int pubDate;

	Book(String t, String a, int d) {
		System.out.println("Выполняется конструктор класса Book");
		title=t;
		author=a;
		pubDate=d;
	}
	//Перегрузка конструктора - версия с двумя парматерами String
	Book(String t, String a) {
                System.out.println("Выполняется конструктор класса Book");
                title=t;
                author=a;
                pubDate=2000;
        }


	void show() {
		System.out.println("Заглавие "+ title);
		System.out.println("Автор "+ author);
		System.out.println("Год публикации"+ pubDate);
		System.out.println();
	}	
}
class demo {
	public static void main(String[] arg){
		Book[] books= new Book[5];

		books[0]=new Book ("Статистика и котики", "Савельев Владимир", 2024);
		books[1]=new Book("Энтони: Путь к дракону", "Артем Хорев");
		books[2]=new Book("Преступление и наказание", "Ф.М.Достоевский");
		books[3]=new Book("Мастер и маргарита", "М.А.Булгаков", 1940);

		for(int i=0; i<books.length; i++)
			books[i].show();
	}

}


