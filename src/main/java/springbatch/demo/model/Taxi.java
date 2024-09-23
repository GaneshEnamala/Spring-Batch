package springbatch.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Chicago_Taxi")
public class Taxi {

//"TRIP_START_TIMESTAMP", "TRIP_END_TIMESTAMP", "TRIP_START_HOUR", 
//	"TRIP_SECONDS", "TRIP_MILES", "TRIP_SPEED", "PICKUP_CENSUS_TRACT", 
//	"DROPOFF_CENSUS_TRACT", "PICKUP_COMMUNITY_AREA", "DROPOFF_COMMUNITY_AREA", 
//	"FARE", "TIP0S", "TIP_RATE	TOLLS", "EXTRAS", TRIP_TOTAL", "PAYMENT_TYPE", "COMPANY"

	@Id
	@Column(name = "ID")
	private Integer id;

	private String tripStart;
	private String tripEnd;
	private String tripHour;
	private String tripSeconds;
	private Double tripMiles;
	private Double tripSpeed;
	private String pickupCensus;
	private String dropoffCensus;
	private String pickupCommunity;
	private String dropoffCommunity;
	private Double fare;
	private Double tipRate;
	private Double tolls;
	private Double extras;
	private Double tripTotal;
	private String paymentType;
	private String company;
	
}
