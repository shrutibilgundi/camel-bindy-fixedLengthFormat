package com.tcs.edi.model.header;

import java.util.logging.Logger;

import org.apache.camel.dataformat.bindy.annotation.DataField;
import org.apache.camel.dataformat.bindy.annotation.FixedLengthRecord;


@FixedLengthRecord(length=1000, paddingChar=' ',ignoreTrailingChars = true)
public class HeaderRecord {
	
	private static final Logger logger = Logger
			.getLogger(HeaderRecord.class.getName());
	
	public HeaderRecord() {
		logger.info("inside header constructor");
		}   
	
	@DataField(pos = 1, length=2)
	private int dhcCoC;
	
	@DataField(pos = 3, length=30)
	private String dspI;
	
	@DataField(pos = 33, length=2)
	private int recordType;
	
	@DataField(pos = 35, length=2)
	private int stopNum;
	
	@DataField(pos = 37, length=12)
	private String dspTypeC;
	
	@DataField(pos = 49, length=15)
	private String trlrTypeC;
	
	@DataField(pos = 64, length=4)
	private String scacC;
	
	@DataField(pos = 68, length=2)
	private String modeC;
	
	@DataField(pos = 70, length=10)
	private int wtQ;
	
	@DataField(pos = 80, length=8)
	private int cubeQ;
	
	@DataField(pos = 88, length=8)
	private int ctnQ;
	
	@DataField(pos = 96, length=8)
	private int pkupDate;
	
	@DataField(pos =104, length=4)
	private int pkupTime;
	
	@DataField(pos = 108, length=1)
	private String retenderF;
	
	@DataField(pos = 109, length=80)
	private String notes;
	
	@DataField(pos = 189, length=4)
	private int destI;
	
	@DataField(pos = 193, length=50)
	private String proI;
	
	@DataField(pos = 243, length=8)
	private int respondByDate;
	
	@DataField(pos = 251, length=8)
	private int respondByTime;
	
	@DataField(pos = 259, length=3)
	private String temperatureCode;
	
	@DataField(pos = 262, length=5)
	private String minTemperature;
	
	@DataField(pos = 267, length=5)
	private String maxTemperature;
	
	@DataField(pos = 272, length=3)
	private int palletCount;
	
	@DataField(pos = 275, length=3)
	private String referenceCode;
	
	@DataField(pos = 278, length=2)
	private double chargeAmount;

	public int getDhcCoC() {
		return dhcCoC;
	}

	public void setDhcCoC(int dhcCoC) {
		this.dhcCoC = dhcCoC;
	}

	public String getDspI() {
		return dspI;
	}

	public void setDspI(String dspI) {
		this.dspI = dspI;
	}

	public int getRecordType() {
		return recordType;
	}

	public void setRecordType(int recordType) {
		this.recordType = recordType;
	}

	public int getStopNum() {
		return stopNum;
	}

	public void setStopNum(int stopNum) {
		this.stopNum = stopNum;
	}

	public String getDspTypeC() {
		return dspTypeC;
	}

	public void setDspTypeC(String dspTypeC) {
		this.dspTypeC = dspTypeC;
	}

	public String getTrlrTypeC() {
		return trlrTypeC;
	}

	public void setTrlrTypeC(String trlrTypeC) {
		this.trlrTypeC = trlrTypeC;
	}

	public String getScacC() {
		return scacC;
	}

	public void setScacC(String scacC) {
		this.scacC = scacC;
	}

	public String getModeC() {
		return modeC;
	}

	public void setModeC(String modeC) {
		this.modeC = modeC;
	}

	public int getWtQ() {
		return wtQ;
	}

	public void setWtQ(int wtQ) {
		this.wtQ = wtQ;
	}

	public int getCubeQ() {
		return cubeQ;
	}

	public void setCubeQ(int cubeQ) {
		this.cubeQ = cubeQ;
	}

	public int getCtnQ() {
		return ctnQ;
	}

	public void setCtnQ(int ctnQ) {
		this.ctnQ = ctnQ;
	}

	public int getPkupDate() {
		return pkupDate;
	}

	public void setPkupDate(int pkupDate) {
		this.pkupDate = pkupDate;
	}

	public int getPkupTime() {
		return pkupTime;
	}

	public void setPkupTime(int pkupTime) {
		this.pkupTime = pkupTime;
	}

	public String getRetenderF() {
		return retenderF;
	}

	public void setRetenderF(String retenderF) {
		this.retenderF = retenderF;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public int getDestI() {
		return destI;
	}

	public void setDestI(int destI) {
		this.destI = destI;
	}

	public String getProI() {
		return proI;
	}

	public void setProI(String proI) {
		this.proI = proI;
	}

	public int getRespondByDate() {
		return respondByDate;
	}

	public void setRespondByDate(int respondByDate) {
		this.respondByDate = respondByDate;
	}

	public int getRespondByTime() {
		return respondByTime;
	}

	public void setRespondByTime(int respondByTime) {
		this.respondByTime = respondByTime;
	}

	public String getTemperatureCode() {
		return temperatureCode;
	}

	public void setTemperatureCode(String temperatureCode) {
		this.temperatureCode = temperatureCode;
	}

	public String getMinTemperature() {
		return minTemperature;
	}

	public void setMinTemperature(String minTemperature) {
		this.minTemperature = minTemperature;
	}

	public String getMaxTemperature() {
		return maxTemperature;
	}

	public void setMaxTemperature(String maxTemperature) {
		this.maxTemperature = maxTemperature;
	}

	public int getPalletCount() {
		return palletCount;
	}

	public void setPalletCount(int palletCount) {
		this.palletCount = palletCount;
	}

	public String getReferenceCode() {
		return referenceCode;
	}

	public void setReferenceCode(String referenceCode) {
		this.referenceCode = referenceCode;
	}

	public double getChargeAmount() {
		return chargeAmount;
	}

	public void setChargeAmount(double chargeAmount) {
		this.chargeAmount = chargeAmount;
	}
	
	
}

