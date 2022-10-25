package FormacionBackendBosonit.SpringCloudFRONT.trip.infrastructure.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;


@Getter
@Setter
public class TripInputDTO {

    private String origin;
    private String destination;
    private Date departureDate;
    private Date arrivalDate;
    private boolean status;
}
