package com.tcs.edi.model.stop;

import java.util.logging.Logger;

import org.apache.camel.dataformat.bindy.annotation.DataField;
import org.apache.camel.dataformat.bindy.annotation.FixedLengthRecord;


@FixedLengthRecord(length=1000, paddingChar=' ',ignoreTrailingChars = true)
public class StopRecord {
	
	private static final Logger logger = Logger
			.getLogger(StopRecord.class.getName());
	
	public StopRecord() {
		logger.info("inside stop constructor");
		}   
	
	@DataField(pos = 1, length=2)
	private int dhcCoC;
	
	@DataField(pos = 3, length=30)
	private String dspI;
	
	@DataField(pos = 33, length=2)
	private int recordType;
	
	@DataField(pos = 35, length=3)
	private int stopNum;
	
	@DataField(pos = 38, length=2)
	private String stopStopC;
	
	@DataField(pos = 40, length=64)
	private String destI;
	
	@DataField(pos = 104, length=10)
	private int wtQ;
	
	@DataField(pos = 114, length = 8)
	private int cubeQ;
	
	@DataField(pos = 122, length = 7)
	private int ctnQ;
	
	@DataField(pos = 129, length =60)
	private String locName;
	
	@DataField(pos = 189, length = 7)
	private int locI;
	
	@DataField(pos = 196, length = 2)
	private int locOpI;
	
	@DataField(pos = 198, length = 55)
	private String address1;
	
	@DataField(pos = 253, length = 55)
	private String address2;
	
	@DataField(pos = 308, length = 30)
	private String cityN;
	
	@DataField(pos = 338, length = 2)
	private String stProvC;
	
	@DataField(pos = 340, length = 15)
	private String pstlC;
	
	@DataField(pos = 355, length = 3)
	private String countryN;
	
	@DataField(pos = 358, length = 60)
	private String contactN;
	
	@DataField(pos = 418, length = 3)
	private int contactTelArea;
	
	@DataField(pos = 421, length = 7)
	private long contactTelNum;
	
	@DataField(pos = 428, length = 5)
	private int contactTelExt;
	
	@DataField(pos = 433, length = 3)
	private int contactFaxArea;
	
	@DataField(pos = 436, length = 7)
	private int contactFaxNum;
	
	@DataField(pos = 443, length = 5)
	private int contactFaxExt;
	
	@DataField(pos = 448, length = 40)
	private String emailID;
	
	@DataField(pos = 488, length = 80)
	private String noteT;
	
	@DataField(pos = 568, length = 1)
	private String multDcFlag;
	
	@DataField(pos = 569, length = 2)
	private String vrmStopC;
	
	@DataField(pos = 571, length = 8)
	private int requestedDate;
	
	@DataField(pos = 579, length = 8)
	private int requestedTime;
	
	@DataField(pos = 587, length = 7)
	private int palletCount;

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

	public String getStopStopC() {
		return stopStopC;
	}

	public void setStopStopC(String stopStopC) {
		this.stopStopC = stopStopC;
	}

	public String getDestI() {
		return destI;
	}

	public void setDestI(String destI) {
		this.destI = destI;
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

	public String getLocName() {
		return locName;
	}

	public void setLocName(String locName) {
		this.locName = locName;
	}

	public int getLocI() {
		return locI;
	}

	public void setLocI(int locI) {
		this.locI = locI;
	}

	public int getLocOpI() {
		return locOpI;
	}

	public void setLocOpI(int locOpI) {
		this.locOpI = locOpI;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getCityN() {
		return cityN;
	}

	public void setCityN(String cityN) {
		this.cityN = cityN;
	}

	public String getStProvC() {
		return stProvC;
	}

	public void setStProvC(String stProvC) {
		this.stProvC = stProvC;
	}

	public String getPstlC() {
		return pstlC;
	}

	public void setPstlC(String pstlC) {
		this.pstlC = pstlC;
	}

	public String getCountryN() {
		return countryN;
	}

	public void setCountryN(String countryN) {
		this.countryN = countryN;
	}

	public String getContactN() {
		return contactN;
	}

	public void setContactN(String contactN) {
		this.contactN = contactN;
	}

	public int getContactTelArea() {
		return contactTelArea;
	}

	public void setContactTelArea(int contactTelArea) {
		this.contactTelArea = contactTelArea;
	}

	public long getContactTelNum() {
		return contactTelNum;
	}

	public void setContactTelNum(long contactTelNum) {
		this.contactTelNum = contactTelNum;
	}

	public int getContactTelExt() {
		return contactTelExt;
	}

	public void setContactTelExt(int contactTelExt) {
		this.contactTelExt = contactTelExt;
	}

	public int getContactFaxArea() {
		return contactFaxArea;
	}

	public void setContactFaxArea(int contactFaxArea) {
		this.contactFaxArea = contactFaxArea;
	}

	public int getContactFaxNum() {
		return contactFaxNum;
	}

	public void setContactFaxNum(int contactFaxNum) {
		this.contactFaxNum = contactFaxNum;
	}

	public int getContactFaxExt() {
		return contactFaxExt;
	}

	public void setContactFaxExt(int contactFaxExt) {
		this.contactFaxExt = contactFaxExt;
	}

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	public String getNoteT() {
		return noteT;
	}

	public void setNoteT(String noteT) {
		this.noteT = noteT;
	}

	public String getMultDcFlag() {
		return multDcFlag;
	}

	public void setMultDcFlag(String multDcFlag) {
		this.multDcFlag = multDcFlag;
	}

	public String getVrmStopC() {
		return vrmStopC;
	}

	public void setVrmStopC(String vrmStopC) {
		this.vrmStopC = vrmStopC;
	}

	public int getRequestedDate() {
		return requestedDate;
	}

	public void setRequestedDate(int requestedDate) {
		this.requestedDate = requestedDate;
	}

	public int getRequestedTime() {
		return requestedTime;
	}

	public void setRequestedTime(int requestedTime) {
		this.requestedTime = requestedTime;
	}

	public int getPalletCount() {
		return palletCount;
	}

	public void setPalletCount(int palletCount) {
		this.palletCount = palletCount;
	}
}
