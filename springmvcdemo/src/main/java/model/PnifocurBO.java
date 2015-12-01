package model;
import javax.persistence.Column;
import javax.persistence.Entity;
/**
 * Created by 齐宇 on 2015/11/27.
 */
@Entity
public class PnifocurBO {
    @Column(name="vendor_bn")
    private String vendor_bn;
    @Column(name="inventorylock")
    private String inventorylock;
    @Column(name="rejectiontext")
    private String rejectiontext;
    @Column(name="supplier")
    private String supplier;
    @Column(name="pn_class")
    private String pn_class;
    @Column(name="priceeach")
    private String priceeach;
    @Column(name="stock")
    private String stock;
    @Column(name="owner")
    private String owner;
    @Column(name="rejectcode")
    private String rejectcode;
    @Column(name="expirydate")
    private String expirydate;
    @Column(name="relation")
    private String relation;
    @Column(name="reserved_qty")
    private String reserved_qty;
    @Column(name="orderid")
    private String orderid;
    @Column(name="serialized")
    private String serialized;
    @Column(name="bn")
    private String bn;
    @Column(name="qty")
    private String qty;
    @Column(name="ordertype")
    private String ordertype;
    @Column(name="coc")
    private String coc;
    @Column(name="acc_date")
    private String acc_date;
    @Column(name="partid")
    private String partid;
    @Column(name="orderstate")
    private String orderstate;
    @Column(name="partalttype")
    private String partalttype;
    @Column(name="orderno")
    private String orderno;
    @Column(name="location")
    private String location;
    @Column(name="pn")
    private String pn;
    @Column(name="pn_level")
    private String pn_level;
    @Column(name="storageunit")
    private String storageunit;
    @Column(name="organisation")
    private String organisation;
    @Column(name="vendor")
    private String vendor;

    public String getVendor_bn() {
        return vendor_bn;
    }

    public void setVendor_bn(String vendor_bn) {
        this.vendor_bn = vendor_bn;
    }

    public String getInventorylock() {
        return inventorylock;
    }

    public void setInventorylock(String inventorylock) {
        this.inventorylock = inventorylock;
    }

    public String getRejectiontext() {
        return rejectiontext;
    }

    public void setRejectiontext(String rejectiontext) {
        this.rejectiontext = rejectiontext;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getPn_class() {
        return pn_class;
    }

    public void setPn_class(String pn_class) {
        this.pn_class = pn_class;
    }

    public String getPriceeach() {
        return priceeach;
    }

    public void setPriceeach(String priceeach) {
        this.priceeach = priceeach;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getRejectcode() {
        return rejectcode;
    }

    public void setRejectcode(String rejectcode) {
        this.rejectcode = rejectcode;
    }

    public String getExpirydate() {
        return expirydate;
    }

    public void setExpirydate(String expirydate) {
        this.expirydate = expirydate;
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    public String getReserved_qty() {
        return reserved_qty;
    }

    public void setReserved_qty(String reserved_qty) {
        this.reserved_qty = reserved_qty;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public String getSerialized() {
        return serialized;
    }

    public void setSerialized(String serialized) {
        this.serialized = serialized;
    }

    public String getBn() {
        return bn;
    }

    public void setBn(String bn) {
        this.bn = bn;
    }

    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }

    public String getOrdertype() {
        return ordertype;
    }

    public void setOrdertype(String ordertype) {
        this.ordertype = ordertype;
    }

    public String getCoc() {
        return coc;
    }

    public void setCoc(String coc) {
        this.coc = coc;
    }

    public String getAcc_date() {
        return acc_date;
    }

    public void setAcc_date(String acc_date) {
        this.acc_date = acc_date;
    }

    public String getPartid() {
        return partid;
    }

    public void setPartid(String partid) {
        this.partid = partid;
    }

    public String getOrderstate() {
        return orderstate;
    }

    public void setOrderstate(String orderstate) {
        this.orderstate = orderstate;
    }

    public String getPartalttype() {
        return partalttype;
    }

    public void setPartalttype(String partalttype) {
        this.partalttype = partalttype;
    }

    public String getOrderno() {
        return orderno;
    }

    public void setOrderno(String orderno) {
        this.orderno = orderno;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPn() {
        return pn;
    }

    public void setPn(String pn) {
        this.pn = pn;
    }

    public String getPn_level() {
        return pn_level;
    }

    public void setPn_level(String pn_level) {
        this.pn_level = pn_level;
    }

    public String getStorageunit() {
        return storageunit;
    }

    public void setStorageunit(String storageunit) {
        this.storageunit = storageunit;
    }

    public String getOrganisation() {
        return organisation;
    }

    public void setOrganisation(String organisation) {
        this.organisation = organisation;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

}
