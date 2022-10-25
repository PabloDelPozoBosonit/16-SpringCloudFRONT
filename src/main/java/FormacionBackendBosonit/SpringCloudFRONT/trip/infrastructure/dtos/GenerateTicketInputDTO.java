package FormacionBackendBosonit.SpringCloudFRONT.trip.infrastructure.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GenerateTicketInputDTO {

    private Integer idTripToAdd;
    private Integer idPassenger;
}
