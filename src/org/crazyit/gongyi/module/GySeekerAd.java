package org.crazyit.gongyi.module;

// Generated 2013-11-24 15:02:26 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * GySeekerAd generated by hbm2java
 */
public class GySeekerAd implements java.io.Serializable {

	private long id;
	private Date doneDate;
	private int recStatus;
	private String notes;
	private GySeeker seeker;
	private GyAds ads;

	public GySeeker getSeeker() {
		return seeker;
	}

	public void setSeeker(GySeeker seeker) {
		this.seeker = seeker;
	}

	public GyAds getAds() {
		return ads;
	}

	public void setAds(GyAds ads) {
		this.ads = ads;
	}

	public GySeekerAd() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getDoneDate() {
		return this.doneDate;
	}

	public void setDoneDate(Date doneDate) {
		this.doneDate = doneDate;
	}

	public int getRecStatus() {
		return this.recStatus;
	}

	public void setRecStatus(int recStatus) {
		this.recStatus = recStatus;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

}
