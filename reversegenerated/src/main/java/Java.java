import java.util.Date;
 
 
 public class Java {



	private Long id;	//  
	private String flightTaskId;	// 飞行任务ID 
	private Date logTm;	// 日志日期 
	private Date flightDate;	// 航班日期 
	private String flightNo;	// 航班号 
	private String planeNo;	// 机号 
	private String planeType;	// 机型 
	private String srcCity;	// 始发地 
	private String srcCityCode;	// 始发地代码 
	private String srcAirport;	// 始发地三字码 
	private String destCity;	// 目的地 
	private String destCityCode;	// 目的地代码 
	private String destAirport;	// 目的地三字码 
	private Date planStartTm;	// 计划起飞 
	private Date planEndTm;	// 计划到达 
	private Date actualStartTm;	// 实际起飞 
	private Date actualEndTm;	// 实际到达 
	private Integer startDelay;	// 起飞延误时长 
	private Integer endDelay;	// 落地延误时长 
	private Integer capacityState;	// 1未执行 2执行中 3已执行 
	private Integer cancelException;	// 取消异常  1是 2否 
	private String cancelCause;	// 取消原因 
	private String flightLoad;	// 航班业载 
	private String actualSpace;	// 实际舱位量 
	private String flightNature;	// 航班性质 
	private Double planSendWeight;	// 计划发货量 
	private Double actualSendWeight;	// 实际发货量 
	private Double planLoadRate;	// 计划装载率 
	private Double actualLoadRate;	// 实际装载率 
	private Double boxLoadRate;	// 板重装载率 
	private Integer deleteFlag;	// 删除标识 0 未删除,1 删除 
	private String creator;	// 创建人 
	private Date createTm;	// 创建时间 
	private String modifer;	// 修改人 
	private Date modifyTm;	// 修改时间 
	private Long versionNo;	// 版本号 
	private String flightType;	// 航班类型1国内 2国际 
	private String startArea;	// 始发地区 
	private String destArea;	// 目的地区 
	private Integer isDelay;	// 是否延误 1是 ，0否 
	private String delayCause;	// 延误原因 
	private String causeDesc;	// 延误描述 
	private String cancelDesc;	// 取消描述 
	private Integer loadPoll;	// 装载票数 
	private String startAreaName;	// 始发地区名称 
	private String destAreaName;	// 目的地区名称 
	private Double actualSendWeightNoempty;	// 实际发货量(不含空舱) 
	private Double actualLoadRateNoempty;	// 实际装载率(不含空舱) 
	private String exceptionTypes;	// 异常类型(若有多个异常类型，以“,”隔开)  1:延误异常 2:取消异常 3:备降异常 4:返航异常 5:拉货异常 6:提货异常 7:提前异常 8:其他异常 9:备一 10:备二 11:返一 12:返二 
	private String exceptionReasons;	// 异常原因(若有多个异常原因，以“,”隔开)  1:航空公司原因 2:机场原因 3:天气原因 4:我司原因 5:航班计划调整 6:其他 
	private String carNo;	// 车标号(多个车标“,”隔开) 
	private Double pullCargoWeight;	// 拉货重量 
	private Integer pullCargoNumber;	// 拉货件数 
	private Date cargoLastDate;	// 计划截载时间 
	private Date cargoActualDate;	// 实际截载时间 
	private Date planArriveBatchDt;	// 计划散货班次日期 
	private String deliveryBillBatchNo;	// 计划散货班次 
	private Date scheduledBulkFreightDt;	// 预计散货班次日期 
	private String scheduledBulkFreight;	// 预计散货班次 
	private Date actualBulkFreightShiftDt;	// 实际散货班次日期 
	private String actualBulkFreightShift;	// 实际散货班次 
	private Date plannedDeliveryTime;	// 计划提货开始时间 
	private Date plannedDeliveryEndTime;	// 计划提货结束时间 
	private Date actualBillTime;	// 实际提货开始时间 
	private Date actualBillEndTime;	// 实际提货结束时间 

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFlightTaskId() {
		return flightTaskId;
	}

	public void setFlightTaskId(String flightTaskId) {
		this.flightTaskId = flightTaskId;
	}

	public Date getLogTm() {
		return logTm;
	}

	public void setLogTm(Date logTm) {
		this.logTm = logTm;
	}

	public Date getFlightDate() {
		return flightDate;
	}

	public void setFlightDate(Date flightDate) {
		this.flightDate = flightDate;
	}

	public String getFlightNo() {
		return flightNo;
	}

	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}

	public String getPlaneNo() {
		return planeNo;
	}

	public void setPlaneNo(String planeNo) {
		this.planeNo = planeNo;
	}

	public String getPlaneType() {
		return planeType;
	}

	public void setPlaneType(String planeType) {
		this.planeType = planeType;
	}

	public String getSrcCity() {
		return srcCity;
	}

	public void setSrcCity(String srcCity) {
		this.srcCity = srcCity;
	}

	public String getSrcCityCode() {
		return srcCityCode;
	}

	public void setSrcCityCode(String srcCityCode) {
		this.srcCityCode = srcCityCode;
	}

	public String getSrcAirport() {
		return srcAirport;
	}

	public void setSrcAirport(String srcAirport) {
		this.srcAirport = srcAirport;
	}

	public String getDestCity() {
		return destCity;
	}

	public void setDestCity(String destCity) {
		this.destCity = destCity;
	}

	public String getDestCityCode() {
		return destCityCode;
	}

	public void setDestCityCode(String destCityCode) {
		this.destCityCode = destCityCode;
	}

	public String getDestAirport() {
		return destAirport;
	}

	public void setDestAirport(String destAirport) {
		this.destAirport = destAirport;
	}

	public Date getPlanStartTm() {
		return planStartTm;
	}

	public void setPlanStartTm(Date planStartTm) {
		this.planStartTm = planStartTm;
	}

	public Date getPlanEndTm() {
		return planEndTm;
	}

	public void setPlanEndTm(Date planEndTm) {
		this.planEndTm = planEndTm;
	}

	public Date getActualStartTm() {
		return actualStartTm;
	}

	public void setActualStartTm(Date actualStartTm) {
		this.actualStartTm = actualStartTm;
	}

	public Date getActualEndTm() {
		return actualEndTm;
	}

	public void setActualEndTm(Date actualEndTm) {
		this.actualEndTm = actualEndTm;
	}

	public Integer getStartDelay() {
		return startDelay;
	}

	public void setStartDelay(Integer startDelay) {
		this.startDelay = startDelay;
	}

	public Integer getEndDelay() {
		return endDelay;
	}

	public void setEndDelay(Integer endDelay) {
		this.endDelay = endDelay;
	}

	public Integer getCapacityState() {
		return capacityState;
	}

	public void setCapacityState(Integer capacityState) {
		this.capacityState = capacityState;
	}

	public Integer getCancelException() {
		return cancelException;
	}

	public void setCancelException(Integer cancelException) {
		this.cancelException = cancelException;
	}

	public String getCancelCause() {
		return cancelCause;
	}

	public void setCancelCause(String cancelCause) {
		this.cancelCause = cancelCause;
	}

	public String getFlightLoad() {
		return flightLoad;
	}

	public void setFlightLoad(String flightLoad) {
		this.flightLoad = flightLoad;
	}

	public String getActualSpace() {
		return actualSpace;
	}

	public void setActualSpace(String actualSpace) {
		this.actualSpace = actualSpace;
	}

	public String getFlightNature() {
		return flightNature;
	}

	public void setFlightNature(String flightNature) {
		this.flightNature = flightNature;
	}

	public Double getPlanSendWeight() {
		return planSendWeight;
	}

	public void setPlanSendWeight(Double planSendWeight) {
		this.planSendWeight = planSendWeight;
	}

	public Double getActualSendWeight() {
		return actualSendWeight;
	}

	public void setActualSendWeight(Double actualSendWeight) {
		this.actualSendWeight = actualSendWeight;
	}

	public Double getPlanLoadRate() {
		return planLoadRate;
	}

	public void setPlanLoadRate(Double planLoadRate) {
		this.planLoadRate = planLoadRate;
	}

	public Double getActualLoadRate() {
		return actualLoadRate;
	}

	public void setActualLoadRate(Double actualLoadRate) {
		this.actualLoadRate = actualLoadRate;
	}

	public Double getBoxLoadRate() {
		return boxLoadRate;
	}

	public void setBoxLoadRate(Double boxLoadRate) {
		this.boxLoadRate = boxLoadRate;
	}

	public Integer getDeleteFlag() {
		return deleteFlag;
	}

	public void setDeleteFlag(Integer deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public Date getCreateTm() {
		return createTm;
	}

	public void setCreateTm(Date createTm) {
		this.createTm = createTm;
	}

	public String getModifer() {
		return modifer;
	}

	public void setModifer(String modifer) {
		this.modifer = modifer;
	}

	public Date getModifyTm() {
		return modifyTm;
	}

	public void setModifyTm(Date modifyTm) {
		this.modifyTm = modifyTm;
	}

	public Long getVersionNo() {
		return versionNo;
	}

	public void setVersionNo(Long versionNo) {
		this.versionNo = versionNo;
	}

	public String getFlightType() {
		return flightType;
	}

	public void setFlightType(String flightType) {
		this.flightType = flightType;
	}

	public String getStartArea() {
		return startArea;
	}

	public void setStartArea(String startArea) {
		this.startArea = startArea;
	}

	public String getDestArea() {
		return destArea;
	}

	public void setDestArea(String destArea) {
		this.destArea = destArea;
	}

	public Integer getIsDelay() {
		return isDelay;
	}

	public void setIsDelay(Integer isDelay) {
		this.isDelay = isDelay;
	}

	public String getDelayCause() {
		return delayCause;
	}

	public void setDelayCause(String delayCause) {
		this.delayCause = delayCause;
	}

	public String getCauseDesc() {
		return causeDesc;
	}

	public void setCauseDesc(String causeDesc) {
		this.causeDesc = causeDesc;
	}

	public String getCancelDesc() {
		return cancelDesc;
	}

	public void setCancelDesc(String cancelDesc) {
		this.cancelDesc = cancelDesc;
	}

	public Integer getLoadPoll() {
		return loadPoll;
	}

	public void setLoadPoll(Integer loadPoll) {
		this.loadPoll = loadPoll;
	}

	public String getStartAreaName() {
		return startAreaName;
	}

	public void setStartAreaName(String startAreaName) {
		this.startAreaName = startAreaName;
	}

	public String getDestAreaName() {
		return destAreaName;
	}

	public void setDestAreaName(String destAreaName) {
		this.destAreaName = destAreaName;
	}

	public Double getActualSendWeightNoempty() {
		return actualSendWeightNoempty;
	}

	public void setActualSendWeightNoempty(Double actualSendWeightNoempty) {
		this.actualSendWeightNoempty = actualSendWeightNoempty;
	}

	public Double getActualLoadRateNoempty() {
		return actualLoadRateNoempty;
	}

	public void setActualLoadRateNoempty(Double actualLoadRateNoempty) {
		this.actualLoadRateNoempty = actualLoadRateNoempty;
	}

	public String getExceptionTypes() {
		return exceptionTypes;
	}

	public void setExceptionTypes(String exceptionTypes) {
		this.exceptionTypes = exceptionTypes;
	}

	public String getExceptionReasons() {
		return exceptionReasons;
	}

	public void setExceptionReasons(String exceptionReasons) {
		this.exceptionReasons = exceptionReasons;
	}

	public String getCarNo() {
		return carNo;
	}

	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}

	public Double getPullCargoWeight() {
		return pullCargoWeight;
	}

	public void setPullCargoWeight(Double pullCargoWeight) {
		this.pullCargoWeight = pullCargoWeight;
	}

	public Integer getPullCargoNumber() {
		return pullCargoNumber;
	}

	public void setPullCargoNumber(Integer pullCargoNumber) {
		this.pullCargoNumber = pullCargoNumber;
	}

	public Date getCargoLastDate() {
		return cargoLastDate;
	}

	public void setCargoLastDate(Date cargoLastDate) {
		this.cargoLastDate = cargoLastDate;
	}

	public Date getCargoActualDate() {
		return cargoActualDate;
	}

	public void setCargoActualDate(Date cargoActualDate) {
		this.cargoActualDate = cargoActualDate;
	}

	public Date getPlanArriveBatchDt() {
		return planArriveBatchDt;
	}

	public void setPlanArriveBatchDt(Date planArriveBatchDt) {
		this.planArriveBatchDt = planArriveBatchDt;
	}

	public String getDeliveryBillBatchNo() {
		return deliveryBillBatchNo;
	}

	public void setDeliveryBillBatchNo(String deliveryBillBatchNo) {
		this.deliveryBillBatchNo = deliveryBillBatchNo;
	}

	public Date getScheduledBulkFreightDt() {
		return scheduledBulkFreightDt;
	}

	public void setScheduledBulkFreightDt(Date scheduledBulkFreightDt) {
		this.scheduledBulkFreightDt = scheduledBulkFreightDt;
	}

	public String getScheduledBulkFreight() {
		return scheduledBulkFreight;
	}

	public void setScheduledBulkFreight(String scheduledBulkFreight) {
		this.scheduledBulkFreight = scheduledBulkFreight;
	}

	public Date getActualBulkFreightShiftDt() {
		return actualBulkFreightShiftDt;
	}

	public void setActualBulkFreightShiftDt(Date actualBulkFreightShiftDt) {
		this.actualBulkFreightShiftDt = actualBulkFreightShiftDt;
	}

	public String getActualBulkFreightShift() {
		return actualBulkFreightShift;
	}

	public void setActualBulkFreightShift(String actualBulkFreightShift) {
		this.actualBulkFreightShift = actualBulkFreightShift;
	}

	public Date getPlannedDeliveryTime() {
		return plannedDeliveryTime;
	}

	public void setPlannedDeliveryTime(Date plannedDeliveryTime) {
		this.plannedDeliveryTime = plannedDeliveryTime;
	}

	public Date getPlannedDeliveryEndTime() {
		return plannedDeliveryEndTime;
	}

	public void setPlannedDeliveryEndTime(Date plannedDeliveryEndTime) {
		this.plannedDeliveryEndTime = plannedDeliveryEndTime;
	}

	public Date getActualBillTime() {
		return actualBillTime;
	}

	public void setActualBillTime(Date actualBillTime) {
		this.actualBillTime = actualBillTime;
	}

	public Date getActualBillEndTime() {
		return actualBillEndTime;
	}

	public void setActualBillEndTime(Date actualBillEndTime) {
		this.actualBillEndTime = actualBillEndTime;
	}

}
