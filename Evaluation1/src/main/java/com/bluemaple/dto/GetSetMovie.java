package com.bluemaple.dto;

public class GetSetMovie {

	public String movie_name;
	public String release_date;
	public GetSetMovie()
	{
		
	}
	
	public GetSetMovie(String movie_name, String release_date) {
		
		this.movie_name=movie_name;
		this.release_date=release_date;
	}
	public String getMovie_name() {
		return movie_name;
	}
	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}
	public String getRelease_date() {
		return release_date;
	}
	public void setRelease_date(String release_date) {
		this.release_date = release_date;
	}

	
}
