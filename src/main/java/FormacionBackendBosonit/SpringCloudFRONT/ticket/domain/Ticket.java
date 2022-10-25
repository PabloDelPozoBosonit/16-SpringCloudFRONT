package FormacionBackendBosonit.SpringCloudFRONT.ticket.domain;

import FormacionBackendBosonit.SpringCloudFRONT.client.infrastructure.dtos.ClientOutputDTO;
import FormacionBackendBosonit.SpringCloudFRONT.trip.infrastructure.dtos.TripOutputDTO;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Ticket {


    private Integer id;
    private Integer passengerId;
    private String passengerName;
    private String passengerLastName;
    private String passengerEmail;
    private String tripOrigin;
    private String tripDestination;
    private Date departureDate;
    private Date arrivalDate;


    //todo posiblemenmte cambiar a entidad Trip y Client mejor que OutputDTO
    public void generateTicket(TripOutputDTO tripOutputDTO, ClientOutputDTO clientOutputDTO) {

        this.passengerId = clientOutputDTO.getId();
        this.passengerName = clientOutputDTO.getName();
        this.passengerLastName = clientOutputDTO.getSurname();
        this.passengerEmail = clientOutputDTO.getEmail();
        this.tripOrigin = tripOutputDTO.getOrigin();
        this.tripDestination = tripOutputDTO.getDestination();
        this.departureDate = tripOutputDTO.getDepartureDate();
        this.arrivalDate = tripOutputDTO.getArrivalDate();
    }

}
