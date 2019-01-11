package com.jcex.totalinterface.Entity;





public class csd_invoice {

	/**
	 * 
  `invoice_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '发票ID，自增长',
  `order_id` int(10) NOT NULL DEFAULT '0' COMMENT '订单ID',
  `sku` varchar(100) DEFAULT NULL,
  `invoice_cnname` varchar(500) DEFAULT NULL COMMENT '发票中文名称',
  `invoice_enname` varchar(500) NOT NULL COMMENT '发票英文名称',
  `unit_code` char(3) DEFAULT NULL COMMENT '单位',
  `invoice_quantity` int(6) NOT NULL COMMENT '数量',
  `invoice_totalcharge` decimal(12,2) NOT NULL COMMENT '总金额。不提供单价列',
  `invoice_currencycode` char(3) DEFAULT NULL COMMENT '币种',
  `hs_code` varchar(10) DEFAULT NULL COMMENT '海关协制编号',
  `invoice_note` varchar(255) DEFAULT NULL COMMENT '配货信息',
  `invoice_url` varchar(255) DEFAULT NULL COMMENT '商品销售网址',
  `invoice_info` varchar(200) DEFAULT NULL COMMENT '配货信息',
  `categories_id` int(10) DEFAULT NULL,
  `net_weight` decimal(9,3) DEFAULT NULL COMMENT '重量',
  `invoice_material` varchar(255) DEFAULT NULL COMMENT '材质',
  `invoice_spec` varchar(255) DEFAULT NULL COMMENT '规格型号',
  `invoice_use` varchar(255) DEFAULT NULL COMMENT '用途',
	 */
	private static final long serialVersionUID = 1L;
	private Integer invoice_id;
	private Integer order_id;
	private String sku;
	private String invoice_cnname;
	private String invoice_enname;
	private String unit_code;
	private Integer invoice_quantity;
	private Double invoice_totalcharge;
	private String invoice_currencycode;
	private String hs_code;
	private String invoice_note;
	private String invoice_url;
	private String invoice_info;
	private Integer categories_id;
	private Double net_weight;
	private String invoice_material;
	private String invoice_spec;
	private String invoice_use;
	public Integer getInvoice_id() {
		return invoice_id;
	}
	public void setInvoice_id(Integer invoice_id) {
		this.invoice_id = invoice_id;
	}
	public Integer getOrder_id() {
		return order_id;
	}
	public void setOrder_id(Integer order_id) {
		this.order_id = order_id;
	}
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public String getInvoice_cnname() {
		return invoice_cnname;
	}
	public void setInvoice_cnname(String invoice_cnname) {
		this.invoice_cnname = invoice_cnname;
	}
	public String getInvoice_enname() {
		return invoice_enname;
	}
	public void setInvoice_enname(String invoice_enname) {
		this.invoice_enname = invoice_enname;
	}
	public String getUnit_code() {
		return unit_code;
	}
	public void setUnit_code(String unit_code) {
		this.unit_code = unit_code;
	}
	public Integer getInvoice_quantity() {
		return invoice_quantity;
	}
	public void setInvoice_quantity(Integer invoice_quantity) {
		this.invoice_quantity = invoice_quantity;
	}
	public Double getInvoice_totalcharge() {
		return invoice_totalcharge;
	}
	public void setInvoice_totalcharge(Double invoice_totalcharge) {
		this.invoice_totalcharge = invoice_totalcharge;
	}
	public String getInvoice_currencycode() {
		return invoice_currencycode;
	}
	public void setInvoice_currencycode(String invoice_currencycode) {
		this.invoice_currencycode = invoice_currencycode;
	}
	public String getHs_code() {
		return hs_code;
	}
	public void setHs_code(String hs_code) {
		this.hs_code = hs_code;
	}
	public String getInvoice_note() {
		return invoice_note;
	}
	public void setInvoice_note(String invoice_note) {
		this.invoice_note = invoice_note;
	}
	public String getInvoice_url() {
		return invoice_url;
	}
	public void setInvoice_url(String invoice_url) {
		this.invoice_url = invoice_url;
	}
	public String getInvoice_info() {
		return invoice_info;
	}
	public void setInvoice_info(String invoice_info) {
		this.invoice_info = invoice_info;
	}
	public Integer getCategories_id() {
		return categories_id;
	}
	public void setCategories_id(Integer categories_id) {
		this.categories_id = categories_id;
	}
	public Double getNet_weight() {
		return net_weight;
	}
	public void setNet_weight(Double net_weight) {
		this.net_weight = net_weight;
	}
	public String getInvoice_material() {
		return invoice_material;
	}
	public void setInvoice_material(String invoice_material) {
		this.invoice_material = invoice_material;
	}
	public String getInvoice_spec() {
		return invoice_spec;
	}
	public void setInvoice_spec(String invoice_spec) {
		this.invoice_spec = invoice_spec;
	}
	public String getInvoice_use() {
		return invoice_use;
	}
	public void setInvoice_use(String invoice_use) {
		this.invoice_use = invoice_use;
	}
	
}
