package com.example.demo.data.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 门店
 */
public class REPCrmStore {

	/**
	 * 门店id
	 */
	private Integer id;

	/**
	 * 门店编号
	 */
	private String storeNo;

	/**
	 * 门店名称
	 */
	private String name;

	/**
	 * 城市编号
	 */
	private String cityNo;

	/**
	 * 地址
	 */
	private String address;

	/**
	 * 创建者id
	 */
	private Integer userCreate;

	/**
	 * 门店状态
	 */
	private Integer storeStatus;

	/**
	 * 创建日期
	 */
	private Date dateCreate;

	/**
	 * 地址明细
	 */
	private String addressDetail;

	/**
	 * 门店维护人
	 */
	private String maintainer;

	/**
	 * 门店联系人
	 */
	private String contacts;

	/**
	 * 维护人姓名
	 */
	private String maintainerName;

	/**
	 * 门店装修状态
	 */
	private Integer decorationState;

	/**
	 * 门店保证金
	 */
	private BigDecimal deposit;

	/**
	 * 装修翻牌费1
	 */
	private BigDecimal decoractionFeeOne;

	/**
	 * 装修翻牌费2
	 */
	private BigDecimal decoractionFeeTwo;

	/**
	 * 装修翻牌费支付日期1
	 */
	private Date datePayDcrtFeeOne;

	/**
	 * 装修翻牌费支付日期2
	 */
	private Date datePayDcrtFeeTwo;

	/**
	 * 装修翻牌费请款单号1
	 */
	private String pleasePayNoOne;

	/**
	 * 装修翻牌费请款单号2
	 */
	private String pleasePayNoTwo;

	/**
	 * 到账日期
	 */
	private Date dateAccountDeposit;

	/**
	 * 装修公司名称
	 */
	private String decorationCompNm;

	/**
	 * 装修合同会签单号
	 */
	private String decorationContractNo;

	/**
	 * 装修发票开具日期
	 */
	private Date dateDecorationBill;

	/**
	 * OA翻牌验收单号
	 */
	private String oaFlopNo;

	/**
	 * 翻牌验收通过日期
	 */
	private Date dateFlopCkAccept;
	
	/**
	 * 区域编码
	 */
	private String districtNo;
	
	/**
	 * 创建人姓名
	 */
	private String userName;
	
	/**
	 * 创建人工号
	 */
	private String userCode;
	
	/**
	 * 门店资质
	 */
	private Integer ABTypeStore;
	
	/**
	 * 门店乙类资质等级
	 */
	private String  BTypeStore;

	/**
	 * 获取门店id
	 * @return 门店id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * 设置门店id
	 * @param id 门店id
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * 获取门店编号
	 * @return 门店编号
	 */
	public String getStoreNo() {
		return storeNo;
	}

	/**
	 * 设置门店编号
	 * @param storeNo 门店编号
	 */
	public void setStoreNo(String storeNo) {
		this.storeNo = storeNo;
	}

	/**
	 * 获取门店名称
	 * @return 门店名称
	 */
	public String getName() {
		return name;
	}

	/**
	 * 设置门店名称
	 * @param name 门店名称
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 获取城市编号
	 * @return 城市编号
	 */
	public String getCityNo() {
		return cityNo;
	}

	/**
	 * 设置城市编号
	 * @param cityNo 城市编号
	 */
	public void setCityNo(String cityNo) {
		this.cityNo = cityNo;
	}

	/**
	 * 获取地址
	 * @return 地址
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * 设置地址
	 * @param address 地址
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * 获取创建者id
	 * @return 创建者id
	 */
	public Integer getUserCreate() {
		return userCreate;
	}

	/**
	 * 设置创建者id
	 * @param userCreate 创建者id
	 */
	public void setUserCreate(Integer userCreate) {
		this.userCreate = userCreate;
	}

	/**
	 * 获取门店状态
	 * @return 门店状态
	 */
	public Integer getStoreStatus() {
		return storeStatus;
	}

	/**
	 * 设置门店状态
	 * @param storeStatus 门店状态
	 */
	public void setStoreStatus(Integer storeStatus) {
		this.storeStatus = storeStatus;
	}

	/**
	 * 获取创建日期
	 * @return 创建日期
	 */
	public Date getDateCreate() {
		return dateCreate;
	}

	/**
	 * 设置创建日期
	 * @param dateCreate 创建日期
	 */
	public void setDateCreate(Date dateCreate) {
		this.dateCreate = dateCreate;
	}

