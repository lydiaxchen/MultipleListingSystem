package mls.server_property.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Date;

/**
 * Concrete class representing Cooperative home (level 3)
 */
@Entity
@Table(name="cooperativehome")
public class CooperativeHome extends Residential {

    public CooperativeHome(){ super(); }

    @JsonCreator
    public CooperativeHome(@JsonProperty("id") Long id,@JsonProperty("address") String address,
                       @JsonProperty("price") int price,
                       @JsonProperty("nOfParkingSpace") int nOfParkingSpace,
                       @JsonProperty("storageType") String storageType,
                       @JsonProperty("nOfStorages") int nOfStorages,
                       @JsonProperty("builtDate") Date builtDate) {
        super(id, address, price,nOfParkingSpace,storageType,nOfStorages,builtDate);
    }

    /**
     * Getter for ownership type
     * @return ownership type
     */
    @Override
    public String getOwnership() {
        return "Cooperative";
    }


}
