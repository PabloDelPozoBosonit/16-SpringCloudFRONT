package FormacionBackendBosonit.SpringCloudFRONT.trip.infrastructure.controllers;


import FormacionBackendBosonit.SpringCloudFRONT.ticket.infrastructure.dtos.TicketOutputDTO;
import FormacionBackendBosonit.SpringCloudFRONT.trip.application.ServiceTrip;
import FormacionBackendBosonit.SpringCloudFRONT.trip.infrastructure.dtos.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("trip")
@Slf4j
public class TripController {

    @Autowired
    ServiceTrip serviceTrip;


    @PostMapping
    public TripOutputDTO createTrip(@RequestBody TripInputDTO tripInputDTO) throws Exception {
        return serviceTrip.createTrip(tripInputDTO);
    }

    @GetMapping("get")
    public TripOutputDTO getTrip(@RequestBody GetTripInputDTO getTripInputDTO) throws Exception{

        log.info("TripController, id del trip: " + getTripInputDTO.getIdTrip());
        return serviceTrip.getTrip(getTripInputDTO.getIdTrip());
    }

    @PutMapping("update/{id}")
    public TripOutputDTO updateTrip(@RequestBody TripInputDTO tripInputDTO, @PathVariable Integer id) throws Exception{
        return serviceTrip.updateTrip(tripInputDTO, id);
    }

    @DeleteMapping("delete/{id}")
    public String deleteTrip(@PathVariable Integer id) throws Exception {
        return serviceTrip.deleteTrip(id);
    }

    @PostMapping("addPassenger")
    public TicketOutputDTO addPassenger(@RequestBody GenerateTicketInputDTO generateTicketInputDTO) throws Exception{

        return serviceTrip.addPassenger(generateTicketInputDTO.getIdTripToAdd(), generateTicketInputDTO.getIdPassenger());
    }

    @GetMapping("count/{idTrip}")
    public String countPassengers(@PathVariable Integer idTrip)throws Exception  {
        return serviceTrip.countPassengers(idTrip);
    }

    @PostMapping("changeStatus/{idTrip}/{status}")
    public TripOutputDTO changeStatus(@PathVariable Integer idTrip,@PathVariable boolean status)throws Exception  {

        return serviceTrip.changeTripStatus(idTrip,status);
    }

    @GetMapping("getStatus/{tripId}")
    public String getStatus(@PathVariable Integer tripId) throws Exception {
        return  serviceTrip.tripStatus(tripId);
    }
}