	/**
	 * 获取地址明细
	 * @return 地址明细
	 */
	public String getAddressDetail() {
		return addressDetail;
	}

	/**
	 * 设置地址明细
	 * @param addressDetail 地址明细
	 */
	public void setAddressDetail(String addressDetail) {
		this.addressDetail = addressDetail;
	}

	/**
	 * 获取门店维护人
	 * @return 门店维护人
	 */
	public String getMaintainer() {
		return maintainer;
	}

	/**
	 * 设置门店维护人
	 * @param maintainer 门店维护人
	 */
	public void setMaintainer(String maintainer) {
		this.maintainer = maintainer;
	}

	/**
	 * 获取门店联系人
	 * @return 门店联系人
	 */
	public String getContacts() {
		return contacts;
	}

	/**
	 * 设置门店联系人
	 * @param contacts 门店联系人
	 */
	public void setContacts(String contacts) {
		this.contacts = contacts;
	}

	/**
	 * 获取维护人姓名
	 * @return 维护人姓名
	 */
	public String getMaintainerName() {
		return maintainerName;
	}

	/**
	 * 设置维护人姓名
	 * @param maintainerName 维护人姓名
	 */
	public void setMaintainerName(String maintainerName) {
		this.maintainerName = maintainerName;
	}

	/**
	 * 获取门店装修状态
	 * @return 门店装修状态
	 */
	public Integer getDecorationState() {
		return decorationState;
	}

	/**
	 * 设置门店装修状态
	 * @param decorationState 门店装修状态
	 */
	public void setDecorationState(Integer decorationState) {
		this.decorationState = decorationState;
	}

	/**
	 * 获取门店保证金
	 * @return 门店保证金
	 */
	public BigDecimal getDeposit() {
		return deposit;
	}

	/**
	 * 设置门店保证金
	 * @param deposit 门店保证金
	 */
	public void setDeposit(BigDecimal deposit) {
		this.deposit = deposit;
	}

	/**
	 * 获取装修翻牌费1
	 * @return 装修翻牌费1
	 */
	public BigDecimal getDecoractionFeeOne() {
		return decoractionFeeOne;
	}

	/**
	 * 设置装修翻牌费1
	 * @param decoractionFeeOne 装修翻牌费1
	 */
	public void setDecoractionFeeOne(BigDecimal decoractionFeeOne) {
		this.decoractionFeeOne = decoractionFeeOne;
	}

	/**
	 * 获取装修翻牌费2
	 * @return 装修翻牌费2
	 */
	public BigDecimal getDecoractionFeeTwo() {
		return decoractionFeeTwo;
	}

	/**
	 * 设置装修翻牌费2
	 * @param decoractionFeeTwo 装修翻牌费2
	 */
	public void setDecoractionFeeTwo(BigDecimal decoractionFeeTwo) {
		this.decoractionFeeTwo = decoractionFeeTwo;
	}

	/**
	 * 获取装修翻牌费支付日期1
	 * @return 装修翻牌费支付日期1
	 */
	public Date getDatePayDcrtFeeOne() {
		return datePayDcrtFeeOne;
	}

	/**
	 * 设置装修翻牌费支付日期1
	 * @param datePayDcrtFeeOne 装修翻牌费支付日期1
	 */
	public void setDatePayDcrtFeeOne(Date datePayDcrtFeeOne) {
		this.datePayDcrtFeeOne = datePayDcrtFeeOne;
	}

	/**
	 * 获取装修翻牌费支付日期2
	 * @return 装修翻牌费支付日期2
	 */
	public Date getDatePayDcrtFeeTwo() {
		return datePayDcrtFeeTwo;
	}

	/**
	 * 设置装修翻牌费支付日期2
	 * @param datePayDcrtFeeTwo 装修翻牌费支付日期2
	 */
	public void setDatePayDcrtFeeTwo(Date datePayDcrtFeeTwo) {
		this.datePayDcrtFeeTwo = datePayDcrtFeeTwo;
	}

	/**
	 * 获取装修翻牌费请款单号1
	 * @return 装修翻牌费请款单号1
	 */
	public String getPleasePayNoOne() {
		return pleasePayNoOne;
	}

	/**
	 * 设置装修翻牌费请款单号1
	 * @param pleasePayNoOne 装修翻牌费请款单号1
	 */
	public void setPleasePayNoOne(String pleasePayNoOne) {
		this.pleasePayNoOne = pleasePayNoOne;
	}

