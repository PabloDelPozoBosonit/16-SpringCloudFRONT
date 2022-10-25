package FormacionBackendBosonit.SpringCloudFRONT.trip.application;

import FormacionBackendBosonit.SpringCloudFRONT.ticket.infrastructure.dtos.TicketOutputDTO;
import FormacionBackendBosonit.SpringCloudFRONT.trip.infrastructure.dtos.TripInputDTO;
import FormacionBackendBosonit.SpringCloudFRONT.trip.infrastructure.dtos.TripOutputDTO;


public interface ServiceTrip {

    TripOutputDTO createTrip(TripInputDTO triplnputDTO) throws Exception ;
    TripOutputDTO updateTrip(TripInputDTO triplnputDTO, Integer id) throws Exception ;
    TripOutputDTO getTrip(Integer id) throws  Exception;
    String deleteTrip(Integer id) throws Exception ;

    TicketOutputDTO addPassenger(Integer tripId, Integer idPassenger)throws Exception ;
    String countPassengers(Integer tripId) throws Exception ;
    TripOutputDTO changeTripStatus(Integer tripId, boolean tripStatus) throws Exception ;
    String tripStatus(Integer tripId) throws Exception ;
}
