package FormacionBackendBosonit.SpringCloudFRONT.trip.application;


import FormacionBackendBosonit.SpringCloudFRONT.feign.IFeignTrip;
import FormacionBackendBosonit.SpringCloudFRONT.ticket.infrastructure.dtos.TicketOutputDTO;
import FormacionBackendBosonit.SpringCloudFRONT.trip.infrastructure.dtos.TripInputDTO;
import FormacionBackendBosonit.SpringCloudFRONT.trip.infrastructure.dtos.TripOutputDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ServiceTripImpl implements ServiceTrip{

    @Autowired
    IFeignTrip iFeignTrip;

    @Override
    public TripOutputDTO createTrip(TripInputDTO triplnputDTO) throws Exception{

                return iFeignTrip.createTrip(triplnputDTO);

    }

    @Override
    public TripOutputDTO updateTrip(TripInputDTO triplnputDTO, Integer id) throws Exception {

            return iFeignTrip.updateTrip(triplnputDTO,id);

    }

    @Override
    public TripOutputDTO getTrip(Integer id) throws Exception {

                return iFeignTrip.getTrip(id);

    }

    @Override
    public String deleteTrip(Integer id) throws Exception{

            return iFeignTrip.deleteTrip(id);

    }

    @Override
    public TicketOutputDTO addPassenger(Integer tripId, Integer idPassenger) throws Exception{

            return iFeignTrip.addPassenger(tripId,idPassenger);

    }

    @Override
    public String countPassengers(Integer tripId) throws Exception {

            return iFeignTrip.countPassengers(tripId);

    }

    @Override
    public TripOutputDTO changeTripStatus(Integer tripId, boolean tripStatus) throws Exception{

            return iFeignTrip.changeStatus(tripId, tripStatus);

    }

    @Override
    public String tripStatus(Integer tripId)  throws Exception{

            return iFeignTrip.getStatus(tripId);

    }
}
