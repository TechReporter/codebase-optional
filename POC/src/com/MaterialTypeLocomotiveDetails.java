/**
 * 
 */
package com;

import javax.xml.datatype.XMLGregorianCalendar;

/**
 * @author 212720190
 * @date Mar 28, 2019
 */
public class MaterialTypeLocomotiveDetails {
	private Long locoConfigId;
	private Long locomotiveId;
	private XMLGregorianCalendar coScheduleDate;
	
	public MaterialTypeLocomotiveDetails(Long locoConfigId, Long locomotiveId, XMLGregorianCalendar coScheduleDate) {
		this.locoConfigId = locoConfigId;
		this.locomotiveId = locomotiveId;
		this.coScheduleDate = coScheduleDate;
	}
	public Long getLocoConfigId() {
		return locoConfigId;
	}
	public void setLocoConfigId(Long locoConfigId) {
		this.locoConfigId = locoConfigId;
	}
	public Long getLocomotiveId() {
		return locomotiveId;
	}
	public void setLocomotiveId(Long locomotiveId) {
		this.locomotiveId = locomotiveId;
	}
	public XMLGregorianCalendar getCoScheduleDate() {
		return coScheduleDate;
	}
	public void setCoScheduleDate(XMLGregorianCalendar coScheduleDate) {
		this.coScheduleDate = coScheduleDate;
	}
	@Override
	public String toString() {
		return "MaterialTypeLocomotiveDetails [locoConfigId=" + locoConfigId + ", locomotiveId=" + locomotiveId
				+ ", coScheduleDate=" + coScheduleDate + "]";
	}
}
