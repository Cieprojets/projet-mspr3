package fr.epsi.b3.c1.g1.projetmspr.service;


import fr.epsi.b3.c1.g1.projetmspr.dal.PlantsListDAO;
import fr.epsi.b3.c1.g1.projetmspr.dal.TrackingDAO;
import fr.epsi.b3.c1.g1.projetmspr.entities.Asset;
import fr.epsi.b3.c1.g1.projetmspr.entities.PlantsList;
import fr.epsi.b3.c1.g1.projetmspr.entities.Tracking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Optional;

@Service
public class AssetService {

    @Autowired
    TrackingDAO dao;

    public Asset storeTrackingPhoto(Integer trackingId, MultipartFile file ) throws IOException {

        Asset asset = null;
        Optional<Tracking> tracking = dao.findById( trackingId );
        if ( tracking.isPresent() ) {
            Tracking trackingValue = tracking.get();
            String fileName = StringUtils.cleanPath( file.getOriginalFilename() );
            asset = trackingValue.getPhoto();
            if (asset != null) {
                asset.setFileName( fileName );
                asset.setMimeType( file.getContentType() );
                asset.setSize( file.getSize() );
                asset.setContent( file.getBytes() );
            } else {
                asset = new Asset( fileName, file.getContentType(), file.getSize(), file.getBytes() );
                trackingValue.setPhoto( asset );
            }
            dao.save( trackingValue );
        }
        return asset;
    }

    public Asset getTrackingPhoto( Integer trackingId ) {

        Asset asset = null;
        Optional<Tracking> tracking = dao.findById( trackingId );
        if ( tracking.isPresent() ) {
            asset = tracking.get().getPhoto();
        }
        return asset;
    }


    @Autowired
    PlantsListDAO daoo;

    public Asset storePlantPhoto(Integer plantId, MultipartFile file ) throws IOException {

        Asset asset = null;
        Optional<PlantsList> plantsList = daoo.findById( plantId );
        if ( plantsList.isPresent() ) {
            PlantsList plantValue = plantsList.get();
            String fileName = StringUtils.cleanPath( file.getOriginalFilename() );
            asset = plantValue.getPhotoPlant();
            if (asset != null) {
                asset.setFileName( fileName );
                asset.setMimeType( file.getContentType() );
                asset.setSize( file.getSize() );
                asset.setContent( file.getBytes() );
            } else {
                asset = new Asset( fileName, file.getContentType(), file.getSize(), file.getBytes() );
                plantValue.setPhotoPlant( asset );
            }
            daoo.save( plantValue );
        }
        return asset;
    }

    public Asset getPlantPhoto( Integer plantId ) {

        Asset asset = null;
        Optional<PlantsList> plantsList = daoo.findById( plantId );
        if ( plantsList.isPresent() ) {
            asset = plantsList.get().getPhotoPlant();
        }
        return asset;
    }
}
