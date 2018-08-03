package in.co.cg.test;

import java.util.Scanner;
import in.co.cg.moviedetailslist.Movie_DetailsList;

/**
 * @author rohitnaik Test Class
 */
public class TestMovie {
	public static void main(String args[]) {

		Movie_DetailsList movieDetailsList = new Movie_DetailsList();
		Scanner get = new Scanner(System.in);

		int choice;

		do {
			System.out.println("Enter your choice.....");
			System.out.println("1. Add");
			System.out.println("2. Remove movie");
			System.out.println("3. Remove all");
			System.out.println("4. Get movie by movie name");
			System.out.println("5. Get movie by genre");
			System.out.println("6. Display");
			System.out.println("7. Sort");
			System.out.println("8. Exit");

			choice = get.nextInt();
			switch (choice) {
			case 1: // Add movie
				System.out.println("Enter Movie Name");
				String movName = get.next();

				System.out.println("Enter Lead Actor");
				String leadactor = get.next();

				System.out.println("Enter Lead Actress");
				String leadactress = get.next();

				System.out.println("Enter Genre");
				String genre = get.next();
				movieDetailsList.add(movName, leadactor, leadactress, genre);// Invoking add method of Movie_DetailList
				break;

			case 2: // REMOVE MOVIE BY NAME

				System.out.println("Enter Movie Name");
				String movieToRemove = get.next();
				movieDetailsList.removeMovie(movieToRemove);// Invoking remove method of Movie_DetailList
				break;

			case 3: // REMOVE ALL MOVIES
				movieDetailsList.removeAllMovie();// Invoking reomveAll method of Movie_DetailList
				break;

			case 4: // FIND MOVIE BY NAME
				System.out.println("Enter Movie Name");
				String getMovieByName = get.next();
				movieDetailsList.findByMovieName(getMovieByName);//Invoking findByMovieName method of Movie_DetailList
				break;

			case 5: // FIND MOVIE BY GENRE
				System.out.println("Enter Genre");
				String getMovieByGenre = get.next();
				movieDetailsList.findMovieByGenre(getMovieByGenre);//Invoking findMovieByGenre method of Movie_DetailList
				break;

			case 6: // DISPLAY MOVIE
				System.out.println("Print Movie Details"); 
				movieDetailsList.disp();	//Invoking disp method of Movie_DetailList
				break;

			case 7: // SORT BY CATEGORIES
				System.out.println("Sort By Categories"); 
				movieDetailsList.sortMovies(); //Invoking sort method of Movie_DetailList
				break;

			default: 
				System.out.println("Invalid Option");
				break;
			}

		} while (choice != 8);
		get.close();
	}

}