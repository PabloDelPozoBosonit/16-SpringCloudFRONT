package FormacionBackendBosonit.SpringCloudFRONT.trip.domain;

import FormacionBackendBosonit.SpringCloudFRONT.client.domain.Client;
import FormacionBackendBosonit.SpringCloudFRONT.trip.infrastructure.dtos.TripInputDTO;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
public class Trip {


    private Integer idTrip;
    private String origin;
    private String destination;
    private Date departureDate;
    private Date arrivalDate;


    private Set<Client> passengers = new HashSet<>();

    private boolean status;

    public void createTrip(TripInputDTO tripInputDTO) {

        this.origin = tripInputDTO.getOrigin();
        this.destination = tripInputDTO.getDestination();
        this.departureDate = tripInputDTO.getDepartureDate();
        this.arrivalDate = tripInputDTO.getArrivalDate();
        this.status = tripInputDTO.isStatus();
    }
}
