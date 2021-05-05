package Entities;

import java.time.LocalDate;

import Abstract.Entity;

public class Order implements Entity{
	private int id;
	private int gameId;
	private int customerId;
	private int campaignId;
	private LocalDate date;
	
	public Order() {
		
	}

	public Order(int id, int gameId, int customerId, int campaignId, LocalDate date) {
		this.id = id;
		this.gameId = gameId;
		this.customerId = customerId;
		this.campaignId = campaignId;
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

}
