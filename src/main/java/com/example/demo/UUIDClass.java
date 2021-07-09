package com.example.demo;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UUIDClass {
	@Id
	private UUID uuid; 
	private LocalDateTime time;
	
	public UUIDClass() {
		this.uuid = UUID.randomUUID();
		this.time = LocalDateTime.now();
	}
	
	public UUID getUuid() {
		return uuid;
	}

	public void setUuid(UUID uuid) {
		this.uuid = uuid;
	}
	
	public LocalDateTime getTime() {
		return time;
	}

	public void setTime(LocalDateTime time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "UUIDClass [uuid=" + uuid + ", time=" + time + "]";
	}
	
	
}
