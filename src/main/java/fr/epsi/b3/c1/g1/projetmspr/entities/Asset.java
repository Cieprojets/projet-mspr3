package fr.epsi.b3.c1.g1.projetmspr.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.io.Serializable;

@Entity
public class Asset implements Serializable {

    @Id
    @GeneratedValue( generator = "uuid" )
    @GenericGenerator( name = "uuid", strategy = "uuid2" )
    private String id;
    @Column( name = "nom" )
    private String fileName;
    @Column( name = "type" )
    private String mimeType;
    @Column( name = "taille" )
    private long size;
    @JsonIgnore
    @Lob
    @Column( name = "contenu", columnDefinition = "BLOB")
    private byte[] content;

    public Asset() {
    }

    public Asset( String fileName, String contentType, long size, byte[] content ) {
        this.fileName = fileName;
        this.mimeType = contentType;
        this.size = size;
        this.content = content;
    }

    public String getId() {
        return id;
    }

    public void setId( String id ) {
        this.id = id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName( String fileName ) {
        this.fileName = fileName;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType( String mimeType ) {
        this.mimeType = mimeType;
    }

    public long getSize() {
        return size;
    }

    public void setSize( long size ) {
        this.size = size;
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent( byte[] content ) {
        this.content = content;
    }
}

