package FormacionBackendBosonit.SpringCloudFRONT.trip.infrastructure.dtos;

import FormacionBackendBosonit.SpringCloudFRONT.client.domain.Client;
import FormacionBackendBosonit.SpringCloudFRONT.trip.domain.Trip;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
public class TripOutputDTO {

    private Integer id;
    private String origin;
    private String destination;
    private Date departureDate;
    private Date arrivalDate;
    private Set<Client> passengers;
    private boolean status;

    public TripOutputDTO(Trip trip) {
        this.id = trip.getIdTrip();
        this.origin = trip.getOrigin();
        this.destination = trip.getDestination();
        this.departureDate = trip.getDepartureDate();
        this.arrivalDate = trip.getArrivalDate();
        this.passengers = trip.getPassengers();
        this.status = trip.isStatus();
    }
}
