package com.awiki.models;

public class Imagen {
	private static long total = 1L;
	private Long id;
	private String url;
	private Integer listings_idlistings;
	private Integer listings_usuarios;
	
	public Imagen(String url, Integer listings_idlistings, Integer listings_usuarios) {
		
        this.url = url;
        this.listings_idlistings = listings_idlistings;
        this.listings_usuarios = listings_usuarios;
        this.id = total;
        total++;
        
	}// Constructor
	
	public Imagen() {
		this.id = total;
        total++;
    }
	
	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getListings_idlistings() {
        return listings_idlistings;
    }
    
    public void setListings_idlistings(Integer listings_idlistings) {
        this.listings_idlistings = listings_idlistings;
    }

    public Integer getListings_usuarios() {
        return listings_usuarios;
    }

    public void setListings_usuarios(Integer listings_usuarios) {
        this.listings_usuarios = listings_usuarios;
    }
    
 // toString()
    @Override
    public String toString() {
        return "Imagen{" +
                "id=" + id +
                ", url='" + url + '\'' +
                ", listings_idlistings=" + listings_idlistings +
                ", listings_usuarios=" + listings_usuarios +
                '}';
    }

}
