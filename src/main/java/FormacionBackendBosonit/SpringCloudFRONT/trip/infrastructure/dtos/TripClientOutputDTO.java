package FormacionBackendBosonit.SpringCloudFRONT.trip.infrastructure.dtos;

import FormacionBackendBosonit.SpringCloudFRONT.client.domain.Client;
import FormacionBackendBosonit.SpringCloudFRONT.trip.domain.Trip;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TripClientOutputDTO {

    Integer idClient;
    String nameClient;
    String emailClient;

    Integer idTrip;
    String originTrip;
    String destinationTrip;
    boolean statusTrip;

    public TripClientOutputDTO(Trip trip, Client client) {
        this.idClient = client.getIdClient();
        this.nameClient = client.getName();
        this.emailClient = client.getEmail();

        this.idTrip = trip.getIdTrip();
        this.originTrip = trip.getOrigin();
        this.destinationTrip = trip.getDestination();
        this.statusTrip = trip.isStatus();
    }

}