	/**
	 * 获取装修翻牌费请款单号2
	 * @return 装修翻牌费请款单号2
	 */
	public String getPleasePayNoTwo() {
		return pleasePayNoTwo;
	}

	/**
	 * 设置装修翻牌费请款单号2
	 * @param pleasePayNoTwo 装修翻牌费请款单号2
	 */
	public void setPleasePayNoTwo(String pleasePayNoTwo) {
		this.pleasePayNoTwo = pleasePayNoTwo;
	}

	/**
	 * 获取到账日期
	 * @return 到账日期
	 */
	public Date getDateAccountDeposit() {
		return dateAccountDeposit;
	}

	/**
	 * 设置到账日期
	 * @param dateAccountDeposit 到账日期
	 */
	public void setDateAccountDeposit(Date dateAccountDeposit) {
		this.dateAccountDeposit = dateAccountDeposit;
	}

	/**
	 * 获取装修公司名称
	 * @return 装修公司名称
	 */
	public String getDecorationCompNm() {
		return decorationCompNm;
	}

	/**
	 * 设置装修公司名称
	 * @param decorationCompNm 装修公司名称
	 */
	public void setDecorationCompNm(String decorationCompNm) {
		this.decorationCompNm = decorationCompNm;
	}

	/**
	 * 获取装修合同会签单号
	 * @return 装修合同会签单号
	 */
	public String getDecorationContractNo() {
		return decorationContractNo;
	}

	/**
	 * 设置装修合同会签单号
	 * @param decorationContractNo 装修合同会签单号
	 */
	public void setDecorationContractNo(String decorationContractNo) {
		this.decorationContractNo = decorationContractNo;
	}

	/**
	 * 获取装修发票开具日期
	 * @return 装修发票开具日期
	 */
	public Date getDateDecorationBill() {
		return dateDecorationBill;
	}

	/**
	 * 设置装修发票开具日期
	 * @param dateDecorationBill 装修发票开具日期
	 */
	public void setDateDecorationBill(Date dateDecorationBill) {
		this.dateDecorationBill = dateDecorationBill;
	}

	/**
	 * 获取OA翻牌验收单号
	 * @return OA翻牌验收单号
	 */
	public String getOaFlopNo() {
		return oaFlopNo;
	}

	/**
	 * 设置OA翻牌验收单号
	 * @param oaFlopNo OA翻牌验收单号
	 */
	public void setOaFlopNo(String oaFlopNo) {
		this.oaFlopNo = oaFlopNo;
	}

	/**
	 * 获取翻牌验收通过日期
	 * @return 翻牌验收通过日期
	 */
	public Date getDateFlopCkAccept() {
		return dateFlopCkAccept;
	}

	/**
	 * 设置翻牌验收通过日期
	 * @param dateFlopCkAccept 翻牌验收通过日期
	 */
	public void setDateFlopCkAccept(Date dateFlopCkAccept) {
		this.dateFlopCkAccept = dateFlopCkAccept;
	}

	/**
	 * 获取区域编码
	 * @return 区域编码
	 */
	public String getDistrictNo() {
		return districtNo;
	}

	/**
	 * 设置区域编码
	 * @param districtNo 区域编码
	 */
	public void setDistrictNo(String districtNo) {
		this.districtNo = districtNo;
	}

	/**
	 * 获取创建人姓名
	 * @return 创建人姓名
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * 设置创建人姓名
	 * @param userName 创建人姓名
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * 获取创建人工号
	 * @return 创建人工号
	 */
	public String getUserCode() {
		return userCode;
	}

	/**
	 * 设置创建人工号
	 * @param userCode 创建人工号
	 */
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	/**
	 * 获取门店资质
	 * @return 门店资质
	 */
	public Integer getABTypeStore() {
		return ABTypeStore;
	}

	/**
	 * 设置门店资质
	 * @param aBTypeStore 门店资质
	 */
	public void setABTypeStore(Integer aBTypeStore) {
		ABTypeStore = aBTypeStore;
	}

	/**
	 * 获取门店乙类资质等级
	 * @return 门店乙类资质等级
	 */
	public String getBTypeStore() {
		return BTypeStore;
	}

	/**
	 * 设置门店乙类资质等级
	 * @param bTypeStore 门店乙类资质等级
	 */
	public void setBTypeStore(String bTypeStore) {
		BTypeStore = bTypeStore;
	}
	
}
