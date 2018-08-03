package in.co.cg.moviedetailslist;

import java.util.Comparator;
import java.util.TreeSet;
import java.util.function.Predicate;
import in.co.cg.moviedetails.Movie_Details;

/**
 * This class do operations like add remove search on movie
 * 
 * @author rohitnaik
 *
 */
public class Movie_DetailsList {

	/**
	 * TreeSet reference
	 */
	TreeSet<Movie_Details> moiveList;

	/**
	 * Constructor initialize moiveList
	 */
	public Movie_DetailsList() {
		moiveList = new TreeSet<>((arg0, arg1) -> arg0.getMovName().compareTo(arg1.getMovName()));
	}

	/**
	 * Add movie details to treeSet
	 * 
	 * @param movName
	 * @param lead_actor
	 * @param lead_actress
	 * @param genre
	 * 
	 */
	public void add(String movName, String lead_actor, String lead_actress, String genre) {
		moiveList.add(new Movie_Details(movName, lead_actor, lead_actress, genre));
	}

	/**
	 * Prints All movie details
	 */
	public void disp() {
		moiveList.stream().forEach(System.out::println);
	}

	/**
	 * Find movie by movie name
	 * 
	 * @param movieName
	 */
	public void findByMovieName(String movieName) {
		Predicate<Movie_Details> fetchMovie = (Movie_Details) -> Movie_Details.getMovName().equals(movieName);
		moiveList.stream().filter(fetchMovie).forEach(System.out::println);
	}

	/**
	 * Find movie by movie name
	 * 
	 * @param genre
	 */
	public void findMovieByGenre(String genre) {
		Predicate<Movie_Details> fetchMovie = (Movie_Details) -> Movie_Details.getGenre().equals(genre);
		moiveList.stream().filter(fetchMovie).forEach(System.out::println);
	}

	/**
	 * remove movie by movie name
	 * 
	 * @param movieName
	 */
	public void removeMovie(String movieName) {
		Predicate<Movie_Details> fetchMovie = (Movie_Details) -> Movie_Details.getMovName().equals(movieName);
		moiveList.removeIf(fetchMovie);
		moiveList.stream().forEach(System.out::println);
	}

	/**
	 * Remove all movies
	 */
	public void removeAllMovie() {
		moiveList.removeAll(moiveList);
	}

	/**
	 * Sort and print all the movies by genre, leadActor,LeadActress,MovieName
	 */
	public void sortMovies() {
		System.out.println(".........Sorting by Genre........");
		moiveList.stream().sorted(Comparator.comparing(Movie_Details::getGenre)).forEach(System.out::println);
		System.out.println(".........Sorting by Lead Actor........");
		moiveList.stream().sorted(Comparator.comparing(Movie_Details::getLeadactor)).forEach(System.out::println);
		System.out.println(".........Sorting by Lead Actress........");
		moiveList.stream().sorted(Comparator.comparing(Movie_Details::getLeadactress)).forEach(System.out::println);
		System.out.println(".........Sorting by Movie Name........");
		moiveList.stream().sorted(Comparator.comparing(Movie_Details::getMovName)).forEach(System.out::println);
	}

}