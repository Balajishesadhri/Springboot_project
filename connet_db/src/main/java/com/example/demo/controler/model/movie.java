package com.example.demo.controler.model;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="movie")
public class movie {

	@Id
    @Column(name ="movie_namee")
	private String movie_namee;
	@Column(name ="relese_date")
	private Date relese_date;
	@Column(name ="ticket")
	private int ticket;
	
	public String getMovie_namee() {
		return movie_namee;
	}

	public void setMovie_namee(String movie_namee) {
		this.movie_namee = movie_namee;
	}

	public Date getRelese_date() {
		return relese_date;
	}

	public void setRelese_date(Date relese_date) {
		this.relese_date = relese_date;
	}

	public int getTicket() {
		return ticket;
	}

	public void setTicket(int ticket) {
		this.ticket = ticket;
	}

	public movie(String movie_namee, Date relese_date, int ticket) {
		super();
		this.movie_namee = movie_namee;
		this.relese_date = relese_date;
		this.ticket = ticket;
	}

	@Override
	public String toString() {
		return "movie [movie_namee=" + movie_namee + ", relese_date=" + relese_date + ", ticket=" + ticket + "]";
	}

	
	
	
}
