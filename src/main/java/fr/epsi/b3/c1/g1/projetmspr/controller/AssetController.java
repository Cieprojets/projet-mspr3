package fr.epsi.b3.c1.g1.projetmspr.controller;

import fr.epsi.b3.c1.g1.projetmspr.dto.AssetResponse;
import fr.epsi.b3.c1.g1.projetmspr.dto.MessageResponse;
import fr.epsi.b3.c1.g1.projetmspr.entities.Asset;
import fr.epsi.b3.c1.g1.projetmspr.service.AssetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class AssetController {

    @Autowired
    private AssetService assetService;
    public class TrackingService {
    @PostMapping( "/api/les-gens/{trackingId}/photo" )
    public ResponseEntity<?> uploadFile(@PathVariable Integer trackingId, @RequestParam( "photo" ) MultipartFile file ) {
        String message = "";
        try {
            Asset photo = assetService.storeTrackingPhoto( trackingId, file );
            String photoURI = ServletUriComponentsBuilder.fromCurrentContextPath().path( "/api/les-gens/" )
                    .path( String.valueOf( trackingId ) ).path( "/photo" )
                    .toUriString();
            return ResponseEntity.status( HttpStatus.OK )
                    .body( new AssetResponse( photo.getFileName(), photoURI, photo.getMimeType(), photo.getSize() ) );
        } catch ( Exception e ) {
            message = "Could not upload the file: " + file.getOriginalFilename() + "!";
            return ResponseEntity.status( HttpStatus.EXPECTATION_FAILED ).body( new MessageResponse( message ) );
        }
    }

    @GetMapping( "/api/les-gens/{trackingId}/photo" )
    public ResponseEntity<byte[]> getFile( @PathVariable Integer trackingId ) {
        Asset photo = assetService.getTrackingPhoto( trackingId );

        return ResponseEntity.ok()
                .header( HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + photo.getFileName() + "\"" )
                .body( photo.getContent() );
    }

    }
    public class PlantService {
        @PostMapping("/api/les-plants/{plantId}/photoPlant")
        public ResponseEntity<?> uploadFile(@PathVariable Integer plantId, @RequestParam("/photoPlant") MultipartFile file) {
            String message = "";
            try {
                Asset photoPlant = assetService.storeTrackingPhoto(plantId, file);
                String photoPlantURI = ServletUriComponentsBuilder.fromCurrentContextPath().path("/api/les-plants/")
                        .path(String.valueOf(plantId)).path("/photoPlant")
                        .toUriString();
                return ResponseEntity.status(HttpStatus.OK)
                        .body(new AssetResponse(photoPlant.getFileName(), photoPlantURI, photoPlant.getMimeType(), photoPlant.getSize()));
            } catch (Exception e) {
                message = "Could not upload the file: " + file.getOriginalFilename() + "!";
                return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new MessageResponse(message));
            }
        }

        @GetMapping("/api/les-plants/{plantId}/photoPlant")
        public ResponseEntity<byte[]> getFile(@PathVariable Integer plantId) {
            Asset photoPlant = assetService.getPlantPhoto(plantId);

            return ResponseEntity.ok()
                    .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + photoPlant.getFileName() + "\"")
                    .body(photoPlant.getContent());
        }
    }
}
