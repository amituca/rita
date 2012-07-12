package com.example.mysqllitetest;

public class Obiectiv {
	
	
	private long id;
	private String denumire;
	
	private String categorie;
	private String detalii;
	private String judet;
	private String localitate;
	private String coordonate;
	private String coord_lat;
	private String coord_long;
	private int km_din_buc;
	private String vazut_f;
	private String vazut_aa;
	private String vazut_a2e;
	private String vazut_a1e;
	private String vazut_i;
	private String vazut_s;
	private String link_drumliber_ro;
	/**
	 * @return the denumire
	 */
	public String getDenumire() {
		return denumire;
	}

	/**
	 * @param denumire the denumire to set
	 */
	public void setDenumire(String denumire) {
		this.denumire = denumire;
	}

	/**
	 * @return the categorie
	 */
	public String getCategorie() {
		return categorie;
	}

	/**
	 * @param categorie the categorie to set
	 */
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

	/**
	 * @return the detalii
	 */
	public String getDetalii() {
		return detalii;
	}

	/**
	 * @param detalii the detalii to set
	 */
	public void setDetalii(String detalii) {
		this.detalii = detalii;
	}

	/**
	 * @return the judet
	 */
	public String getJudet() {
		return judet;
	}

	/**
	 * @param judet the judet to set
	 */
	public void setJudet(String judet) {
		this.judet = judet;
	}

	/**
	 * @return the localitate
	 */
	public String getLocalitate() {
		return localitate;
	}

	/**
	 * @param localitate the localitate to set
	 */
	public void setLocalitate(String localitate) {
		this.localitate = localitate;
	}

	/**
	 * @return the coordonate
	 */
	public String getCoordonate() {
		return coordonate;
	}

	/**
	 * @param coordonate the coordonate to set
	 */
	public void setCoordonate(String coordonate) {
		this.coordonate = coordonate;
	}

	/**
	 * @return the coord_lat
	 */
	public String getCoord_lat() {
		return coord_lat;
	}

	/**
	 * @param coord_lat the coord_lat to set
	 */
	public void setCoord_lat(String coord_lat) {
		this.coord_lat = coord_lat;
	}

	/**
	 * @return the coord_long
	 */
	public String getCoord_long() {
		return coord_long;
	}

	/**
	 * @param coord_long the coord_long to set
	 */
	public void setCoord_long(String coord_long) {
		this.coord_long = coord_long;
	}

	/**
	 * @return the km_din_buc
	 */
	public int getKm_din_buc() {
		return km_din_buc;
	}

	/**
	 * @param km_din_buc the km_din_buc to set
	 */
	public void setKm_din_buc(int km_din_buc) {
		this.km_din_buc = km_din_buc;
	}

	/**
	 * @return the vazut_f
	 */
	public String getVazut_f() {
		return vazut_f;
	}

	/**
	 * @param vazut_f the vazut_f to set
	 */
	public void setVazut_f(String vazut_f) {
		this.vazut_f = vazut_f;
	}

	/**
	 * @return the vazut_aa
	 */
	public String getVazut_aa() {
		return vazut_aa;
	}

	/**
	 * @param vazut_aa the vazut_aa to set
	 */
	public void setVazut_aa(String vazut_aa) {
		this.vazut_aa = vazut_aa;
	}

	/**
	 * @return the vazut_a2e
	 */
	public String getVazut_a2e() {
		return vazut_a2e;
	}

	/**
	 * @param vazut_a2e the vazut_a2e to set
	 */
	public void setVazut_a2e(String vazut_a2e) {
		this.vazut_a2e = vazut_a2e;
	}

	/**
	 * @return the vazut_a1e
	 */
	public String getVazut_a1e() {
		return vazut_a1e;
	}

	/**
	 * @param vazut_a1e the vazut_a1e to set
	 */
	public void setVazut_a1e(String vazut_a1e) {
		this.vazut_a1e = vazut_a1e;
	}

	/**
	 * @return the vazut_i
	 */
	public String getVazut_i() {
		return vazut_i;
	}

	/**
	 * @param vazut_i the vazut_i to set
	 */
	public void setVazut_i(String vazut_i) {
		this.vazut_i = vazut_i;
	}

	/**
	 * @return the vazut_s
	 */
	public String getVazut_s() {
		return vazut_s;
	}

	/**
	 * @param vazut_s the vazut_s to set
	 */
	public void setVazut_s(String vazut_s) {
		this.vazut_s = vazut_s;
	}

	/**
	 * @return the link_drumliber_ro
	 */
	public String getLink_drumliber_ro() {
		return link_drumliber_ro;
	}

	/**
	 * @param link_drumliber_ro the link_drumliber_ro to set
	 */
	public void setLink_drumliber_ro(String link_drumliber_ro) {
		this.link_drumliber_ro = link_drumliber_ro;
	}

	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	// Will be used by the ArrayAdapter in the ListView
	@Override
	public String toString() {
		return denumire + detalii;
	}

}
