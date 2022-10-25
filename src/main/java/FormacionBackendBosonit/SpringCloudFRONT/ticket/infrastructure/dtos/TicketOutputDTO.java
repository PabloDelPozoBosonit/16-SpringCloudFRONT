package FormacionBackendBosonit.SpringCloudFRONT.ticket.infrastructure.dtos;

import FormacionBackendBosonit.SpringCloudFRONT.ticket.domain.Ticket;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
public class TicketOutputDTO {

    private static String tittle = "----------TICKET----------";
    private Integer id;
    private Integer passengerId;
    private String passengerName;
    private String passengerLastName;
    private String passengerEmail;
    private String tripOrigin;
    private String tripDestination;
    private Date departureDate;
    private Date arrivalDate;

    public TicketOutputDTO(Ticket ticket) {

        this.id = ticket.getId();
        this.passengerId = ticket.getPassengerId();
        this.passengerName = ticket.getPassengerName();
        this.passengerLastName = ticket.getPassengerLastName();
        this.passengerEmail = ticket.getPassengerEmail();
        this.tripOrigin = ticket.getTripOrigin();
        this.tripDestination = ticket.getTripDestination();
        this.departureDate = ticket.getDepartureDate();
        this.arrivalDate = ticket.getArrivalDate();
    }
}
